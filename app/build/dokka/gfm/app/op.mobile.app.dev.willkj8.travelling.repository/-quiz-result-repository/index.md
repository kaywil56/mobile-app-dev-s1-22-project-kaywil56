//[app](../../../index.md)/[op.mobile.app.dev.willkj8.travelling.repository](../index.md)/[QuizResultRepository](index.md)

# QuizResultRepository

[androidJvm]\
class [QuizResultRepository](index.md)(QuizResultDao: [IQuizResultDao](../../op.mobile.app.dev.willkj8.travelling.database/-i-quiz-result-dao/index.md))

A repository class for quiz results.

Isolates quiz results DB from the rest of the app

## Parameters

androidJvm

| | |
|---|---|
| QuizResultDao | The quiz result Dao |

## Constructors

| | |
|---|---|
| [QuizResultRepository](-quiz-result-repository.md) | [androidJvm]<br>fun [QuizResultRepository](-quiz-result-repository.md)(QuizResultDao: [IQuizResultDao](../../op.mobile.app.dev.willkj8.travelling.database/-i-quiz-result-dao/index.md)) |

## Functions

| Name | Summary |
|---|---|
| [deleteAllQuizResultsDetail](delete-all-quiz-results-detail.md) | [androidJvm]<br>@[WorkerThread](https://developer.android.com/reference/kotlin/androidx/annotation/WorkerThread.html)<br>fun [deleteAllQuizResultsDetail](delete-all-quiz-results-detail.md)() |
| [insertQuizResultDetail](insert-quiz-result-detail.md) | [androidJvm]<br>@[WorkerThread](https://developer.android.com/reference/kotlin/androidx/annotation/WorkerThread.html)<br>fun [insertQuizResultDetail](insert-quiz-result-detail.md)(quiz_result: [QuizResult](../../op.mobile.app.dev.willkj8.travelling.model/-quiz-result/index.md)) |

## Properties

| Name | Summary |
|---|---|
| [allResultDetails](all-result-details.md) | [androidJvm]<br>val [allResultDetails](all-result-details.md): Flow&lt;[List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[QuizResult](../../op.mobile.app.dev.willkj8.travelling.model/-quiz-result/index.md)&gt;&gt; |
