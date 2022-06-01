//[app](../../../index.md)/[op.mobile.app.dev.willkj8.travelling.ui.quiz.results](../index.md)/[QuizResultsViewModelFactory](index.md)

# QuizResultsViewModelFactory

[androidJvm]\
class [QuizResultsViewModelFactory](index.md)(score: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), countryId: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), email: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), userId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), countryName: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), repository: [QuizResultRepository](../../op.mobile.app.dev.willkj8.travelling.repository/-quiz-result-repository/index.md)) : [ViewModelProvider.Factory](https://developer.android.com/reference/kotlin/androidx/lifecycle/ViewModelProvider.Factory.html)

A view model factory class for the quiz results.

This class instantiates the quiz results view model.

## Parameters

androidJvm

| | |
|---|---|
| score | The final score for the quiz |
| countryId | The country ID of the quiz taken |
| email | The email of the current user |
| userId | The ID of the current user |
| countryName | The country name of the quiz taken |
| repository | The repo for the quiz results |

## Constructors

| | |
|---|---|
| [QuizResultsViewModelFactory](-quiz-results-view-model-factory.md) | [androidJvm]<br>fun [QuizResultsViewModelFactory](-quiz-results-view-model-factory.md)(score: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), countryId: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), email: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), userId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), countryName: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), repository: [QuizResultRepository](../../op.mobile.app.dev.willkj8.travelling.repository/-quiz-result-repository/index.md)) |

## Functions

| Name | Summary |
|---|---|
| [create](create.md) | [androidJvm]<br>open override fun &lt;[T](create.md) : [ViewModel](https://developer.android.com/reference/kotlin/androidx/lifecycle/ViewModel.html)&gt; [create](create.md)(modelClass: [Class](https://developer.android.com/reference/kotlin/java/lang/Class.html)&lt;[T](create.md)&gt;): [T](create.md) |
