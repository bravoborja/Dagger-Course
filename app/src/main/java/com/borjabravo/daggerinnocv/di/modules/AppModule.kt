package com.borjabravo.daggerinnocv.di.modules

import dagger.Module
import dagger.android.support.AndroidSupportInjectionModule

@Module(includes = [AndroidSupportInjectionModule::class, ActivityBindingModule::class])
class AppModule