package abdelfattah.holyquran;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Random;

public class PlayActivity extends AppCompatActivity {

    private static final String REMAINING_TIME = "REMAINING_TIME";
    private static final String IS_PLAYING = "IS_PLAYING";
    private static final String IS_PLAYING_RANDOM = "IS_PLAYING_RANDOM";
    private static final String CURRENT_Surah_POS = "CURRENT_Surah_POS";

    // Interval to refresh the countDownTimer in milliseconds
    private final long TIMER_INTERVAL = 1000;
    private TextView elapsedTimeTV;
    private TextView remainingTimeTV;
    private ListView listLV;
    private ImageView playStopIV;
    private SeekBar seekBar;
    private ImageView randomIV;
    private ArrayList<Surah> surah;
    private Surah currentSurah;
    private boolean isPlaying;
    private long remainingTime;
    private boolean isPlayingRandom;
    private Random random;
    private MediaPlayer mediaPlayer;

    private CountDownTimer countDownTimer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_play );

        // For the up navigation
        ActionBar actionBar = getSupportActionBar ();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled ( true );
        }

        // Get all the necessary views
        elapsedTimeTV = findViewById ( R.id.elapsedTime );
        remainingTimeTV = findViewById ( R.id.remainingTime );
        ImageView coverIV = findViewById ( R.id.cover );
        playStopIV = findViewById ( R.id.playStopIcon );
        seekBar = findViewById ( R.id.seekBar );
        ImageView nextIconIV = findViewById ( R.id.nextIcon );
        ImageView previousIconIV = findViewById ( R.id.previousIcon );
        ImageView replayIV = findViewById ( R.id.replayIcon );
        randomIV = findViewById ( R.id.randomIcon );

        // Get the information from the intent
        Intent intent = getIntent ();
        Album selectedAlbum = (Album) intent.getSerializableExtra ( MainActivity.SELECTED_ALBUM );
        Sheikh selectedSheikh = (Sheikh) intent.getSerializableExtra ( MainActivity.SELECTED_Sheikh );

        // Init variables
        currentSurah = null;
        isPlaying = false;
        countDownTimer = initCountDownTimer ( 0 );
        isPlayingRandom = false;
        random = new Random ();
        mediaPlayer = null;

        int currentSurahPos = 0;
        if (savedInstanceState != null) {
            currentSurahPos = savedInstanceState.getInt ( CURRENT_Surah_POS );
        }

        // Get all the surah to be played, depending if we have an album or an Sheikh
        if (selectedAlbum != null) {
            surah = selectedAlbum.getSurah ();

            setTitle ( selectedAlbum.getName () );

            coverIV.setImageResource ( getResources ().getIdentifier (
                    selectedAlbum.getCover (), "drawable", getPackageName () ) );

        } else if (selectedSheikh != null) {
            surah = new ArrayList<> ();

            for (Album album : selectedSheikh.getAlbums ()) {
                surah.addAll ( album.getSurah () );
            }

            setTitle ( selectedSheikh.getName () );

            coverIV.setImageResource ( getResources ().getIdentifier (
                    selectedSheikh.getPhoto (), "drawable", getPackageName () ) );

        }

        // Fill the list of surah
        listLV = findViewById ( R.id.list );
        SurahAdapter surahAdapter = new SurahAdapter ( this, surah );
        listLV.setAdapter ( surahAdapter );
        listLV.setChoiceMode ( AbsListView.CHOICE_MODE_SINGLE );

        selectSurah ( (Surah) listLV.getItemAtPosition ( currentSurahPos ) );

        // Set the listeners
        listLV.setOnItemClickListener ( new AdapterView.OnItemClickListener () {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                selectSurah ( (Surah) parent.getItemAtPosition ( position ) );
                view.setSelected ( true );
            }
        } );

        playStopIV.setOnClickListener ( new View.OnClickListener () {
            /**
             * Called when a view has been clicked.
             *
             * @param v The view that was clicked.
             */
            @Override
            public void onClick(View v) {
                playPause ();
            }
        } );

        seekBar.setOnSeekBarChangeListener ( new SeekBar.OnSeekBarChangeListener () {
            /**
             * Notification that the progress level has changed. Clients can use the fromUser parameter
             * to distinguish user-initiated changes from those that occurred programmatically.
             *
             * @param seekBar  The SeekBar whose progress has changed
             * @param progress The current progress level.
             * @param fromUser True if the progress change was initiated by the user.
             */
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                // Refresh the time displayed
                remainingTime = (currentSurah.getDuration () - seekBar.getProgress ())
                                * TIMER_INTERVAL;
                refreshTime ();

            }

            /**
             * Notification that the user has started a touch gesture. Clients may want to use this
             * to disable advancing the seekbar.
             *
             * @param seekBar The SeekBar in which the touch gesture began
             */
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                countDownTimer.cancel ();
            }

            /**
             * Notification that the user has finished a touch gesture. Clients may want to use this
             * to re-enable advancing the seekbar.
             *
             * @param seekBar The SeekBar in which the touch gesture began
             */
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                countDownTimer = initCountDownTimer ( (
                                                              currentSurah.getDuration () -
                                                              seekBar.getProgress ()
                                                      ) * TIMER_INTERVAL );
                countDownTimer.onTick ( remainingTime );

                // seek function doesn't works
                if (mediaPlayer != null && isPlaying) {
                    if (Build.VERSION.SDK_INT >= 26) {
                        mediaPlayer.seekTo ( seekBar.getProgress () * 1000, MediaPlayer.SEEK_CLOSEST );
                    } else {
                        mediaPlayer.seekTo ( seekBar.getProgress () * 1000 );
                    }
                }

                if (isPlaying) {
                    countDownTimer.start ();
                }
            }
        } );

        nextIconIV.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                nextSurah ();
            }
        } );

        previousIconIV.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                previousSurah ();
            }
        } );

        replayIV.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                selectSurah ( currentSurah );
            }
        } );

        randomIV.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                if (isPlayingRandom) {
                    randomIV.setImageResource ( R.drawable.ic_shuffle );
                } else {
                    randomIV.setImageResource ( R.drawable.ic_dehaze );
                }
                isPlayingRandom = !isPlayingRandom;
            }
        } );

        if (savedInstanceState != null) {
            remainingTime = savedInstanceState.getLong ( REMAINING_TIME );
            countDownTimer = initCountDownTimer ( remainingTime );

            isPlayingRandom = savedInstanceState.getBoolean ( IS_PLAYING_RANDOM );
            if (isPlayingRandom) {
                randomIV.setImageResource ( R.drawable.ic_dehaze );
            }

            if (savedInstanceState.getBoolean ( IS_PLAYING )) {
                // this will update isPlaying to true
                playPause ();
            }
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy ();

        if (mediaPlayer != null) {
            mediaPlayer.release ();
            mediaPlayer = null;
        }
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState ( outState );
        outState.putLong ( REMAINING_TIME, remainingTime );
        outState.putBoolean ( IS_PLAYING, isPlaying );
        outState.putBoolean ( IS_PLAYING_RANDOM, isPlayingRandom );
        outState.putInt ( CURRENT_Surah_POS, surah.indexOf ( currentSurah ) );
    }

    /**
     * Obtain an {@link Intent} that will launch an explicit target activity
     * specified by sourceActivity's {@link androidx.core.app.NavUtils#PARENT_ACTIVITY} &lt;meta-data&gt;
     * element in the application's manifest. If the device is running
     * Jellybean or newer, the android:parentActivityName attribute will be preferred
     * if it is present.
     *
     * @return a new Intent targeting the defined parent activity of sourceActivity
     */
    @Nullable
    @Override
    public Intent getSupportParentActivityIntent() {
        if (mediaPlayer != null) {
            mediaPlayer.release ();
            mediaPlayer = null;
        }

        return super.getSupportParentActivityIntent ();
    }

    /**
     * Init a countDownTimer for the duration of the selected Surah
     *
     * @param duration in millisecond
     * @return the countDownTimer
     */
    private CountDownTimer initCountDownTimer(final long duration) {

        remainingTime = duration;

        return new CountDownTimer ( duration, TIMER_INTERVAL ) {

            public void onTick(long millisUntilFinished) {
                remainingTime = millisUntilFinished;

                refreshTime ();

                // Update the seekBar
                seekBar.setProgress ( currentSurah.getDuration () - (int) (millisUntilFinished / TIMER_INTERVAL) );
            }

            public void onFinish() {
                nextSurah ();
            }
        };
    }

    /**
     * Refresh the display of the time
     */
    private void refreshTime() {
        // Display the remaining time of the Surah
        long minutes = remainingTime / 1000 / 60;
        remainingTimeTV.setText ( String.format ( Locale.getDefault (), "%02d:%02d", minutes,
                (remainingTime - (minutes * 60 * 1000)) / 1000 ) );

        // Display the elapsed time of the Surah
        long elapsedTime = currentSurah.getDuration () - (remainingTime / 1000);
        minutes = elapsedTime / 60;
        elapsedTimeTV.setText ( String.format ( Locale.getDefault (), "%02d:%02d", minutes,
                (elapsedTime - (minutes * 60)) ) );
    }

    /**
     * Select the Surah to play
     *
     * @param selection the selected Surah
     */
    private void selectSurah(Surah selection) {
        currentSurah = selection;

        int resIdMedia = 0;
        if (currentSurah.getMediaFile () != null) {
            resIdMedia = getResources ().getIdentifier ( currentSurah.getMediaFile (), "raw", getPackageName () );
        }

        if (resIdMedia == 0) {
            Toast.makeText ( this, "noSurahFile", Toast.LENGTH_SHORT ).show ();
        }

        countDownTimer.cancel ();

        // initialization of the elapsed time of the current Surah
        long durationMS = selection.getDuration () * TIMER_INTERVAL;
        countDownTimer = initCountDownTimer ( durationMS );
        countDownTimer.onTick ( durationMS );

        // initialization of the seekBar
        seekBar.setMax ( selection.getDuration () );
        seekBar.setProgress ( 0 );

        if (mediaPlayer != null) {
            mediaPlayer.reset ();
            mediaPlayer = null;
        }
        if (resIdMedia != 0) {
            mediaPlayer = MediaPlayer.create ( this, resIdMedia );
        }

        if (isPlaying) {
            countDownTimer.start ();
            if (mediaPlayer != null) {
                mediaPlayer.start ();
            }
        }
    }

    /**
     * Play or pause the current Surah
     */
    private void playPause() {

        if (isPlaying) {
            playStopIV.setImageResource ( R.drawable.ic_play_circle_filled );
            countDownTimer.cancel ();
            if (mediaPlayer != null) {
                mediaPlayer.pause ();
            }
        } else {
            playStopIV.setImageResource ( R.drawable.ic_pause_circle_filled );
            countDownTimer = initCountDownTimer ( remainingTime );
            if (mediaPlayer != null) {
                mediaPlayer.start ();
            }
            countDownTimer.start ();
        }

        isPlaying = !isPlaying;
    }

    /**
     * Select the next Surah
     */
    private void nextSurah() {
        int currentPosition = surah.indexOf ( currentSurah );

        // Deselect the current item
        int firstDisplayedPosition = listLV.getFirstVisiblePosition ();
        listLV.getChildAt ( currentPosition - firstDisplayedPosition ).setSelected ( false );

        if (isPlayingRandom) {
            int i = random.nextInt ( listLV.getChildCount () );
            currentPosition = firstDisplayedPosition + i;
        } else {
            currentPosition++;
            // When we are at the bottom, we go back to the top
            if (currentPosition == surah.size ()) {
                currentPosition = 0;
                firstDisplayedPosition = 0;
                listLV.setSelectionAfterHeaderView ();
            }
        }

        selectSurah ( (Surah) listLV.getItemAtPosition ( currentPosition ) );

        listLV.getChildAt ( currentPosition - firstDisplayedPosition ).setSelected ( true );
        listLV.smoothScrollToPosition ( currentPosition + 1 - firstDisplayedPosition );
    }

    /**
     * Select the previous Surah
     */
    private void previousSurah() {
        int currentPosition = surah.indexOf ( currentSurah );

        // Deselect the current item
        int firstDisplayedPosition = listLV.getFirstVisiblePosition ();
        listLV.getChildAt ( currentPosition - firstDisplayedPosition ).setSelected ( false );

        if (isPlayingRandom) {
            int i = random.nextInt ( listLV.getChildCount () );
            currentPosition = firstDisplayedPosition + i;
        } else {
            currentPosition--;
            // When we are at the top, we go to the bottom of the list
            if (currentPosition == -1) {
                currentPosition = surah.size () - 1;
                listLV.smoothScrollToPosition ( currentPosition );
                firstDisplayedPosition = listLV.getFirstVisiblePosition ();
            }
        }

        selectSurah ( (Surah) listLV.getItemAtPosition ( currentPosition ) );

        // Trick because when going too the last element of the list, the View item doesn't exists
        if (currentPosition <= listLV.getLastVisiblePosition ()) {
            listLV.getChildAt ( currentPosition - firstDisplayedPosition ).setSelected ( true );
            listLV.smoothScrollToPosition ( currentPosition - 1 - firstDisplayedPosition );
        }
    }

}