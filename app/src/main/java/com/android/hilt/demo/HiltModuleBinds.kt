package com.android.hilt.demo

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewComponent

@Module
@InstallIn(ViewComponent::class)
abstract class HiltModuleBinds {

    /**
     * [使用 @Binds 注入接口实例](https://developer.android.google.cn/training/dependency-injection/hilt-android#inject-interfaces)
     */
    @Binds
    abstract fun getHiltInterface(impl: HiltInterfaceImpl): HiltInterface

}