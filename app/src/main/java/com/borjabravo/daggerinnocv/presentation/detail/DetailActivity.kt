package com.borjabravo.daggerinnocv.presentation.detail

import android.os.Bundle
import android.support.v4.app.Fragment
import com.borjabravo.daggerinnocv.R
import com.borjabravo.daggerinnocv.base.BaseActivity
import com.borjabravo.daggerinnocv.presentation.detail.fragment.DetailFragment

class DetailActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        if (savedInstanceState == null) {
            initFragmentContainer(R.id.fragmentContainer, DetailFragment.newInstance())
        }
    }

    private fun initFragmentContainer(containerId: Int, fragment: Fragment) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(containerId, fragment)
        transaction.commit()
    }
}
