package mashtal.store.ui.sign

import androidx.databinding.ObservableField
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import mashtal.store.ui.base.BaseViewModel

class SignViewModel : BaseViewModel<Navigator>() {

    var emailSign = ObservableField<String>()
    var emailSignError = ObservableField<String>()
    var passwordSignError = ObservableField<String>()
    var passwordSign = ObservableField<String>()

    var auth = Firebase.auth
    fun backPageButton() {
        navigator?.backButton()
    }

    fun openHomeSign() {
        navigator?.openHomeSign()
    }

    fun createSignAccount() {

        //navigator?.openHomeSign()

    }

//    private fun functionCreateAcccount() {
//        auth.createUserWithEmailAndPassword(emailSign.get()!!,passwordSign.get()!!).addOnCompleteListener {
//            task->
//            if (!task.isSuccessful){
//                Log.e("Firebase","failed"+task.exception?.localizedMessage)
//            }
//            else{
//                Log.e("firebase ","success registration")
//                navigator?.createAccount()
//            }
//        }
//    }

    fun validation(): Boolean {
        var valid = true
        if (emailSign.get().isNullOrBlank()) {
            emailSignError.set("please enter your email ")
            valid = false
        } else {
            emailSignError.set(null)
        }
        if (passwordSign.get().isNullOrBlank()) {
            passwordSignError.set("please enter your password ")
            valid = false
        } else {
            passwordSignError.set(null)
        }
        return valid
    }
}