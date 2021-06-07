package com.android.hilt.demo

import javax.inject.Inject

/**
 * [组件作用域](https://developer.android.google.cn/training/dependency-injection/hilt-android#component-scopes)
 */
class HiltRepository @Inject constructor(private val local: HiltLocal) {

    fun getData() = local.getData()

}