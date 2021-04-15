package com.stjdans.libssm

import android.content.Context
import android.widget.Toast

object LibSsm {

    fun showToase(context: Context) {
        Toast.makeText(context, "LibSsm 에서 표시합니다.", Toast.LENGTH_LONG).show()
    }
}