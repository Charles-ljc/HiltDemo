package com.android.hilt.demo

import android.annotation.SuppressLint
import android.content.Context
import android.widget.TextView
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@SuppressLint("AppCompatCustomView")
@AndroidEntryPoint
class HiltTextView constructor(context: Context) : TextView(context) {

    @Inject
    lateinit var hi: HiltInterface

    @Inject
    lateinit var singleton: HiltSingleton

    fun setHiltText(text: CharSequence?) {
        val sb = StringBuilder(hi.getString())
        sb.append(Const.LINE)

        sb.append("view:")
        sb.append(singleton)
        sb.append(Const.LINE)

        sb.append(text)
        setText(sb)
    }
}