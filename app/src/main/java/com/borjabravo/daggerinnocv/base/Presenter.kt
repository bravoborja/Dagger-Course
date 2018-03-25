package com.borjabravo.daggerinnocv.base

interface Presenter<in T : BaseView> {

    fun initialize(view: T)
}
