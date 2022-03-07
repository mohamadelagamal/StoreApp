package mashtal.store.ui.base

import android.app.ProgressDialog
import android.content.DialogInterface
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding


abstract class BaseActivity<DB : ViewDataBinding, VM : BaseViewModel<*>> : AppCompatActivity() {

    lateinit var viewModel: VM
    lateinit var viewDataBinding: DB

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewDataBinding = DataBindingUtil.setContentView(this, getLayoutID())
        // to create viewModel
        viewModel = initViewModel()
        // subscribeToLifeData()
    }

    fun subscribeToLifeData() {

        viewModel.messageLiveData.observe(this, {
            showDialog(it, "ok")
        })
        viewModel.showLoading.observe(this, {
            if (it)
                showLoading()
            else
                hideLoading()
        })
    }

    var alertDialog: AlertDialog? = null
    fun showDialog(
        message: String,
        posActionName: String? = null, posAction: DialogInterface.OnClickListener? = null,
        negActionName: String? = null, negAction: DialogInterface.OnClickListener? = null,
        cancelable: Boolean = true
    ) {
        val defAction = object : DialogInterface.OnClickListener {
            override fun onClick(dialog: DialogInterface?, which: Int) {
                dialog?.dismiss()
            }
        }
        val builder = AlertDialog.Builder(this).setMessage(message)
        if (posActionName != null) {
            builder.setPositiveButton(posActionName, posAction ?: defAction).show()
            if (negActionName != null) {
                builder.setNegativeButton(negActionName, negAction ?: defAction).show()
            }
            builder.setCancelable(cancelable)
            alertDialog = builder.show()
        }


    }

    fun hideAlertDialog() {
        alertDialog?.dismiss()
        alertDialog = null
    }

    var progressDialog: ProgressDialog? = null
    fun showLoading() {
        progressDialog = ProgressDialog(this)
        progressDialog?.setMessage("Loading")
        progressDialog?.setCancelable(false)
        progressDialog?.show()
    }

    fun hideLoading() {
        progressDialog?.dismiss()
        progressDialog = null
    }

    abstract fun getLayoutID(): Int
    abstract fun initViewModel(): VM
}