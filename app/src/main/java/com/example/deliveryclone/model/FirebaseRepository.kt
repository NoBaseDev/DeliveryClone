package com.example.deliveryclone.model

import android.util.Log
import com.google.firebase.firestore.FirebaseFirestore

class FirebaseRepository: Repository {
    val firestoreApp by lazy {
        FirebaseFirestore.getInstance()
    }
    override fun addCount(count: Int) {

        val map = mapOf("value" to count)
        firestoreApp.collection("test").document("count")
            .set(map)
            .addOnSuccessListener {
                Log.d("firebase", "success add with $count")
            }
            .addOnFailureListener {
                Log.d("firebase", "faile adding count")
            }
    }

    override fun getCount(): Int {
        TODO("Not implemented")
    }
}