package com.example.linah_alkhurayyif_recyclerviewactivity

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.userinfo.view.*

class InfoRV_Adapter(private val userinfos:ArrayList<String>,private val userinfotitles:ArrayList<String>): RecyclerView.Adapter<InfoRV_Adapter.MyViewHolder>() {
    class MyViewHolder(itemView: View):RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(
            R.layout.userinfo,
            parent,
            false
        )
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val userinfo=userinfos[position]
        val userinfotitle=userinfotitles[position]
        holder.itemView.apply{
            etext_title.text = userinfotitle
            etext.text = userinfo
        }

    }

    override fun getItemCount()=userinfos.size
}