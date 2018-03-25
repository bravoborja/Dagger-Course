package com.borjabravo.daggerinnocv.di.modules

import android.app.Activity
import android.content.Context
import com.borjabravo.daggerinnocv.di.scopes.ActivityScope
import dagger.Binds
import dagger.Module

@Module
abstract class BaseActivityModule<in T : Activity> {

    @Binds
    @ActivityScope
    abstract fun activityContext(activity: T): Context
}