package com.android.hilt.demo

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.FragmentComponent

@Module
@InstallIn(FragmentComponent::class)
object HiltModuleProvides {

    /**
     * [使用 @Provides 注入实例(一般是外部库的实例)](https://developer.android.google.cn/training/dependency-injection/hilt-android#inject-provides)
     */
    @Provides
    fun provideHiltLocal(): HiltLocal {
        return HiltLocal()
    }
}