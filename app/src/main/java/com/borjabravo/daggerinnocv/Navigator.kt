package com.borjabravo.daggerinnocv

import android.content.Context
import android.content.Intent
import com.borjabravo.daggerinnocv.presentation.detail.DetailActivity
import javax.inject.Inject
import javax.inject.Singleton


@Singleton
class Navigator @Inject constructor() {

    fun goToDetail(context: Context) {
        val intent = Intent(context, DetailActivity::class.java)
        context.startActivity(intent)
    }
}
