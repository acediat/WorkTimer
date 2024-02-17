package com.acediat.worktimer.entities

import org.threeten.bp.LocalDateTime

data class TimerInfo(
    val id: Int,
    val name: String,
    val startTime: LocalDateTime,
    val limitTime: LocalDateTime,
)
