package com.acediat.worktimer.ui

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.acediat.worktimer.databinding.ItemTimerBinding
import com.acediat.worktimer.entities.TimerInfo
import com.acediat.worktimer.ui.ext.inflater

class TimersAdapter : RecyclerView.Adapter<TimersAdapter.TimerViewHolder>() {

    private val timers = mutableListOf<TimerInfo>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TimerViewHolder {
        return TimerViewHolder(ItemTimerBinding.inflate(parent.inflater, parent, false))
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: TimerViewHolder, position: Int) {

    }

    class TimerViewHolder(
        private val binding: ItemTimerBinding,
    ) : RecyclerView.ViewHolder(binding.root) {
        fun bind(timer: TimerInfo) = with(binding) {

        }
    }
}