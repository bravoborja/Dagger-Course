package com.borjabravo.daggerinnocv.presentation.main.presenter

import com.borjabravo.daggerinnocv.base.Presenter
import com.borjabravo.daggerinnocv.presentation.main.view.MainView

interface MainPresenter: Presenter<MainView> {

    fun goToDetail()
}