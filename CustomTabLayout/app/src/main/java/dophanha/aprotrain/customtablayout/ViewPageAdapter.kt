package dophanha.aprotrain.customtablayout

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter

class ViewPageAdapter(fm: FragmentManager, behavior: Int) : FragmentStatePagerAdapter(fm, behavior) {

    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> HomeFragment.newInstance("", "")
            1 -> FavoriteFragment.newInstance("", "")
            2 -> MyPageFragment.newInstance("", "")
            else -> HomeFragment.newInstance("", "")
        }
    }

    override fun getCount(): Int {
        return 3
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return when (position) {
            0 -> "Home"
            1 -> "Favorite Enjoy Liked"
            2 -> "My Page"
            else -> ""
        }
    }
}
