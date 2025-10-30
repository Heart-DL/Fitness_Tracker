package com.yourpackage

import androidx.room.*
import kotlinx.coroutines.flow.Flow

@Dao
interface ExerciseLogDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertExerciseLog(log: ExerciseLog)

    @Delete
    suspend fun deleteExerciseLog(log: ExerciseLog)

    @Query("SELECT * FROM exercise_log ORDER BY date DESC")
    fun getAllExerciseLogs(): Flow<List<ExerciseLog>>
}
