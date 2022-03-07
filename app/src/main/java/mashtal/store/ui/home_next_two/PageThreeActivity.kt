package mashtal.store.ui.home_next_two

import android.content.Intent
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import mashtal.store.R
import mashtal.store.databinding.ActivityPageThreeBinding
import mashtal.store.ui.base.BaseActivity
import mashtal.store.ui.home_next.HomeNextPageActivity

class PageThreeActivity : BaseActivity<ActivityPageThreeBinding, PageThreeViewModel>(), Navigator {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewDataBinding.vm = viewModel
        viewModel.navigator = this
    }

    override fun getLayoutID(): Int {
        return R.layout.activity_page_three
    }

    override fun initViewModel(): PageThreeViewModel {
        return ViewModelProvider(this).get(PageThreeViewModel::class.java)
    }

    override fun backPageThree() {
        val intent = Intent(this, HomeNextPageActivity::class.java)
        startActivity(intent)
        finish()
    }
}