package com.example.deliveryclone.main

import android.os.Bundle
import com.example.deliveryclone.R
import com.example.deliveryclone.base.BaseMvpActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseMvpActivity<MainContract.View, MainContract.Presenter>(), MainContract.View {

    override var mPresenter: MainContract.Presenter = MainPresenter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener {
            mPresenter.addCount(Integer.parseInt(resultText.text.toString()))
        }
    }

    override fun updateView(count: Int) {
        resultText.text = count.toString()
    }
}
