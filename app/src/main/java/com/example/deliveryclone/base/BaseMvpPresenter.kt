package com.example.deliveryclone.base

interface BaseMvpPresenter<in V: BaseMvpView> {
    fun attachView(view: V)
    fun detachView()
}