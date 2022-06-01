//[app](../../../index.md)/[op.mobile.app.dev.willkj8.travelling.ui.quiz](../index.md)/[QuizViewModel](index.md)

# QuizViewModel

[androidJvm]\
class [QuizViewModel](index.md)(_country: [Country](../../op.mobile.app.dev.willkj8.travelling.model/-country/index.md)) : [ViewModel](https://developer.android.com/reference/kotlin/androidx/lifecycle/ViewModel.html)

A view model class for the quiz.

This class handles data related to the quiz ui.

## Parameters

androidJvm

| | |
|---|---|
| _country | The selected country object |

## Constructors

| | |
|---|---|
| [QuizViewModel](-quiz-view-model.md) | [androidJvm]<br>fun [QuizViewModel](-quiz-view-model.md)(_country: [Country](../../op.mobile.app.dev.willkj8.travelling.model/-country/index.md)) |

## Types

| Name | Summary |
|---|---|
| [Companion](-companion/index.md) | [androidJvm]<br>object [Companion](-companion/index.md) |

## Functions

| Name | Summary |
|---|---|
| [addQuestionIdx](add-question-idx.md) | [androidJvm]<br>fun [addQuestionIdx](add-question-idx.md)()<br>This function increments the amount a questions that have been answered. |
| [addScore](add-score.md) | [androidJvm]<br>fun [addScore](add-score.md)()<br>This function adds 1 to the total score. |
| [clear](../../op.mobile.app.dev.willkj8.travelling.ui.tools/-tools-view-model/index.md#-1936886459%2FFunctions%2F-912451524) | [androidJvm]<br>@[MainThread](https://developer.android.com/reference/kotlin/androidx/annotation/MainThread.html)<br>fun [clear](../../op.mobile.app.dev.willkj8.travelling.ui.tools/-tools-view-model/index.md#-1936886459%2FFunctions%2F-912451524)() |
| [getTag](../../op.mobile.app.dev.willkj8.travelling.ui.tools/-tools-view-model/index.md#-215894976%2FFunctions%2F-912451524) | [androidJvm]<br>open fun &lt;[T](../../op.mobile.app.dev.willkj8.travelling.ui.tools/-tools-view-model/index.md#-215894976%2FFunctions%2F-912451524) : [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)&gt; [getTag](../../op.mobile.app.dev.willkj8.travelling.ui.tools/-tools-view-model/index.md#-215894976%2FFunctions%2F-912451524)(p0: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): [T](../../op.mobile.app.dev.willkj8.travelling.ui.tools/-tools-view-model/index.md#-215894976%2FFunctions%2F-912451524) |
| [isFinished](is-finished.md) | [androidJvm]<br>fun [isFinished](is-finished.md)()<br>This function sets the quiz to finished. |
| [setQuestion](set-question.md) | [androidJvm]<br>fun [setQuestion](set-question.md)()<br>This function retrieves a question and shuffles the answers. |
| [setTagIfAbsent](../../op.mobile.app.dev.willkj8.travelling.ui.tools/-tools-view-model/index.md#-1567230750%2FFunctions%2F-912451524) | [androidJvm]<br>open fun &lt;[T](../../op.mobile.app.dev.willkj8.travelling.ui.tools/-tools-view-model/index.md#-1567230750%2FFunctions%2F-912451524) : [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)&gt; [setTagIfAbsent](../../op.mobile.app.dev.willkj8.travelling.ui.tools/-tools-view-model/index.md#-1567230750%2FFunctions%2F-912451524)(p0: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), p1: [T](../../op.mobile.app.dev.willkj8.travelling.ui.tools/-tools-view-model/index.md#-1567230750%2FFunctions%2F-912451524)): [T](../../op.mobile.app.dev.willkj8.travelling.ui.tools/-tools-view-model/index.md#-1567230750%2FFunctions%2F-912451524) |
| [startTimer](start-timer.md) | [androidJvm]<br>fun [startTimer](start-timer.md)()<br>This function starts a timer. |

## Properties

| Name | Summary |
|---|---|
| [answers](answers.md) | [androidJvm]<br>val [answers](answers.md): [LiveData](https://developer.android.com/reference/kotlin/androidx/lifecycle/LiveData.html)&lt;[MutableList](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-list/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt;&gt; |
| [country](country.md) | [androidJvm]<br>var [country](country.md): [Country](../../op.mobile.app.dev.willkj8.travelling.model/-country/index.md) |
| [isFinished](is-finished.md) | [androidJvm]<br>val [isFinished](is-finished.md): [LiveData](https://developer.android.com/reference/kotlin/androidx/lifecycle/LiveData.html)&lt;[Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)&gt; |
| [questionIdx](question-idx.md) | [androidJvm]<br>val [questionIdx](question-idx.md): [LiveData](https://developer.android.com/reference/kotlin/androidx/lifecycle/LiveData.html)&lt;[Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)&gt; |
| [quiz](quiz.md) | [androidJvm]<br>val [quiz](quiz.md): [LiveData](https://developer.android.com/reference/kotlin/androidx/lifecycle/LiveData.html)&lt;[Quiz](../../op.mobile.app.dev.willkj8.travelling.model/-quiz/index.md)&gt; |
| [score](score.md) | [androidJvm]<br>val [score](score.md): [LiveData](https://developer.android.com/reference/kotlin/androidx/lifecycle/LiveData.html)&lt;[Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)&gt; |
| [timeString](time-string.md) | [androidJvm]<br>val [timeString](time-string.md): [LiveData](https://developer.android.com/reference/kotlin/androidx/lifecycle/LiveData.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt; |
