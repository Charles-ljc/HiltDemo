package com.android.hilt.demo

import androidx.appcompat.app.AppCompatActivity
import dagger.hilt.android.AndroidEntryPoint

/**
 * [Hilt 仅支持扩展 ComponentActivity 的 Activity，如 AppCompatActivity。](https://developer.android.google.cn/training/dependency-injection/hilt-android#android-classes)
 */
@AndroidEntryPoint
class HiltActivity : AppCompatActivity(R.layout.activity_hilt)