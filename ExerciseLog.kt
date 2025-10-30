package com.yourpackage

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "exercise_log")
data class ExerciseLog(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val date: String,
    val activity: String,
    val duration: Int,
    val caloriesBurned: Int
)
