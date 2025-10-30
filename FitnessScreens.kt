package com.yourpackage.ui

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.yourpackage.ExerciseLog
import com.yourpackage.FitnessViewModel

@Composable
fun StepCounterScreen(viewModel: FitnessViewModel) {
    val logs by viewModel.allLogs.collectAsState()

    LazyColumn(modifier = Modifier.fillMaxSize().padding(16.dp)) {
        items(logs) { log ->
            Card(modifier = Modifier.fillMaxWidth().padding(8.dp)) {
                Column(modifier = Modifier.padding(8.dp)) {
                    Text("Activity: ${log.activity}")
                    Text("Duration: ${log.duration} mins")
                    Text("Calories: ${log.caloriesBurned}")
                    Text("Date: ${log.date}")
                    Button(onClick = { viewModel.delete(log) }) {
                        Text("Delete")
                    }
                }
            }
        }
    }
}

@Composable
fun ActivityEntryScreen(viewModel: FitnessViewModel) {
    var activity by remember { mutableStateOf("") }
    var durationText by remember { mutableStateOf("") }
    var caloriesText by remember { mutableStateOf("") }
    var date by remember { mutableStateOf("") }

    Column(modifier = Modifier.fillMaxSize().padding(16.dp)) {
        OutlinedTextField(value = activity, onValueChange = { activity = it }, label = { Text("Activity") })
        OutlinedTextField(value = durationText, onValueChange = { durationText = it }, label = { Text("Duration (mins)") })
        OutlinedTextField(value = caloriesText, onValueChange = { caloriesText = it }, label = { Text("Calories Burned") })
        OutlinedTextField(value = date, onValueChange = { date = it }, label = { Text("Date") })

        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = {
            val duration = durationText.toIntOrNull() ?: 0
            val calories = caloriesText.toIntOrNull() ?: 0
            if (activity.isNotBlank() && date.isNotBlank()) {
                viewModel.insert(ExerciseLog(activity = activity, duration = duration, caloriesBurned = calories, date = date))
                activity = ""
                durationText = ""
                caloriesText = ""
                date = ""
            }
        }) {
            Text("Add Activity")
        }
    }
}
