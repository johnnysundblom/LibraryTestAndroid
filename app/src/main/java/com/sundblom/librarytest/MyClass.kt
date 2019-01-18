package com.sundblom.librarytest

import android.content.Context

class MyClass(val context: Context) {
    fun getTestString() = context.getString(R.string.test)
}