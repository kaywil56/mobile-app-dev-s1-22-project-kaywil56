//[app](../../../index.md)/[op.mobile.app.dev.willkj8.travelling.ui.home](../index.md)/[HomeViewModel](index.md)

# HomeViewModel

[androidJvm]\
class [HomeViewModel](index.md) : [ViewModel](https://developer.android.com/reference/kotlin/androidx/lifecycle/ViewModel.html)

A view model class for home.

This class handles data related to the home ui.

## Constructors

| | |
|---|---|
| [HomeViewModel](-home-view-model.md) | [androidJvm]<br>fun [HomeViewModel](-home-view-model.md)() |

## Functions

| Name | Summary |
|---|---|
| [clear](../../op.mobile.app.dev.willkj8.travelling.ui.tools/-tools-view-model/index.md#-1936886459%2FFunctions%2F-912451524) | [androidJvm]<br>@[MainThread](https://developer.android.com/reference/kotlin/androidx/annotation/MainThread.html)<br>fun [clear](../../op.mobile.app.dev.willkj8.travelling.ui.tools/-tools-view-model/index.md#-1936886459%2FFunctions%2F-912451524)() |
| [getTag](../../op.mobile.app.dev.willkj8.travelling.ui.tools/-tools-view-model/index.md#-215894976%2FFunctions%2F-912451524) | [androidJvm]<br>open fun &lt;[T](../../op.mobile.app.dev.willkj8.travelling.ui.tools/-tools-view-model/index.md#-215894976%2FFunctions%2F-912451524) : [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)&gt; [getTag](../../op.mobile.app.dev.willkj8.travelling.ui.tools/-tools-view-model/index.md#-215894976%2FFunctions%2F-912451524)(p0: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): [T](../../op.mobile.app.dev.willkj8.travelling.ui.tools/-tools-view-model/index.md#-215894976%2FFunctions%2F-912451524) |
| [onCleared](../../op.mobile.app.dev.willkj8.travelling.ui.tools/-tools-view-model/index.md#-1930136507%2FFunctions%2F-912451524) | [androidJvm]<br>open fun [onCleared](../../op.mobile.app.dev.willkj8.travelling.ui.tools/-tools-view-model/index.md#-1930136507%2FFunctions%2F-912451524)() |
| [setTagIfAbsent](../../op.mobile.app.dev.willkj8.travelling.ui.tools/-tools-view-model/index.md#-1567230750%2FFunctions%2F-912451524) | [androidJvm]<br>open fun &lt;[T](../../op.mobile.app.dev.willkj8.travelling.ui.tools/-tools-view-model/index.md#-1567230750%2FFunctions%2F-912451524) : [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)&gt; [setTagIfAbsent](../../op.mobile.app.dev.willkj8.travelling.ui.tools/-tools-view-model/index.md#-1567230750%2FFunctions%2F-912451524)(p0: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), p1: [T](../../op.mobile.app.dev.willkj8.travelling.ui.tools/-tools-view-model/index.md#-1567230750%2FFunctions%2F-912451524)): [T](../../op.mobile.app.dev.willkj8.travelling.ui.tools/-tools-view-model/index.md#-1567230750%2FFunctions%2F-912451524) |

## Properties

| Name | Summary |
|---|---|
| [response](response.md) | [androidJvm]<br>val [response](response.md): [LiveData](https://developer.android.com/reference/kotlin/androidx/lifecycle/LiveData.html)&lt;[List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[Country](../../op.mobile.app.dev.willkj8.travelling.model/-country/index.md)&gt;&gt; |
| [status](status.md) | [androidJvm]<br>val [status](status.md): [LiveData](https://developer.android.com/reference/kotlin/androidx/lifecycle/LiveData.html)&lt;[ServiceStatus](../../op.mobile.app.dev.willkj8.travelling.api/-service-status/index.md)&gt; |
