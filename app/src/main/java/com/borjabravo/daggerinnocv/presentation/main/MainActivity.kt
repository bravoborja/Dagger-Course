package com.borjabravo.daggerinnocv.presentation.main

import android.os.Bundle
import android.support.design.widget.Snackbar
import com.borjabravo.daggerinnocv.R
import com.borjabravo.daggerinnocv.base.BaseActivity
import com.borjabravo.daggerinnocv.presentation.main.presenter.MainPresenter
import com.borjabravo.daggerinnocv.presentation.main.view.MainView
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : BaseActivity(), MainView {

    @Inject
    lateinit var presenter: MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        presenter.initialize(this)
        openDetailButton.setOnClickListener { presenter.goToDetail() }
    }

    override fun showSnackbar() {
        Snackbar.make(content, javaClass.simpleName, Snackbar.LENGTH_SHORT).show()
    }
}
