package com.livinglifetechway.k4kotlin

import android.content.Context
import android.support.annotation.ColorRes
import android.support.v4.content.ContextCompat

/**
 * Get color from ContextCompat.getColor(context,color)
 */
fun Context.getColorCompat(@ColorRes color: Int) = ContextCompat.getColor(this, color)
