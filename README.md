# Android Tutorial From Mindork

This repository contains a multiple android tutorial from Mindork.

## [Android Architecture Using Jetpack Components: Sample App](https://github.com/MindorksOpenSource/android-architecture-jetpack-components)

Android Jetpack is a collection of Android software components which helps us in building great Android apps.

**Concept reference resources - [Android Jetpack](https://blog.mindorks.com/what-is-android-jetpack-and-why-should-we-use-it)**

## [MVVM Architecture Android Beginners: Sample App](https://github.com/MindorksOpenSource/MVVM-Architecture-Android-Beginners)

This repository contains a sample app that implements MVVM architecture using Kotlin, ViewModel, LiveData, and etc.

**Concept reference resources - [MVVM Architecture - Android Tutorial for Beginners - Step by Step Guide](https://blog.mindorks.com/mvvm-architecture-android-tutorial-for-beginners-step-by-step-guide)**

### The app has following packages:

1. **data**: It contains all the data accessing and manipulating components.
2. **ui**: View classes along with their corresponding ViewModel.
3. **utils**: Utility classes.

## [MVI Architecture Android Beginners: Sample App](https://github.com/MindorksOpenSource/MVI-Architecture-Android-Beginners)

This repository contains a sample app that implements MVI architecture using Kotlin, ViewModel, LiveData, and etc.

**Concept reference resources - [MVI Architecture - Android Tutorial for Beginners - Step by Step Guide](https://blog.mindorks.com/mvi-architecture-android-tutorial-for-beginners-step-by-step-guide)**

### The app has following packages:

1. **data**: It contains all the data accessing and manipulating components.
2. **ui**: View classes along with their corresponding ViewModel.
3. **utils**: Utility classes.

## [Dagger Hilt Tutorial - Step by Step Guide](https://github.com/MindorksOpenSource/Dagger-Hilt-Tutorial)

This repository contains a sample app that implements Dagger-Hilt in MVVM architecture using Kotlin.

**Concept reference resources - [Dagger Hilt Tutorial - Step by Step Guide](https://blog.mindorks.com/dagger-hilt-tutorial)**

### The app has following packages:

1. **data**: It contains all the data accessing and manipulating components.
2. **di**: It contains the files required by Dagger
3. **ui**: View classes along with their corresponding ViewModel.
4. **utils**: Utility classes.

## [Koin Tutorial - Step by Step Guide](https://github.com/MindorksOpenSource/Koin-Tutorial)

This repository contains a sample app that implements Koin in MVVM architecture using Kotlin.

**Concept reference resources - [Koin Tutorial - Step by Step Guide](https://blog.mindorks.com/kotlin-koin-tutorial)**

### The app has following packages:

1. **data**: It contains all the data accessing and manipulating components.
2. **di**: It contains the files required by Koin
3. **ui**: View classes along with their corresponding ViewModel.
4. **utils**: Utility classes.

## [Paging 3 Android Tutorial](https://github.com/MindorksOpenSource/Paging3-Android-Tutorial)

This repository contains a sample app that implements Paging 3 library in Android.

**Concept reference resources - [Paging 3 Android Tutorial](https://blog.mindorks.com/paging-3-tutorial)**

### The app has following packages:

1. **data**: It contains all the data class and the ApiService.
2. **adapter**: It contains the adapter for RecyclerView.

## [RxJava3 Android Examples](https://github.com/MindorksOpenSource/RxJava3-Android-Examples)

This project is for who is migrating to RxJava 3 from RxJava 2, and who is just getting started with RxJava.

**Concept reference resources - [RxJava3 Android Examples](https://blog.mindorks.com/a-complete-guide-to-learn-rxjava-b55c0cea3631)**

### RxJava 3 Operators Examples present in this sample project

- `Map` -> transform the items emitted by an Observable by applying a function to each item
- `Zip` -> combine the emissions of multiple Observables together via a specified function and emit single items for each combination based on the results of this function
- `Filter` -> emit only those items from an Observable that pass a predicate test
- `Concat` -> emit the emissions from two or more Observables without interleaving them
- `Merge` -> combine multiple Observables into one by merging their emissions
- `SwitchMap` -> transform the items emitted by an Observable into Observables, and mirror those items emitted by the most-recently transformed Observable
- `timer` -> do something after a span of time that we specify
- `delay` -> shift the emissions from an Observable forward in time by a particular amount
- `debounce` -> only emit an item from an Observable if a particular timespan has passed without it emitting another item
- `distinctUntilChanged` -> suppress duplicate items emitted by an Observable

## [Kotlin Coroutines Android Examples](https://github.com/MindorksOpenSource/Kotlin-Coroutines-Android-Examples)

### About this project:

- If you want to get started with Kotlin Coroutines for Android Development and wants to master it, then this project is for you.
- Common use-cases of Kotlin Coroutines in Android has been implemented in this project.
- Also, learn to write Unit-Test for ViewModel which uses Kotlin Coroutines.
- This is your one-stop solution for learning Kotlin Coroutines for Android Development.

**Concept reference resources - [Kotlin Coroutines](https://blog.mindorks.com/mastering-kotlin-coroutines-in-android-step-by-step-guide)**

### Kotlin Coroutines Examples for Android Development:

- **Single Network Call:** Learn how to make a network call using Kotlin Coroutines. This is a very simple use-case in Android App Development.
  - [Activity Code](https://github.com/MindorksOpenSource/Kotlin-Coroutines-Android-Examples/blob/master/app/src/main/java/com/mindorks/example/coroutines/learn/retrofit/single/SingleNetworkCallActivity.kt)
  - [ViewModel Code](https://github.com/MindorksOpenSource/Kotlin-Coroutines-Android-Examples/blob/master/app/src/main/java/com/mindorks/example/coroutines/learn/retrofit/single/SingleNetworkCallViewModel.kt)
- **Series Network Calls:** Learn how to make network calls in series using Kotlin Coroutines. This is useful when you want to make a network call which is dependent on an another network call.
  - [Activity Code](https://github.com/MindorksOpenSource/Kotlin-Coroutines-Android-Examples/blob/master/app/src/main/java/com/mindorks/example/coroutines/learn/retrofit/series/SeriesNetworkCallsActivity.kt)
  - [ViewModel Code](https://github.com/MindorksOpenSource/Kotlin-Coroutines-Android-Examples/blob/master/app/src/main/java/com/mindorks/example/coroutines/learn/retrofit/series/SeriesNetworkCallsViewModel.kt)
- **Parallel Network Calls:** Learn how to make network calls in parallel using Kotlin Coroutines. This is useful when you want to make network calls in parallel which are independent of each other.
  - [Activity Code](https://github.com/MindorksOpenSource/Kotlin-Coroutines-Android-Examples/blob/master/app/src/main/java/com/mindorks/example/coroutines/learn/retrofit/parallel/ParallelNetworkCallsActivity.kt)
  - [ViewModel Code](https://github.com/MindorksOpenSource/Kotlin-Coroutines-Android-Examples/blob/master/app/src/main/java/com/mindorks/example/coroutines/learn/retrofit/parallel/ParallelNetworkCallsViewModel.kt)
- **Room Database Operation:** Learn how to fetch or insert entity in database using Kotlin Coroutines. This is useful when you are using Room Database in your Android Application.
  - [Activity Code](https://github.com/MindorksOpenSource/Kotlin-Coroutines-Android-Examples/blob/master/app/src/main/java/com/mindorks/example/coroutines/learn/room/RoomDBActivity.kt)
  - [ViewModel Code](https://github.com/MindorksOpenSource/Kotlin-Coroutines-Android-Examples/blob/master/app/src/main/java/com/mindorks/example/coroutines/learn/room/RoomDBViewModel.kt)
- **Long Running Task:** Learn how to do a long running task using Kotlin Coroutines. If you want to do any of your task in background thread using the Kotlin Coroutines, then this is useful.
  - [Activity Code](https://github.com/MindorksOpenSource/Kotlin-Coroutines-Android-Examples/blob/master/app/src/main/java/com/mindorks/example/coroutines/learn/task/onetask/LongRunningTaskActivity.kt)
  - [ViewModel Code](https://github.com/MindorksOpenSource/Kotlin-Coroutines-Android-Examples/blob/master/app/src/main/java/com/mindorks/example/coroutines/learn/task/onetask/LongRunningTaskViewModel.kt)
- **Two Long Running Tasks:** Learn how to run two long running tasks in parallel using Kotlin Coroutines.
  - [Activity Code](https://github.com/MindorksOpenSource/Kotlin-Coroutines-Android-Examples/blob/master/app/src/main/java/com/mindorks/example/coroutines/learn/task/twotasks/TwoLongRunningTasksActivity.kt)
  - [ViewModel Code](https://github.com/MindorksOpenSource/Kotlin-Coroutines-Android-Examples/blob/master/app/src/main/java/com/mindorks/example/coroutines/learn/task/twotasks/TwoLongRunningTasksViewModel.kt)
- **Timeout:** Learn how to add timeout to a task using Kotlin Coroutines. If you want to add a timeout to any of your background task in Android, this is going to super useful.
  - [Activity Code](https://github.com/MindorksOpenSource/Kotlin-Coroutines-Android-Examples/blob/master/app/src/main/java/com/mindorks/example/coroutines/learn/timeout/TimeoutActivity.kt)
  - [ViewModel Code](https://github.com/MindorksOpenSource/Kotlin-Coroutines-Android-Examples/blob/master/app/src/main/java/com/mindorks/example/coroutines/learn/timeout/TimeoutViewModel.kt)
- **Try-Catch Error Handling:** Learn how to handle error in Kotlin Coroutines using Try-Catch.
  - [Activity Code](https://github.com/MindorksOpenSource/Kotlin-Coroutines-Android-Examples/blob/master/app/src/main/java/com/mindorks/example/coroutines/learn/errorhandling/trycatch/TryCatchActivity.kt)
  - [ViewModel Code](https://github.com/MindorksOpenSource/Kotlin-Coroutines-Android-Examples/blob/master/app/src/main/java/com/mindorks/example/coroutines/learn/errorhandling/trycatch/TryCatchViewModel.kt)
- **CoroutineExceptionHandler:** Learn how to handle error in Kotlin Coroutines using CoroutineExceptionHandler.
  - [Activity Code](https://github.com/MindorksOpenSource/Kotlin-Coroutines-Android-Examples/blob/master/app/src/main/java/com/mindorks/example/coroutines/learn/errorhandling/exceptionhandler/ExceptionHandlerActivity.kt)
  - [ViewModel Code](https://github.com/MindorksOpenSource/Kotlin-Coroutines-Android-Examples/blob/master/app/src/main/java/com/mindorks/example/coroutines/learn/errorhandling/exceptionhandler/ExceptionHandlerViewModel.kt)
- **Ignore Error And Continue:** Learn how to use `supervisorScope` to ignore error of a task and continue with other task. In other words, if more than two child jobs are running in parallel under a supervisor, one child job gets failed, we can continue with other.
  - [Activity Code](https://github.com/MindorksOpenSource/Kotlin-Coroutines-Android-Examples/blob/master/app/src/main/java/com/mindorks/example/coroutines/learn/errorhandling/supervisor/IgnoreErrorAndContinueActivity.kt)
  - [ViewModel Code](https://github.com/MindorksOpenSource/Kotlin-Coroutines-Android-Examples/blob/master/app/src/main/java/com/mindorks/example/coroutines/learn/errorhandling/supervisor/IgnoreErrorAndContinueViewModel.kt)
- **Unit Test:** Learn how write unit-test for ViewModel which uses Kotlin Coroutines.
  - [ViewModelTest Code](https://github.com/MindorksOpenSource/Kotlin-Coroutines-Android-Examples/blob/master/app/src/test/java/com/mindorks/example/coroutines/learn/retrofit/single/SingleNetworkCallViewModelTest.kt)

## [Kotlin-Flow-Android-Examples](https://github.com/MindorksOpenSource/Kotlin-Flow-Android-Examples)

### About this project:

- If you want to get started with Kotlin Flow, then this project is for you.
- Common use-cases of Kotlin Flow in Android has been implemented in this project.
- This is your one-stop solution for learning Kotlin Flow for Android Development.

**Concept reference resources - [Kotlin Flow](https://blog.mindorks.com/what-is-flow-in-kotlin-and-how-to-use-it-in-android-project)**

### Kotlin Flow Examples for Android Development:

- **Single Network Call:** Learn how to make a network call using Kotlin Flow. This is a very simple use-case in Android App Development.
  - [Activity Code](https://github.com/MindorksOpenSource/Kotlin-Flow-Android-Examples/blob/master/app/src/main/java/com/mindorks/kotlinFlow/learn/retrofit/single/SingleNetworkCallActivity.kt)
  - [ViewModel Code](https://github.com/MindorksOpenSource/Kotlin-Flow-Android-Examples/blob/master/app/src/main/java/com/mindorks/kotlinFlow/learn/retrofit/single/SingleNetworkCallViewModel.kt)
- **Series Network Call:** Learn how to make network calls in series using Kotlin Flow. This is useful when you want to make a network call which is dependent on an another network call.
  - [Activity Code](https://github.com/MindorksOpenSource/Kotlin-Flow-Android-Examples/blob/master/app/src/main/java/com/mindorks/kotlinFlow/learn/retrofit/series/SeriesNetworkCallsActivity.kt)
  - [ViewModel Code](https://github.com/MindorksOpenSource/Kotlin-Flow-Android-Examples/blob/master/app/src/main/java/com/mindorks/kotlinFlow/learn/retrofit/series/SeriesNetworkCallsViewModel.kt)
- **Parallel Network Call:** Learn how to make network calls in parallel using Kotlin Flow. This is useful when you want to make a network call which is dependent on an another network call.
  - [Activity Code](https://github.com/MindorksOpenSource/Kotlin-Flow-Android-Examples/blob/master/app/src/main/java/com/mindorks/kotlinFlow/learn/retrofit/parallel/ParallelNetworkCallsActivity.kt)
  - [ViewModel Code](https://github.com/MindorksOpenSource/Kotlin-Flow-Android-Examples/blob/master/app/src/main/java/com/mindorks/kotlinFlow/learn/retrofit/parallel/ParallelNetworkCallsViewModel.kt)
- **Room Database Operation:** Learn how to fetch or insert entity in database using Kotlin Flow. This is useful when you are using Room Database in your Android Application.
  - [Activity Code](https://github.com/MindorksOpenSource/Kotlin-Flow-Android-Examples/blob/master/app/src/main/java/com/mindorks/kotlinFlow/learn/room/RoomDBActivity.kt)
  - [ViewModel Code](https://github.com/MindorksOpenSource/Kotlin-Flow-Android-Examples/blob/master/app/src/main/java/com/mindorks/kotlinFlow/learn/room/RoomDBViewModel.kt)
- **Long Running Task:** Learn how to do a long running task using Kotlin Flow. If you want to do any of your task in background thread using the Kotlin Flow, then this is useful.
  - [Activity Code](https://github.com/MindorksOpenSource/Kotlin-Flow-Android-Examples/blob/master/app/src/main/java/com/mindorks/kotlinFlow/learn/task/onetask/LongRunningTaskActivity.kt)
  - [ViewModel Code](https://github.com/MindorksOpenSource/Kotlin-Flow-Android-Examples/blob/master/app/src/main/java/com/mindorks/kotlinFlow/learn/task/onetask/LongRunningTaskViewModel.kt)
- **Two Long Running Tasks:** Learn how to run two long running tasks in parallel using Kotlin Flow.
  - [Activity Code](https://github.com/MindorksOpenSource/Kotlin-Flow-Android-Examples/blob/master/app/src/main/java/com/mindorks/kotlinFlow/learn/task/twotasks/TwoLongRunningTasksActivity.kt)
  - [ViewModel Code](https://github.com/MindorksOpenSource/Kotlin-Flow-Android-Examples/blob/master/app/src/main/java/com/mindorks/kotlinFlow/learn/task/twotasks/TwoLongRunningTasksViewModel.kt)
- **Catch Error Handling:** Learn how to handle error in Kotlin Flow using Catch.
  - [Activity Code](https://github.com/MindorksOpenSource/Kotlin-Flow-Android-Examples/blob/master/app/src/main/java/com/mindorks/kotlinFlow/learn/errorhandling/catch/CatchActivity.kt)
  - [ViewModel Code](https://github.com/MindorksOpenSource/Kotlin-Flow-Android-Examples/blob/master/app/src/main/java/com/mindorks/kotlinFlow/learn/errorhandling/catch/CatchViewModel.kt)
- **EmitAll Error Handling:** Learn how to handle error in Kotlin Flow using emitAll.
  - [Activity Code](https://github.com/MindorksOpenSource/Kotlin-Flow-Android-Examples/blob/master/app/src/main/java/com/mindorks/kotlinFlow/learn/errorhandling/emitall/EmitAllActivity.kt)
  - [ViewModel Code](https://github.com/MindorksOpenSource/Kotlin-Flow-Android-Examples/blob/master/app/src/main/java/com/mindorks/kotlinFlow/learn/errorhandling/emitall/EmitAllViewModel.kt)
- **Completion:**
  - [Activity Code](https://github.com/MindorksOpenSource/Kotlin-Flow-Android-Examples/blob/master/app/src/main/java/com/mindorks/kotlinFlow/learn/completion/CompletionActivity.kt)
  - [ViewModel Code](https://github.com/MindorksOpenSource/Kotlin-Flow-Android-Examples/blob/master/app/src/main/java/com/mindorks/kotlinFlow/learn/completion/CompletionViewModel.kt)
- **Reduce:**
  - [Activity Code](https://github.com/MindorksOpenSource/Kotlin-Flow-Android-Examples/blob/master/app/src/main/java/com/mindorks/kotlinFlow/learn/reduce/ReduceActivity.kt)
  - [ViewModel Code](https://github.com/MindorksOpenSource/Kotlin-Flow-Android-Examples/blob/master/app/src/main/java/com/mindorks/kotlinFlow/learn/reduce/ReduceViewModel.kt)
- **Map:**
  - [Activity Code](https://github.com/MindorksOpenSource/Kotlin-Flow-Android-Examples/blob/master/app/src/main/java/com/mindorks/kotlinFlow/learn/map/MapActivity.kt)
  - [ViewModel Code](https://github.com/MindorksOpenSource/Kotlin-Flow-Android-Examples/blob/master/app/src/main/java/com/mindorks/kotlinFlow/learn/map/MapViewModel.kt)
- **Filter:**
  - [Activity Code](https://github.com/MindorksOpenSource/Kotlin-Flow-Android-Examples/blob/master/app/src/main/java/com/mindorks/kotlinFlow/learn/filter/FilterActivity.kt)
  - [ViewModel Code](https://github.com/MindorksOpenSource/Kotlin-Flow-Android-Examples/blob/master/app/src/main/java/com/mindorks/kotlinFlow/learn/filter/FilterViewModel.kt)
- **Search Feature:** Implement Search Using Kotlin Flow Operators - Debounce, Filter, DistinctUntilChanged, FlatMapLatest.
  - [Activity Code](https://github.com/MindorksOpenSource/Kotlin-Flow-Android-Examples/blob/master/app/src/main/java/com/mindorks/kotlinFlow/learn/search/SearchActivity.kt)
- **Retry:**
  - [Activity Code](https://github.com/MindorksOpenSource/Kotlin-Flow-Android-Examples/blob/master/app/src/main/java/com/mindorks/kotlinFlow/learn/retry/RetryActivity.kt)
  - [ViewModel Code](https://github.com/MindorksOpenSource/Kotlin-Flow-Android-Examples/blob/master/app/src/main/java/com/mindorks/kotlinFlow/learn/retry/RetryViewModel.kt)
- **RetryWhen:**
  - [Activity Code](https://github.com/MindorksOpenSource/Kotlin-Flow-Android-Examples/blob/master/app/src/main/java/com/mindorks/kotlinFlow/learn/retrywhen/RetryWhenActivity.kt)
  - [ViewModel Code](https://github.com/MindorksOpenSource/Kotlin-Flow-Android-Examples/blob/master/app/src/main/java/com/mindorks/kotlinFlow/learn/retrywhen/RetryWhenViewModel.kt)
- **Retry with Exponential Backoff:**
  - [Activity Code](https://github.com/MindorksOpenSource/Kotlin-Flow-Android-Examples/blob/master/app/src/main/java/com/mindorks/kotlinFlow/learn/retryexponentialbackoff/RetryExponentialBackoffActivity.kt)
  - [ViewModel Code](https://github.com/MindorksOpenSource/Kotlin-Flow-Android-Examples/blob/master/app/src/main/java/com/mindorks/kotlinFlow/learn/retryexponentialbackoff/RetryExponentialBackoffModel.kt)