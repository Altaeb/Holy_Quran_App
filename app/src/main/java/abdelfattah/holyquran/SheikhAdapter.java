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

class SheikhAdapter extends ArrayAdapter<Sheikh> {

    /**
     * Constructor
     *  @param context The current context.
     *
     */
    SheikhAdapter(@NonNull Context context) {
        super ( context, 0, DummyContent.ITEMS_SHEIKHS );
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from ( getContext () ).inflate (
                    R.layout.fragment_sheikh_item, parent, false );
        }

        Sheikh currentSheikh = getItem ( position );

        if (currentSheikh != null) {
            ImageView photoIV = listItemView.findViewById ( R.id.photo_image_view );
            photoIV.setImageResource ( getContext ().getResources ().getIdentifier (
                    currentSheikh.getPhoto (), "drawable", getContext ().getPackageName () ) );

            TextView nameTV = listItemView.findViewById ( R.id.name_text_view );
            nameTV.setText ( currentSheikh.getName () );
        }

        return listItemView;
    }
}