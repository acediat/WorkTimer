package com.acediat.worktimer.database

import androidx.room.Database

@Database(
    entities = [TimerEntity::class],
    version = 1,
)
class ApplicationDatabase {
}