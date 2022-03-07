package mashtal.store.ui.register


import androidx.databinding.ObservableField
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import mashtal.store.ui.base.BaseViewModel


class RegisterViewModel : BaseViewModel<Navigator>() {


    val name = ObservableField<String>()
    val email = ObservableField<String>()
    val password = ObservableField<String>()
    val nameError = ObservableField<String>()
    val emailError = ObservableField<String>()
    val passwordError = ObservableField<String>()
    val firebaseAuth = Firebase.auth
    fun creteAccount() {
        if (!valid())
            navigator?.gotoHomeActivity()
    }

    fun goToPageSign() {
        navigator?.openSingPage()
    }

    fun valid(): Boolean {
        var isValid = true;
        if (name.get().isNullOrBlank()) {
            nameError.set("enter your name")
            isValid = false
        } else {
            nameError.set(null)
        }
        if (email.get().isNullOrBlank()) {
            emailError.set("enter your email")
            isValid = false
        } else {
            emailError.set(null)
        }

        if (password.get().isNullOrBlank()) {
            passwordError.set("enter your password")
            isValid = false
        } else {
            passwordError.set(null)
        }

        return isValid
    }


}