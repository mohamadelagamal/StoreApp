package mashtal.store.ui.home

import android.content.Intent
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import mashtal.store.R
import mashtal.store.databinding.ActivityHomeBinding
import mashtal.store.ui.base.BaseActivity
import mashtal.store.ui.home_next.HomeNextPageActivity

class HomeActivity : BaseActivity<ActivityHomeBinding, HomeViewModel>(), Navigator {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewDataBinding.vmHome = viewModel

        viewModel.navigator = this

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
        finish()
    }
}