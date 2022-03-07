package mashtal.store.ui.base

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

abstract class BaseViewModel<N> : ViewModel() {
    val messageLiveData = MutableLiveData<String>()
    val showLoading = MutableLiveData<Boolean>()
    var navigator: N? = null
}