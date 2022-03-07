package mashtal.store.ui.bindingadapter

import androidx.databinding.BindingAdapter
import com.google.android.material.textfield.TextInputLayout


@BindingAdapter("setError")
fun setError(textinput: TextInputLayout, error: String) {
    textinput.error = error
}