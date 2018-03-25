package com.borjabravo.daggerinnocv.di.modules.main

import com.borjabravo.daggerinnocv.di.modules.BaseActivityModule
import com.borjabravo.daggerinnocv.presentation.main.MainActivity
import com.borjabravo.daggerinnocv.presentation.main.presenter.MainPresenter
import com.borjabravo.daggerinnocv.presentation.main.presenter.MainPresenterImpl
import dagger.Binds
import dagger.Module

@Module
abstract class MainActivityModule : BaseActivityModule<MainActivity>() {

    @Binds
    abstract fun mainPresenter(presenter: MainPresenterImpl): MainPresenter
}