package abdelfattah.holyquran;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity
        implements AlbumFragment.OnAlbumSelectedListener, SheikhFragment.OnSheikhSelectedListener {

    public static final String SELECTED_ALBUM = "SELECTED_ALBUM";
    public static final String SELECTED_Sheikh = "SELECTED_Sheikh";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );
        DummyContent.add ( this );

        // To remove the shadow
        ActionBar actionBar = getSupportActionBar ();
        if (actionBar != null) {
            actionBar.setElevation ( 0 );
        }

        // Create the tabs
        SurahPagerAdapter surahPagerAdapter = new SurahPagerAdapter ( getSupportFragmentManager () );
        surahPagerAdapter.setPageTitles ( initPagesTitles () );

        ViewPager viewPager = findViewById ( R.id.pager );
        viewPager.setAdapter ( surahPagerAdapter );

        TabLayout tabLayout = findViewById ( R.id.tabLayout );
        tabLayout.setupWithViewPager ( viewPager );
    }

    private String[] initPagesTitles() {
        String[] pageTitles = new String[SurahPagerAdapter.M_NB_VIEWS];
        pageTitles[0] = this.getString( R.string.albums);
        pageTitles[1] = this.getString( R.string.elders);
        return pageTitles;
    }

    @Override
    public void onAlbumSelected(Album album) {
        Intent playActivity = new Intent ( MainActivity.this, PlayActivity.class );
        playActivity.putExtra ( SELECTED_ALBUM, album );
        startActivity ( playActivity );
    }

    @Override
    public void onSheikhSelected(Sheikh sheikh) {
        Intent playActivity = new Intent ( MainActivity.this, PlayActivity.class );
        playActivity.putExtra ( SELECTED_Sheikh, sheikh );
        startActivity ( playActivity );
    }
}