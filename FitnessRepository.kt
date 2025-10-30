package com.yourpackage

import kotlinx.coroutines.flow.Flow

class FitnessRepository(private val dao: ExerciseLogDao) {
    val allExerciseLogs: Flow<List<ExerciseLog>> = dao.getAllExerciseLogs()

    suspend fun insert(log: ExerciseLog) = dao.insertExerciseLog(log)
    suspend fun delete(log: ExerciseLog) = dao.deleteExerciseLog(log)
}
