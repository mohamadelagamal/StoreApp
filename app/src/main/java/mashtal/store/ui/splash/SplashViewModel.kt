package mashtal.store.ui.splash

import mashtal.store.ui.base.BaseViewModel

class SplashViewModel : BaseViewModel<Navigator>() {

    fun nextPageRegister() {
        navigator?.nextPageRegisterNavigator()
    }
}