package com.borjabravo.daggerinnocv.base

import android.content.Context
import com.borjabravo.daggerinnocv.Navigator
import javax.inject.Inject

abstract class BasePresenter<in T : BaseView> : Presenter<T> {

    @Inject
    lateinit var navigator: Navigator

    @Inject
    lateinit var context: Context

    private var view: T? = null

    override fun initialize(view: T) {
        this.view = view
    }
}