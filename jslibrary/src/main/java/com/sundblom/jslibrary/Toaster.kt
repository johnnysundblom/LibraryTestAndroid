package com.sundblom.jslibrary

import android.content.Context
import android.widget.Toast

class Toaster {

    init {
        System.loadLibrary("native-lib");
    }

    external fun stringFromJNI(): String

    companion object {
        fun show(context: Context) {
            Toast.makeText(context, Toaster().stringFromJNI(), Toast.LENGTH_LONG).show()
        }
    }
}