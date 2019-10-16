package abdelfattah.holyquran;


import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

/**
 * A fragment representing a list of Items.
 * <p/>
 * Activities containing this fragment MUST implement the {@link OnSheikhSelectedListener}
 * interface.
 */
public class SheikhFragment extends Fragment {

    private OnSheikhSelectedListener mListener;

    /**
     * Mandatory empty constructor for the fragment manager to instantiate the
     * fragment (e.g. upon screen orientation changes).
     */
    public SheikhFragment() {
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @return A new instance of fragment SheikhFragment.
     */
    static SheikhFragment newInstance() {
        return new SheikhFragment ();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate ( R.layout.fragment_list, container, false );

        // Create an {@link SheikhAdapter}, whose data source is a list of {@link Sheikh}s. The
        // adapter knows how to create list items for each item in the list.
        SheikhAdapter adapter = new SheikhAdapter ( view.getContext () );

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // activity_numbers.xml layout file.
        GridView gridView = view.findViewById ( R.id.list );

        // Make the {@link ListView} use the {@link SheikhAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Sheikh} in the list.
        gridView.setAdapter ( adapter );

        // Pass data to the Activity
        gridView.setOnItemClickListener ( new AdapterView.OnItemClickListener () {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Sheikh selectedSheikh = DummyContent.ITEMS_SHEIKHS.get ( position );
                mListener.onSheikhSelected ( selectedSheikh );
            }
        } );

        return view;
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach ( context );
        if (context instanceof OnSheikhSelectedListener) {
            mListener = (OnSheikhSelectedListener) context;
        } else {
            throw new RuntimeException ( context.toString ()
                                         + " must implement OnSheikhSelectedListener" );
        }
    }

    @Override
    public void onDetach() {
        super.onDetach ();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnSheikhSelectedListener {

        void onSheikhSelected(Sheikh sheikh);
    }
}
