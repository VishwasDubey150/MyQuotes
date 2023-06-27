package com.example.myquotes

import android.content.Context
import android.renderscript.ScriptGroup.Binding
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myquotes.databinding.ListTemBinding

class rvadapter (var context: Context,var quoteList: List<DataEntity>):RecyclerView.Adapter<rvadapter.ViewHolder>() {
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): rvadapter.ViewHolder {
            val view=ListTemBinding.inflate(LayoutInflater.from(context),parent,false)
            return ViewHolder(view)
        }


        override fun getItemCount(): Int {
            return quoteList.size
        }

        override fun onBindViewHolder(holder: rvadapter.ViewHolder, position: Int) {
            holder.binding.tv.text=quoteList.get(position).quote

        }
    class ViewHolder(var binding: ListTemBinding):RecyclerView.ViewHolder(binding.root)
}