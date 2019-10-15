package abdelfattah.holyquran;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

class AlbumAdapter extends ArrayAdapter<Album> {

    /**
     * Constructor
     *  @param context The current context.
     *
     */
    AlbumAdapter(@NonNull Context context) {
        super ( context, 0, DummyContent.ITEMS_ALBUMS );
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from ( getContext () ).inflate (
                    R.layout.fragment_album_item, parent, false );
        }

        Album currentAlbum = getItem ( position );

        if (currentAlbum != null) {
            ImageView coverIV = listItemView.findViewById ( R.id.cover );
            coverIV.setImageResource ( getContext ().getResources ().getIdentifier (
                    currentAlbum.getCover (), "drawable", getContext ().getPackageName () ) );

            TextView nameTV = listItemView.findViewById ( R.id.name_text_view );
            nameTV.setText ( currentAlbum.getName () );

            TextView SheikhTV = listItemView.findViewById ( R.id.sheikh );
            SheikhTV.setText ( currentAlbum.getSheikh ().getName () );
        }

        return listItemView;
    }
}
