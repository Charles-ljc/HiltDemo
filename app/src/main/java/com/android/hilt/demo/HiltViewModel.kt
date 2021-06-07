package com.android.hilt.demo

import android.content.Context
import android.util.Log
import androidx.lifecycle.ViewModel
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject

class HiltViewModel @Inject constructor(
    /**
     * [预定义限定符](https://developer.android.google.cn/training/dependency-injection/hilt-android#predefined-qualifiers)
     */
    @ApplicationContext context: Context,
    private val repository: HiltRepository
) : ViewModel() {

    init {
        Log.e(Const.LOG_TAG, context.toString())
    }

    fun getData() = repository.getData()
}