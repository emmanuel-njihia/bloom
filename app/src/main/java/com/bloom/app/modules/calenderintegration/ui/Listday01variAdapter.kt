package com.bloom.app.modules.calenderintegration.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bloom.app.R
import com.bloom.app.databinding.RowListday01variBinding
import com.bloom.app.modules.calenderintegration.`data`.model.Listday01variRowModel
import kotlin.Int
import kotlin.collections.List

class Listday01variAdapter(
  var list: List<Listday01variRowModel>
) : RecyclerView.Adapter<Listday01variAdapter.RowListday01variVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListday01variVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listday01vari,parent,false)
    return RowListday01variVH(view)
  }

  override fun onBindViewHolder(holder: RowListday01variVH, position: Int) {
    val listday01variRowModel = Listday01variRowModel()
    // TODO uncomment following line after integration with data source
    // val listday01variRowModel = list[position]
    holder.binding.listday01variRowModel = listday01variRowModel
  }

  override fun getItemCount(): Int = 6
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Listday01variRowModel>) {
    list = newData
    notifyDataSetChanged()
  }

  fun setOnItemClickListener(clickListener: OnItemClickListener) {
    this.clickListener = clickListener
  }

  interface OnItemClickListener {
    fun onItemClick(
      view: View,
      position: Int,
      item: Listday01variRowModel
    ) {
    }
  }

  inner class RowListday01variVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListday01variBinding = RowListday01variBinding.bind(itemView)
  }
}
