package com.kkr95.kotlinrecyclerview

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_intro.*

class IntroActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro)

        btn.setOnClickListener(object:View.OnClickListener{
            override fun onClick(v: View?) {
                var intent= Intent(this@IntroActivity, MainActivity::class.java)
                startActivity((intent))
            }
        })
    }

    fun clickExit(view: View) {
        finish()
    }
}