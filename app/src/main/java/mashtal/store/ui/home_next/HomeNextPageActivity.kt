package mashtal.store.ui.home_next

import android.content.Intent
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import mashtal.store.R
import mashtal.store.databinding.ActivityHomeNextPageBinding
import mashtal.store.ui.base.BaseActivity
import mashtal.store.ui.home.HomeActivity
import mashtal.store.ui.home_next_two.PageThreeActivity

class HomeNextPageActivity : BaseActivity<ActivityHomeNextPageBinding, HomeNextPageViewModel>(),
    Navigator {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewDataBinding.twoPage = viewModel
        viewModel.navigator = this
    }

    override fun getLayoutID(): Int {
        return R.layout.activity_home_next_page
    }

    override fun initViewModel(): HomeNextPageViewModel {
        return ViewModelProvider(this).get(HomeNextPageViewModel::class.java)
    }

    override fun nextPage() {
        val intent = Intent(this, PageThreeActivity::class.java)
        startActivity(intent)
    }

    override fun backPage() {
        val intent = Intent(this, HomeActivity::class.java)
        startActivity(intent)
    }

}