package com.kkr95.kotlinrecyclerview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_item.*

class ItemActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_item)

        val title= intent.getStringExtra("title")
        val msg= intent.getStringExtra("msg")
        val img= intent.getIntExtra("img", R.drawable.moana01)

        supportActionBar!!.title= title

        tv.text= msg
        Picasso.get().load(img).into(iv)
    }
}