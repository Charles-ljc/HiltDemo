package com.android.hilt.demo

import javax.inject.Inject

interface HiltInterface {
    fun getString(): String
}

class HiltInterfaceImpl @Inject constructor() : HiltInterface {
    override fun getString() = "HiltInterface"
}