package mashtal.store.ui.home

import android.content.Intent
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationBarView
import mashtal.store.R
import mashtal.store.databinding.ActivityHomeBinding
import mashtal.store.ui.EmptyActiviy
import mashtal.store.ui.base.BaseActivity
import mashtal.store.ui.home_next.HomeNextPageActivity

class HomeActivity : BaseActivity<ActivityHomeBinding, HomeViewModel>(), Navigator {
    lateinit var bottom_navigation: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bottom_navigation = findViewById(R.id.Bottom_Navigation)
        viewDataBinding.vmHome = viewModel

        viewModel.navigator = this
        bottom_navigation.setOnItemSelectedListener(NavigationBarView.OnItemSelectedListener {
            if (it.itemId == R.id.question) {
                val intent = Intent(this, EmptyActiviy::class.java)
                startActivity(intent)
            } else if (it.itemId == R.id.love) {
                val intent = Intent(this, EmptyActiviy::class.java)
                startActivity(intent)
            } else if (it.itemId == R.id.buy) {
                val intent = Intent(this, EmptyActiviy::class.java)
                startActivity(intent)
            }

            return@OnItemSelectedListener true
        })
        // supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }


    override fun getLayoutID(): Int {
        return R.layout.activity_home
    }

    override fun initViewModel(): HomeViewModel {
        return ViewModelProvider(this).get(HomeViewModel::class.java)
    }

    override fun nextPage() {
        var intent = Intent(this, HomeNextPageActivity::class.java)
        startActivity(intent)
    }
}