package com.borjabravo.daggerinnocv.di.modules.detail

import com.borjabravo.daggerinnocv.di.modules.BaseActivityModule
import com.borjabravo.daggerinnocv.di.scopes.FragmentScope
import com.borjabravo.daggerinnocv.presentation.detail.DetailActivity
import com.borjabravo.daggerinnocv.presentation.detail.fragment.DetailFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class DetailActivityModule: BaseActivityModule<DetailActivity>() {

    @FragmentScope
    @ContributesAndroidInjector(modules = [DetailFragmentModule::class])
    abstract fun detailFragmentInjector(): DetailFragment
}