package abdelfattah.holyquran;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

@SuppressWarnings("ConstantConditions")
class SurahPagerAdapter extends FragmentPagerAdapter {

    static final int M_NB_VIEWS = 2;
    private String[] pageTitles;

    @SuppressWarnings("deprecation")
    SurahPagerAdapter(FragmentManager fm) {
        super ( fm );
    }

    /**
     * Return the number of views available.
     */
    @Override
    public int getCount() {
        return M_NB_VIEWS;
    }

    /**
     * Return the Fragment associated with a specified position.
     *
     * @param position to display
     */
    @SuppressWarnings("ConstantConditions")
    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return AlbumFragment.newInstance ();
            case 1:
                return SheikhFragment.newInstance ();
        }
        return null;
    }

    void setPageTitles(String[] pageTitles) {
        this.pageTitles = pageTitles;
    }

    /**
     * This method may be called by the ViewPager to obtain a title string
     * to describe the specified page. This method may return null
     * indicating no title for this page. The default implementation returns
     * null.
     *
     * @param position The position of the title requested
     * @return A title for the requested page
     */
    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if (position < M_NB_VIEWS) {
            return pageTitles[position];
        }
        return null;
    }
}