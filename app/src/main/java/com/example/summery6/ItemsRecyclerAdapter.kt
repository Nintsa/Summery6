//package com.example.summery6
//
//import android.view.LayoutInflater
//import android.view.ViewGroup
//import androidx.recyclerview.widget.ListAdapter
//import androidx.recyclerview.widget.RecyclerView
//import com.example.summery6.databinding.ItemsRecyclerBinding
//
//class ItemsRecyclerAdapter :
//    ListAdapter<Items, ItemsRecyclerAdapter.ItemsViewHolder>(object DiffUtil.ItemCallback<Items>() {
//
//
//
//    }) {
//       inner class ItemsViewHolder(private val binding: ItemsRecyclerBinding) :
//        RecyclerView.ViewHolder(binding.root)
//
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemsViewHolder {
//        ItemsRecyclerBinding.inflate(LayoutInflater.from(parent.context),parent,false)
//    }
//
//    override fun onBindViewHolder(holder: ItemsViewHolder, position: Int) {
//
//    }
//}