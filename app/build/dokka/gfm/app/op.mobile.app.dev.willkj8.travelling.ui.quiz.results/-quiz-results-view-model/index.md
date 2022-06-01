//[app](../../../index.md)/[op.mobile.app.dev.willkj8.travelling.ui.quiz.results](../index.md)/[QuizResultsViewModel](index.md)

# QuizResultsViewModel

[androidJvm]\
class [QuizResultsViewModel](index.md)(_score: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), _countryId: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), _email: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), _userId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), _countryName: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), repository: [QuizResultRepository](../../op.mobile.app.dev.willkj8.travelling.repository/-quiz-result-repository/index.md)) : [ViewModel](https://developer.android.com/reference/kotlin/androidx/lifecycle/ViewModel.html)

A view model class for the quiz results.

This class handles data related to the quiz results ui.

## Parameters

androidJvm

| | |
|---|---|
| _score | The final score for the quiz |
| _countryId | The country ID of the quiz taken |
| _email | The email of the current user |
| _userId | The ID of the current user |
| _countryName | The country name of the quiz taken |
| repository | The repo for the quiz results |

## Constructors

| | |
|---|---|
| [QuizResultsViewModel](-quiz-results-view-model.md) | [androidJvm]<br>fun [QuizResultsViewModel](-quiz-results-view-model.md)(_score: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), _countryId: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), _email: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), _userId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), _countryName: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), repository: [QuizResultRepository](../../op.mobile.app.dev.willkj8.travelling.repository/-quiz-result-repository/index.md)) |

## Functions

| Name | Summary |
|---|---|
| [clear](../../op.mobile.app.dev.willkj8.travelling.ui.tools/-tools-view-model/index.md#-1936886459%2FFunctions%2F-912451524) | [androidJvm]<br>@[MainThread](https://developer.android.com/reference/kotlin/androidx/annotation/MainThread.html)<br>fun [clear](../../op.mobile.app.dev.willkj8.travelling.ui.tools/-tools-view-model/index.md#-1936886459%2FFunctions%2F-912451524)() |
| [clearAll](clear-all.md) | [androidJvm]<br>fun [clearAll](clear-all.md)(): Job<br>This function deletes all data from the quiz results DB. |
| [getTag](../../op.mobile.app.dev.willkj8.travelling.ui.tools/-tools-view-model/index.md#-215894976%2FFunctions%2F-912451524) | [androidJvm]<br>open fun &lt;[T](../../op.mobile.app.dev.willkj8.travelling.ui.tools/-tools-view-model/index.md#-215894976%2FFunctions%2F-912451524) : [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)&gt; [getTag](../../op.mobile.app.dev.willkj8.travelling.ui.tools/-tools-view-model/index.md#-215894976%2FFunctions%2F-912451524)(p0: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): [T](../../op.mobile.app.dev.willkj8.travelling.ui.tools/-tools-view-model/index.md#-215894976%2FFunctions%2F-912451524) |
| [insertQuizResultDetail](insert-quiz-result-detail.md) | [androidJvm]<br>fun [insertQuizResultDetail](insert-quiz-result-detail.md)(quizResult: [QuizResult](../../op.mobile.app.dev.willkj8.travelling.model/-quiz-result/index.md)): Job<br>This function inserts the given data into the quiz results DB. |
| [onCleared](../../op.mobile.app.dev.willkj8.travelling.ui.tools/-tools-view-model/index.md#-1930136507%2FFunctions%2F-912451524) | [androidJvm]<br>open fun [onCleared](../../op.mobile.app.dev.willkj8.travelling.ui.tools/-tools-view-model/index.md#-1930136507%2FFunctions%2F-912451524)() |
| [setTagIfAbsent](../../op.mobile.app.dev.willkj8.travelling.ui.tools/-tools-view-model/index.md#-1567230750%2FFunctions%2F-912451524) | [androidJvm]<br>open fun &lt;[T](../../op.mobile.app.dev.willkj8.travelling.ui.tools/-tools-view-model/index.md#-1567230750%2FFunctions%2F-912451524) : [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)&gt; [setTagIfAbsent](../../op.mobile.app.dev.willkj8.travelling.ui.tools/-tools-view-model/index.md#-1567230750%2FFunctions%2F-912451524)(p0: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), p1: [T](../../op.mobile.app.dev.willkj8.travelling.ui.tools/-tools-view-model/index.md#-1567230750%2FFunctions%2F-912451524)): [T](../../op.mobile.app.dev.willkj8.travelling.ui.tools/-tools-view-model/index.md#-1567230750%2FFunctions%2F-912451524) |

## Properties

| Name | Summary |
|---|---|
| [allResultDetails](all-result-details.md) | [androidJvm]<br>val [allResultDetails](all-result-details.md): [LiveData](https://developer.android.com/reference/kotlin/androidx/lifecycle/LiveData.html)&lt;[List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[QuizResult](../../op.mobile.app.dev.willkj8.travelling.model/-quiz-result/index.md)&gt;&gt; |
| [countryId](country-id.md) | [androidJvm]<br>var [countryId](country-id.md): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [countryName](country-name.md) | [androidJvm]<br>var [countryName](country-name.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [email](email.md) | [androidJvm]<br>var [email](email.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [score](score.md) | [androidJvm]<br>var [score](score.md): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [userId](user-id.md) | [androidJvm]<br>var [userId](user-id.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
