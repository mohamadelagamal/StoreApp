package mashtal.store.ui.home

import mashtal.store.ui.base.BaseViewModel


class HomeViewModel : BaseViewModel<Navigator>() {

    fun nextPage() {
        navigator?.nextPage()
    }
}