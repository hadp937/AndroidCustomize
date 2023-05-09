package dophanha.aprotrain.custombottomnavigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import com.aurelhubert.ahbottomnavigation.AHBottomNavigation
import com.aurelhubert.ahbottomnavigation.AHBottomNavigationItem
import com.aurelhubert.ahbottomnavigation.notification.AHNotification

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bottomNavigation: AHBottomNavigation = findViewById(R.id.bottom_navigation)

// Create items
        val item1 = AHBottomNavigationItem(R.string.tab_1, R.drawable.home_24, R.color.red)
        val item2 = AHBottomNavigationItem(R.string.tab_2, R.drawable.favorite_24, R.color.blue)
        val item3 = AHBottomNavigationItem(R.string.tab_3, R.drawable.account_circle_24, R.color.green)

// Add items
        bottomNavigation.addItem(item1)
        bottomNavigation.addItem(item2)
        bottomNavigation.addItem(item3)

        bottomNavigation.isColored = false

        bottomNavigation.defaultBackgroundColor = ContextCompat.getColor(this, R.color.green)
        bottomNavigation.accentColor = ContextCompat.getColor(this, R.color.yellow)
        bottomNavigation.inactiveColor = ContextCompat.getColor(this, R.color.white)
        val notification = AHNotification.Builder()
            .setText("5")
            .setBackgroundColor(ContextCompat.getColor(this, R.color.red))
            .setTextColor(ContextCompat.getColor(this, R.color.white))
            .build()
        bottomNavigation.setNotification(notification, 0)
        bottomNavigation.titleState = AHBottomNavigation.TitleState.SHOW_WHEN_ACTIVE_FORCE
    }
}