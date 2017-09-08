package com.lx.kotlinfirst.view

import android.graphics.*
import android.graphics.drawable.Drawable

/**
 * Created on 17-9-8 下午1:55
 */
class TriangleDrawable() : Drawable() {

    override fun draw(canvas: Canvas?) {
        canvas!!.drawColor(Color.TRANSPARENT)
        var path = Path()
        path.lineTo(150f, 0f)
        path.lineTo(150f, 150f)
        path.close()
        var paint = Paint()
        paint.isAntiAlias = true
        paint.color = Color.BLUE
        canvas!!.drawPath(path, Paint())
    }

    override fun setAlpha(p0: Int) {
    }

    override fun getOpacity(): Int {
        return 1
    }

    override fun setColorFilter(p0: ColorFilter?) {


    }



}
