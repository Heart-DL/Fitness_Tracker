# Fitness_Tracker
Overview
This Fitness Tracker is a modern Android application developed as part of a virtual internship program supported by AICTE and Google for Developers. The app enables users to log fitness activities such as workouts, recording details like activity type, duration, and calories burned. It supports daily, weekly, and monthly tracking, providing a clean, scrollable list of past activities.

The project aims to implement fundamental CRUD (Create, Read, Update, Delete) operations using a modern, decoupled architecture to ensure scalable and maintainable code with an enhanced user experience.

Features
Create: Add new fitness activities with details including type of activity, duration, and calories burned.

Read: View all logged fitness activities in a categorized, scrollable list to monitor progress.

Delete: Remove fitness activities that are incorrect or no longer relevant.

Responsive UI built with Jetpack Compose that reflects real-time data changes.

Persistent local storage using Room database, ensuring offline access to activity logs.

Technology Stack
Language: Kotlin – the modern, concise, and official language for Android development.

UI Toolkit: Jetpack Compose – a declarative UI framework for building native Android interfaces.

Architecture: MVVM (Model-View-ViewModel) – promotes separation of concerns and maintainability.

Database: Room – a modern SQLite abstraction library, supporting asynchronous and efficient data operations.

Asynchronous Programming: Kotlin Coroutines for smooth background task execution without freezing the UI.

Architecture Highlights
View (Jetpack Compose): Stateless, reactive UI components that update automatically when underlying data changes.

ViewModel: Handles business logic and exposes observable data streams to the UI.

Model (Repository + Room Database): Handles all data-related operations, maintaining persistence and data consistency.

Learning Outcomes
Mastery of state management in Compose and effective use of Kotlin Flow and LiveData for reactive UI.

Hands-on experience with asynchronous programming in Kotlin using coroutines to ensure responsive apps.

Practical understanding of integrating MVVM architecture with Room for scalable, clean Android applications.

