package com.example.deliveryclone.base

import android.content.Context
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast

abstract class BaseMvpActivity<in V: BaseMvpView, T: BaseMvpPresenter<V>>: AppCompatActivity(), BaseMvpView {
    protected abstract var mPresenter: T

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mPresenter.attachView(this as V)
        title = ""
    }

    override fun onDestroy() {
        super.onDestroy()
        mPresenter.detachView()
    }

    override fun getContext(): Context = this

    override fun showError(error: String?) {
        Toast.makeText(this, error, Toast.LENGTH_SHORT)
    }

    override fun showError(strResId: Int) {
        Toast.makeText(this, strResId, Toast.LENGTH_SHORT)
    }

    override fun showMessage(strResId: Int) {
        Toast.makeText(this, strResId, Toast.LENGTH_SHORT)
    }

    override fun showMessage(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT)
    }

}