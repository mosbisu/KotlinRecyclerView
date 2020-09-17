package com.kkr95.kotlinrecyclerview

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.recycler_item.view.*

class MyAdapter constructor(val context: Context, val items:ArrayList<ItemVO>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val layoutInflater= LayoutInflater.from(context)
        val itemView= layoutInflater.inflate(R.layout.recycler_item, parent, false)
        val vh= VH(itemView)
        return vh
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val vh= holder as VH
        val item= items.get(position)
        vh.itemView.tvTitle.setText(item.title)
        vh.itemView.tvMsg.text= item.msg
        Picasso.get().load(item.img).into(vh.itemView.iv)
    }

    inner class VH (itemView: View) : RecyclerView.ViewHolder(itemView){

        init {
            itemView.setOnClickListener(object : View.OnClickListener{
                override fun onClick(v: View?) {
                    val intent= Intent(context, ItemActivity::class.java)
                    intent.putExtra("title", items.get(layoutPosition).title)
                    intent.putExtra("msg", items.get(layoutPosition).msg)
                    intent.putExtra("img", items.get(layoutPosition).img)

                    context.startActivity(intent)
                }
            })
        }
    }
}