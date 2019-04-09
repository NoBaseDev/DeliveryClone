package com.example.deliveryclone.model

interface Repository {
    fun addCount(count: Int)
    fun getCount(): Int
}