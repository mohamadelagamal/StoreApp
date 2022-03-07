package mashtal.store.ui.home_next

import mashtal.store.ui.base.BaseViewModel

class HomeNextPageViewModel : BaseViewModel<Navigator>() {

    fun nextPageRight() {
        navigator?.nextPage()
    }

    fun nextPageLift() {
        navigator?.backPage()
    }
}