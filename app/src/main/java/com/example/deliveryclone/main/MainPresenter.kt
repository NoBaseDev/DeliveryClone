package com.example.deliveryclone.main

import com.example.deliveryclone.base.BaseMvpPresenterImpl
import com.example.deliveryclone.model.Repository
import com.example.deliveryclone.model.RepositoryImpl

class MainPresenter: BaseMvpPresenterImpl<MainContract.View>(), MainContract.Presenter {
    private val repository: Repository by lazy {
        RepositoryImpl()
    }

    override fun addCount(count: Int) {
        repository.addCount(count)
        val result = repository.getCount()
        mView?.updateView(result)
    }

}