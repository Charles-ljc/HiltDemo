package com.android.hilt.demo

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

/**
 * [HiltViewModel](https://developer.android.google.cn/training/dependency-injection/hilt-jetpack#viewmodels)
 */
@HiltViewModel
class HiltViewModel2 @Inject constructor() : ViewModel() {

    fun getData() = HiltData(2)
}