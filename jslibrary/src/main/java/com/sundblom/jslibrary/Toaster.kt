package com.sundblom.jslibrary

import android.content.Context
import android.widget.Toast

class Toaster {

    companion object {
        fun show(context: Context) {
            Toast.makeText(context, "Hello!!", Toast.LENGTH_LONG).show()
        }
    }
}