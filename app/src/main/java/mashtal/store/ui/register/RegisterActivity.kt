package mashtal.store.ui.register

import android.content.Intent
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import mashtal.store.R
import mashtal.store.databinding.ActivityRegisterBinding
import mashtal.store.ui.base.BaseActivity
import mashtal.store.ui.home.HomeActivity
import mashtal.store.ui.sign.SignActivity

class RegisterActivity : BaseActivity<ActivityRegisterBinding, RegisterViewModel>(), Navigator {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewDataBinding.vm = viewModel
        viewModel.navigator = this

    }


    override fun getLayoutID(): Int {
        return R.layout.activity_register
    }

    override fun initViewModel(): RegisterViewModel {
        return ViewModelProvider(this).get(RegisterViewModel::class.java)
    }

    override fun openSingPage() {
        val intent = Intent(this, SignActivity::class.java)
        startActivity(intent)
        finish()
    }


    override fun gotoHomeActivity() {
        val intent = Intent(this, HomeActivity::class.java)
        startActivity(intent)
        finish()
    }

}