package com.yourpackage

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch

class FitnessViewModel(application: Application) : AndroidViewModel(application) {
    private val repository: FitnessRepository

    val allLogs: StateFlow<List<ExerciseLog>>

    init {
        val dao = FitnessDatabase.getDatabase(application).exerciseLogDao()
        repository = FitnessRepository(dao)
        allLogs = repository.allExerciseLogs.stateIn(
            viewModelScope,
            SharingStarted.Lazily,
            emptyList()
        )
    }

    fun insert(log: ExerciseLog) = viewModelScope.launch {
        repository.insert(log)
    }

    fun delete(log: ExerciseLog) = viewModelScope.launch {
        repository.delete(log)
    }
}
