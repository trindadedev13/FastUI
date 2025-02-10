package dev.trindadedev.fastui.shape

import android.graphics.drawable.ColorDrawable
import android.graphics.drawable.GradientDrawable
import android.view.View

/**
 * A utility class for creating rounded corner shapes using [GradientDrawable].  
 * This class extracts the background color from the given view (if it's a [ColorDrawable])  
 * and applies rounded corners based on the provided radii values.
 */
class RoundedCornersShape {

  /** The drawable representing the rounded shape. */
  private val drawable = GradientDrawable()

  /**
   * Creates a [RoundedCornersShape] with the specified corner radii.
   *
   * @param topStart The radius for the top-left corner.
   * @param topEnd The radius for the top-right corner.
   * @param bottomEnd The radius for the bottom-right corner.
   * @param bottomStart The radius for the bottom-left corner.
   */
  constructor(
    topStart: Float = 0f,
    topEnd: Float = 0f,
    bottomEnd: Float = 0f,
    bottomStart: Float = 0f
  ) {
    drawable.shape = GradientDrawable.RECTANGLE
    drawable.cornerRadii = floatArrayOf(
      topStart, topStart,
      topEnd, topEnd,
      bottomEnd, bottomEnd,
      bottomStart, bottomStart
    )
  }

  /**
   * Creates a [RoundedCornersShape] with the specified corner radii but in int.
   *
   * @param topStart The radius for the top-left corner.
   * @param topEnd The radius for the top-right corner.
   * @param bottomEnd The radius for the bottom-right corner.
   * @param bottomStart The radius for the bottom-left corner.
   */
  constructor(
    topStart: Int = 0,
    topEnd: Int = 0,
    bottomEnd: Int = 0,
    bottomStart: Int = 0
  ) {
    drawable.shape = GradientDrawable.RECTANGLE
    drawable.cornerRadii = floatArrayOf(
      topStart.toFloat(), topStart.toFloat(),
      topEnd.toFloat(), topEnd.toFloat(),
      bottomEnd.toFloat(), bottomEnd.toFloat(),
      bottomStart.toFloat(), bottomStart.toFloat()
    )
  }

  /**
   * Creates a [RoundedCornersShape] with the same radius value in all corners.
   *
   * @param all The radius value to be used in all corners.
   */
  constructor(all: Float) : this(all, all, all, all)

  /**
   * Creates a [RoundedCornersShape] with the same radius value in all corners but in int.
   *
   * @param all The radius value to be used in all corners.
   */
  constructor(all: Int) : this(all, all, all, all)

  /**
   * Applies the shaped background.
   *
   * @param view View to be applied.
   */
  fun applyTo(view: View) {
    val viewDrawable = view.background
    if (viewDrawable is ColorDrawable) {
      drawable.setColor(viewDrawable.color)
    }
    view.background = drawable
  }
}