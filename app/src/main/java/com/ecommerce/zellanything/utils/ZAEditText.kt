package com.ecommerce.zellanything.utils

import android.content.Context
import android.graphics.Typeface
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatEditText

class ZAEditText (context: Context, attrs: AttributeSet) : AppCompatEditText(context, attrs) {

    init {

        applyFont()

    }

    private fun applyFont() {
// Esto se usa para obtener el archivo de la carpeta de activos y establecerlo en el título textView.
        val typeface: Typeface =
            Typeface.createFromAsset(context.assets, "Montserrat-Regular.ttf")
        setTypeface(typeface)
    }

}