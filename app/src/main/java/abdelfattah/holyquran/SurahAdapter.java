package abdelfattah.holyquran;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

class SurahAdapter extends ArrayAdapter<Surah> {

    /**
     * Constructor
     *
     * @param context The current context.
     * @param surah   The surah to represent in the ListView.
     */
    SurahAdapter(@NonNull Context context, @NonNull List<Surah> surah) {
        super ( context, 0, surah );
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from ( getContext () ).inflate (
                    R.layout.surah_item, parent, false );
        }

        Surah currentSurah = getItem ( position );

        if (currentSurah != null) {
            TextView nameTV = listItemView.findViewById ( R.id.name_text_view );
            nameTV.setText ( currentSurah.getName () );
        }

        return listItemView;
    }
}