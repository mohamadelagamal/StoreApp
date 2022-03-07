package mashtal.store.ui

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationBarView
import mashtal.store.R
import mashtal.store.ui.home.HomeActivity

class EmptyActiviy : AppCompatActivity() {
    lateinit var bottom_navigation: BottomNavigationView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_empty_activiy)
        bottom_navigation = findViewById(R.id.Bottom_Navigation)

        bottom_navigation.setOnItemSelectedListener(NavigationBarView.OnItemSelectedListener {
            if (it.itemId == R.id.home) {
                val intent = Intent(this, HomeActivity::class.java)
                startActivity(intent)
            }


            return@OnItemSelectedListener true
        })
        //bottom_navigation.selectedItemId=R.id.quran
        // supportActionBar?.setDisplayHomeAsUpEnabled(true)}
    }
}