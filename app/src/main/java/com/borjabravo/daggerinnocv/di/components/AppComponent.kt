package com.borjabravo.daggerinnocv.di.components

import com.borjabravo.daggerinnocv.App
import com.borjabravo.daggerinnocv.di.modules.AppModule
import dagger.Component
import dagger.android.AndroidInjector
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class])
interface AppComponent : AndroidInjector<App>