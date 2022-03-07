package mashtal.store.ui.home_next_two

import mashtal.store.ui.base.BaseViewModel

class PageThreeViewModel : BaseViewModel<Navigator>() {

    fun bakeButtonThree() {
        navigator?.backPageThree()
    }
}