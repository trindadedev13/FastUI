package dev.trindadedev.fastui.shape

import android.view.View

fun View.shape(shape: Shape) {
  shape.applyTo(this)
}