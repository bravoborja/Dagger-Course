package com.borjabravo.daggerinnocv.di.modules.detail

import com.borjabravo.daggerinnocv.presentation.detail.presenter.DetailPresenter
import com.borjabravo.daggerinnocv.presentation.detail.presenter.DetailPresenterImpl
import dagger.Binds
import dagger.Module

@Module
abstract class DetailFragmentModule {

    @Binds
    abstract fun bindDetailPresenter(presenter: DetailPresenterImpl): DetailPresenter
}