package com.borjabravo.daggerinnocv.presentation.detail.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.borjabravo.daggerinnocv.R
import com.borjabravo.daggerinnocv.base.BaseFragment
import com.borjabravo.daggerinnocv.presentation.detail.presenter.DetailPresenter
import com.borjabravo.daggerinnocv.presentation.detail.view.DetailView
import javax.inject.Inject

class DetailFragment: BaseFragment(), DetailView {

    @Inject
    lateinit var presenter: DetailPresenter

    companion object {
        fun newInstance() = DetailFragment()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_detail, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        presenter.initialize(this)
    }

    override fun showToast() {
        Toast.makeText(context, javaClass.simpleName, Toast.LENGTH_LONG).show()
    }

}