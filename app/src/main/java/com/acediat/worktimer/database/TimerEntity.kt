package com.acediat.worktimer.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "timers")
data class TimerEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val name: String,
    @ColumnInfo("start_time")
    val startTime: String,
    @ColumnInfo("stop_time")
    val stopTime: String,
    @ColumnInfo("limit_info")
    val limitTime: String,
)