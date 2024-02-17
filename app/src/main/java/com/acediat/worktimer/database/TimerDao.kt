package com.acediat.worktimer.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface TimerDao {

    @Query("select * from timers")
    suspend fun gelAllTimers(): List<TimerEntity>

    @Insert
    suspend fun insertTimer(timer: TimerEntity)
}