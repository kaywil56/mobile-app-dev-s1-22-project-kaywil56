//[app](../../../index.md)/[op.mobile.app.dev.willkj8.travelling.ui.quiz](../index.md)/[QuizViewModelFactory](index.md)

# QuizViewModelFactory

[androidJvm]\
class [QuizViewModelFactory](index.md)(country: [Country](../../op.mobile.app.dev.willkj8.travelling.model/-country/index.md)) : [ViewModelProvider.Factory](https://developer.android.com/reference/kotlin/androidx/lifecycle/ViewModelProvider.Factory.html)

A view model factory class for the quiz.

This class instantiates the quiz view model.

## Parameters

androidJvm

| | |
|---|---|
| country | The selected country object. |

## Constructors

| | |
|---|---|
| [QuizViewModelFactory](-quiz-view-model-factory.md) | [androidJvm]<br>fun [QuizViewModelFactory](-quiz-view-model-factory.md)(country: [Country](../../op.mobile.app.dev.willkj8.travelling.model/-country/index.md)) |

## Functions

| Name | Summary |
|---|---|
| [create](create.md) | [androidJvm]<br>open override fun &lt;[T](create.md) : [ViewModel](https://developer.android.com/reference/kotlin/androidx/lifecycle/ViewModel.html)&gt; [create](create.md)(modelClass: [Class](https://developer.android.com/reference/kotlin/java/lang/Class.html)&lt;[T](create.md)&gt;): [T](create.md) |
