package mashtal.store.ui.sign

import android.content.Intent
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import mashtal.store.R
import mashtal.store.databinding.ActivitySignBinding
import mashtal.store.ui.base.BaseActivity
import mashtal.store.ui.home.HomeActivity
import mashtal.store.ui.register.RegisterActivity

class SignActivity : BaseActivity<ActivitySignBinding, SignViewModel>(), Navigator {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        viewDataBinding.vmSign = viewModel
        viewModel.navigator = this
    }

    override fun getLayoutID(): Int {
        return R.layout.activity_sign
    }

    override fun initViewModel(): SignViewModel {
        return ViewModelProvider(this).get(SignViewModel::class.java)
    }

    override fun backButton() {
        val intent = Intent(this, RegisterActivity::class.java)
        startActivity(intent)
    }

//    override fun createAccount() {
//        val intent = Intent(this, ::class.java)
//        startActivity(intent)
//        finish()
//    }

    override fun openHomeSign() {
        val intent = Intent(this, HomeActivity::class.java)
        startActivity(intent)
        finish()
    }
}