package com.example.animatednavigationbar

import android.app.Activity
import android.widget.Toast

fun Activity.showToast(message: String): Boolean {
    Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    return true
}