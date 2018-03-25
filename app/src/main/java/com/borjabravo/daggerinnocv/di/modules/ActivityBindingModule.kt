package com.borjabravo.daggerinnocv.di.modules

import com.borjabravo.daggerinnocv.di.modules.detail.DetailActivityModule
import com.borjabravo.daggerinnocv.di.modules.main.MainActivityModule
import com.borjabravo.daggerinnocv.di.scopes.ActivityScope
import com.borjabravo.daggerinnocv.presentation.detail.DetailActivity
import com.borjabravo.daggerinnocv.presentation.main.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBindingModule {

    @ActivityScope
    @ContributesAndroidInjector(modules = [MainActivityModule::class])
    abstract fun mainActivityInjector(): MainActivity

    @ActivityScope
    @ContributesAndroidInjector(modules = [DetailActivityModule::class])
    abstract fun detailActivityInjector(): DetailActivity

}