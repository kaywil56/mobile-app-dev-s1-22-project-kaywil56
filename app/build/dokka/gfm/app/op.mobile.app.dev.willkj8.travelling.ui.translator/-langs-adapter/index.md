//[app](../../../index.md)/[op.mobile.app.dev.willkj8.travelling.ui.translator](../index.md)/[LangsAdapter](index.md)

# LangsAdapter

[androidJvm]\
class [LangsAdapter](index.md)(context: [Context](https://developer.android.com/reference/kotlin/android/content/Context.html), @[LayoutRes](https://developer.android.com/reference/kotlin/androidx/annotation/LayoutRes.html)resource: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), langsList: [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt;) : [ArrayAdapter](https://developer.android.com/reference/kotlin/android/widget/ArrayAdapter.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt; 

A class for the available languages list adapter.

This class handles logic for the languages list adapter.

## Parameters

androidJvm

| | |
|---|---|
| context | The apps current context. |
| resource | the spinner layout. |
| langsList | the given list of languages. |

## Constructors

| | |
|---|---|
| [LangsAdapter](-langs-adapter.md) | [androidJvm]<br>fun [LangsAdapter](-langs-adapter.md)(context: [Context](https://developer.android.com/reference/kotlin/android/content/Context.html), @[LayoutRes](https://developer.android.com/reference/kotlin/androidx/annotation/LayoutRes.html)resource: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), langsList: [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt;) |

## Functions

| Name | Summary |
|---|---|
| [add](index.md#-2099993336%2FFunctions%2F-912451524) | [androidJvm]<br>open fun [add](index.md#-2099993336%2FFunctions%2F-912451524)(p0: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?) |
| [addAll](index.md#1249451748%2FFunctions%2F-912451524) | [androidJvm]<br>open fun [addAll](index.md#1249451748%2FFunctions%2F-912451524)(vararg p0: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))<br>open fun [addAll](index.md#1488949590%2FFunctions%2F-912451524)(p0: [MutableCollection](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-collection/index.html)&lt;out [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt;) |
| [areAllItemsEnabled](index.md#2007958514%2FFunctions%2F-912451524) | [androidJvm]<br>open override fun [areAllItemsEnabled](index.md#2007958514%2FFunctions%2F-912451524)(): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [clear](index.md#-1074180355%2FFunctions%2F-912451524) | [androidJvm]<br>open fun [clear](index.md#-1074180355%2FFunctions%2F-912451524)() |
| [getAutofillOptions](index.md#-1058457510%2FFunctions%2F-912451524) | [androidJvm]<br>open override fun [getAutofillOptions](index.md#-1058457510%2FFunctions%2F-912451524)(): [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)&lt;[CharSequence](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)&gt;? |
| [getContext](index.md#-1101232233%2FFunctions%2F-912451524) | [androidJvm]<br>open fun [getContext](index.md#-1101232233%2FFunctions%2F-912451524)(): [Context](https://developer.android.com/reference/kotlin/android/content/Context.html) |
| [getCount](get-count.md) | [androidJvm]<br>open override fun [getCount](get-count.md)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)<br>Gets the sizes of the given list. |
| [getDropDownView](index.md#-490174721%2FFunctions%2F-912451524) | [androidJvm]<br>open override fun [getDropDownView](index.md#-490174721%2FFunctions%2F-912451524)(p0: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), p1: [View](https://developer.android.com/reference/kotlin/android/view/View.html), p2: [ViewGroup](https://developer.android.com/reference/kotlin/android/view/ViewGroup.html)): [View](https://developer.android.com/reference/kotlin/android/view/View.html) |
| [getDropDownViewTheme](index.md#1871542675%2FFunctions%2F-912451524) | [androidJvm]<br>open override fun [getDropDownViewTheme](index.md#1871542675%2FFunctions%2F-912451524)(): [Resources.Theme](https://developer.android.com/reference/kotlin/android/content/res/Resources.Theme.html)? |
| [getFilter](index.md#1957531516%2FFunctions%2F-912451524) | [androidJvm]<br>open override fun [getFilter](index.md#1957531516%2FFunctions%2F-912451524)(): [Filter](https://developer.android.com/reference/kotlin/android/widget/Filter.html) |
| [getItem](get-item.md) | [androidJvm]<br>open override fun [getItem](get-item.md)(position: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>Gets the position of a selected item |
| [getItemId](index.md#-1740376508%2FFunctions%2F-912451524) | [androidJvm]<br>open override fun [getItemId](index.md#-1740376508%2FFunctions%2F-912451524)(p0: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html) |
| [getItemViewType](index.md#942948720%2FFunctions%2F-912451524) | [androidJvm]<br>open override fun [getItemViewType](index.md#942948720%2FFunctions%2F-912451524)(p0: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [getPosition](index.md#-1209145270%2FFunctions%2F-912451524) | [androidJvm]<br>open fun [getPosition](index.md#-1209145270%2FFunctions%2F-912451524)(p0: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [getView](index.md#-1509279795%2FFunctions%2F-912451524) | [androidJvm]<br>open override fun [getView](index.md#-1509279795%2FFunctions%2F-912451524)(p0: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), p1: [View](https://developer.android.com/reference/kotlin/android/view/View.html)?, p2: [ViewGroup](https://developer.android.com/reference/kotlin/android/view/ViewGroup.html)): [View](https://developer.android.com/reference/kotlin/android/view/View.html) |
| [getViewTypeCount](index.md#-1958386746%2FFunctions%2F-912451524) | [androidJvm]<br>open override fun [getViewTypeCount](index.md#-1958386746%2FFunctions%2F-912451524)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [hasStableIds](index.md#-1828198787%2FFunctions%2F-912451524) | [androidJvm]<br>open override fun [hasStableIds](index.md#-1828198787%2FFunctions%2F-912451524)(): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [insert](index.md#1013454247%2FFunctions%2F-912451524) | [androidJvm]<br>open fun [insert](index.md#1013454247%2FFunctions%2F-912451524)(p0: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, p1: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)) |
| [isEmpty](index.md#-1198639209%2FFunctions%2F-912451524) | [androidJvm]<br>open override fun [isEmpty](index.md#-1198639209%2FFunctions%2F-912451524)(): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [isEnabled](index.md#1634705473%2FFunctions%2F-912451524) | [androidJvm]<br>open override fun [isEnabled](index.md#1634705473%2FFunctions%2F-912451524)(p0: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [notifyDataSetChanged](index.md#-241177621%2FFunctions%2F-912451524) | [androidJvm]<br>open override fun [notifyDataSetChanged](index.md#-241177621%2FFunctions%2F-912451524)() |
| [notifyDataSetInvalidated](index.md#1639757734%2FFunctions%2F-912451524) | [androidJvm]<br>open fun [notifyDataSetInvalidated](index.md#1639757734%2FFunctions%2F-912451524)() |
| [registerDataSetObserver](index.md#-1646533099%2FFunctions%2F-912451524) | [androidJvm]<br>open override fun [registerDataSetObserver](index.md#-1646533099%2FFunctions%2F-912451524)(p0: [DataSetObserver](https://developer.android.com/reference/kotlin/android/database/DataSetObserver.html)) |
| [remove](index.md#-1603338805%2FFunctions%2F-912451524) | [androidJvm]<br>open fun [remove](index.md#-1603338805%2FFunctions%2F-912451524)(p0: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?) |
| [setAutofillOptions](index.md#892695140%2FFunctions%2F-912451524) | [androidJvm]<br>open fun [setAutofillOptions](index.md#892695140%2FFunctions%2F-912451524)(vararg p0: [CharSequence](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)) |
| [setDropDownViewResource](index.md#-91047262%2FFunctions%2F-912451524) | [androidJvm]<br>open fun [setDropDownViewResource](index.md#-91047262%2FFunctions%2F-912451524)(p0: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)) |
| [setDropDownViewTheme](index.md#2133321406%2FFunctions%2F-912451524) | [androidJvm]<br>open override fun [setDropDownViewTheme](index.md#2133321406%2FFunctions%2F-912451524)(p0: [Resources.Theme](https://developer.android.com/reference/kotlin/android/content/res/Resources.Theme.html)?) |
| [setNotifyOnChange](index.md#-147055659%2FFunctions%2F-912451524) | [androidJvm]<br>open fun [setNotifyOnChange](index.md#-147055659%2FFunctions%2F-912451524)(p0: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)) |
| [sort](index.md#448175244%2FFunctions%2F-912451524) | [androidJvm]<br>open fun [sort](index.md#448175244%2FFunctions%2F-912451524)(p0: [Comparator](https://developer.android.com/reference/kotlin/java/util/Comparator.html)&lt;in [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt;) |
| [unregisterDataSetObserver](index.md#504471406%2FFunctions%2F-912451524) | [androidJvm]<br>open override fun [unregisterDataSetObserver](index.md#504471406%2FFunctions%2F-912451524)(p0: [DataSetObserver](https://developer.android.com/reference/kotlin/android/database/DataSetObserver.html)) |
