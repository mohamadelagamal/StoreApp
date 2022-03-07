package mashtal.store.ui.splash

import android.content.Intent
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import mashtal.store.R
import mashtal.store.databinding.ActivitySplashScreenBinding
import mashtal.store.ui.base.BaseActivity
import mashtal.store.ui.register.RegisterActivity

class SplashScreenActivity : BaseActivity<ActivitySplashScreenBinding, SplashViewModel>(),
    Navigator {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewDataBinding.vm = viewModel
        viewModel.navigator = this
    }

    override fun nextPageRegisterNavigator() {
        val intent = Intent(this, RegisterActivity::class.java)
        startActivity(intent)
        finish()
    }

    override fun getLayoutID(): Int {
        return R.layout.activity_splash_screen
    }

    override fun initViewModel(): SplashViewModel {
        return ViewModelProvider(this).get(SplashViewModel::class.java)
    }


}