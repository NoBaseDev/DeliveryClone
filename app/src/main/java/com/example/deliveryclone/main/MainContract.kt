package com.example.deliveryclone.main

import com.example.deliveryclone.base.BaseMvpPresenter
import com.example.deliveryclone.base.BaseMvpView

object MainContract {
    interface View : BaseMvpView {
        fun updateView(count : Int)
    }

    interface Presenter : BaseMvpPresenter<View> {
        fun addCount(count : Int)
    }
}