package op.mobile.app.dev.willkj8.travelling

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.appcompat.widget.Toolbar
import androidx.lifecycle.asLiveData
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import op.mobile.app.dev.willkj8.travelling.ui.map.MapFragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.firebase.auth.FirebaseAuth
import op.mobile.app.dev.willkj8.travelling.helpers.settings.SettingsManager

/**
 * A main activity class
 *
 * This is the first activity that loads when the app is started
 */
class MainActivity : AppCompatActivity() {
    private lateinit var navController: NavController
    private lateinit var appBarConfiguration: AppBarConfiguration

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toolbar: Toolbar = findViewById(R.id.toolbar) // Find the View in activity_main.xml with the id toolbar
        setSupportActionBar(toolbar) // Set toolbar as the entire application's action bar
        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        navController = navHostFragment.navController
        val navView: BottomNavigationView = findViewById(R.id.nav_view)
        //val navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        //val navController = navHostFragment.navController
        appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.navigation_home,
                R.id.navigation_settings
            )
        )
        setupActionBarWithNavController(navController, appBarConfiguration)

        //setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)

        navView.visibility = View.GONE
        
        //supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        val settingsManager = SettingsManager(this)
        settingsManager.uiModeFlow.asLiveData().observe(this) {
            settingsManager.setCheckedUIMode(it, true, null, null)
        }
    }
}