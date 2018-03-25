package com.borjabravo.daggerinnocv.presentation.detail.presenter

import com.borjabravo.daggerinnocv.base.BasePresenter
import com.borjabravo.daggerinnocv.presentation.detail.view.DetailView
import javax.inject.Inject

class DetailPresenterImpl @Inject constructor() : BasePresenter<DetailView>(), DetailPresenter {

    override fun initialize(view: DetailView) {
        super.initialize(view)
        view.showToast()
    }
}