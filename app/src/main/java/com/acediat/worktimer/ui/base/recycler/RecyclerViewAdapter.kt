package com.acediat.worktimer.ui.base.recycler

import androidx.recyclerview.widget.RecyclerView

abstract class RecyclerViewAdapter private constructor() : RecyclerView.Adapter<AbstractViewHolder>() {

    protected val binders = listOf<() -> Unit>()

}