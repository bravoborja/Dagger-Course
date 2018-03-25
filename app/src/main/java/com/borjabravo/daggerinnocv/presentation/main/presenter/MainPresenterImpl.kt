package com.borjabravo.daggerinnocv.presentation.main.presenter

import com.borjabravo.daggerinnocv.base.BasePresenter
import com.borjabravo.daggerinnocv.presentation.main.view.MainView
import javax.inject.Inject

class MainPresenterImpl @Inject constructor(): BasePresenter<MainView>(), MainPresenter {

    override fun initialize(view: MainView) {
        super.initialize(view)
        view.showSnackbar()
    }

    override fun goToDetail() = navigator.goToDetail(context)

}