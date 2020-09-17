package com.kkr95.kotlinrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var items = ArrayList<ItemVO>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        items.add(ItemVO("sam", "Hello. Kotlin", R.drawable.moana01))
        items.add(ItemVO("robin", "Nice. Kotlin", R.drawable.moana02))
        items.add(ItemVO("tom", "Have a good day", R.drawable.moana03))
        items.add(ItemVO("lee", "Do you have fun", R.drawable.moana04))
        items.add(ItemVO("rosa", "Good afternoon", R.drawable.moana05))
        items.add(ItemVO("sam", "Hello. Kotlin", R.drawable.moana01))
        items.add(ItemVO("robin", "Nice. Kotlin", R.drawable.moana02))
        items.add(ItemVO("tom", "Have a good day", R.drawable.moana03))
        items.add(ItemVO("lee", "Do you have fun", R.drawable.moana04))
        items.add(ItemVO("rosa", "Good afternoon", R.drawable.moana05))

        recycler.adapter = MyAdapter(this, items)

        recycler.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
    }

    override fun onResume() {
        super.onResume()

        recycler.adapter!!.notifyDataSetChanged()
    }
}