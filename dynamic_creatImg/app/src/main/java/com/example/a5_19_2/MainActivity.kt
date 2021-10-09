package com.example.a5_19_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        buildGUI()
    }

    fun buildGUI()
    {
        var imgId= arrayOf(R.drawable.edu1,R.drawable.edu2,R.drawable.edu3,R.drawable.edu4)

        for(i in 0..3)
        {
            linearLayout.addView(addImg(imgId[i]))
        }

        linearLayout.addView(addImg(R.drawable.edu1))
        linearLayout.addView(addImg(R.drawable.edu2))
        linearLayout.addView(addImg(R.drawable.edu3))
        linearLayout.addView(addImg(R.drawable.edu4))
    }

        fun addImg(imgId:Int):ImageView{
            val imgview1=ImageView(this)
            val param1=LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT)

            param1.setMargins(10,5,10,5)
            param1.gravity=Gravity.CENTER

            imgview1.layoutParams=param1
            imgview1.setImageResource(imgId)
            return imgview1
        }
}
