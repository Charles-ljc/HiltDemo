package com.android.hilt.demo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.android.hilt.library.HiltLibrary
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

/**
 * 如果您使用 [@AndroidEntryPoint](https://developer.android.google.cn/training/dependency-injection/hilt-android#android-classes) 为某个 Android 类添加注释，则还必须为依赖于该类的 Android 类添加注释。
 * 例如，如果您为某个 Fragment 添加注释，则还必须为使用该 Fragment 的所有 Activity 添加注释。
 *
 * Hilt 仅支持扩展 androidx.Fragment 的 Fragment。
 *
 * Hilt 不支持保留的 Fragment。
 */
@AndroidEntryPoint
class HiltFragment : Fragment() {
    @Inject
    lateinit var vm: HiltViewModel

    @Inject
    lateinit var singleton: HiltSingleton

    @Inject
    lateinit var library: HiltLibrary

    private lateinit var textView: HiltTextView

    private val hiltVM by viewModels<HiltViewModel2>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        textView = HiltTextView(inflater.context)
        return textView
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val sb = StringBuilder()

        sb.append(vm.getData())
        sb.append(Const.LINE)

        sb.append("fragment:")
        sb.append(singleton)
        sb.append(Const.LINE)

        sb.append("HiltViewModel:")
        sb.append(hiltVM.getData())
        sb.append(Const.LINE)

        sb.append("library:")
        sb.append(library.getString())
        sb.append(Const.LINE)

        textView.setHiltText(sb)
    }
}