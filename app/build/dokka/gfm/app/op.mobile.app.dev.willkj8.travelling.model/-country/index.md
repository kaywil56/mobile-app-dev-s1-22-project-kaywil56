//[app](../../../index.md)/[op.mobile.app.dev.willkj8.travelling.model](../index.md)/[Country](index.md)

# Country

[androidJvm]\
data class [Country](index.md)(val id: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), val name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val flagImg: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val langCode: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val phrases: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt;, val quiz: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[Quiz](../-quiz/index.md)&gt;, val attractions: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[Attraction](../-attraction/index.md)&gt;) : [Parcelable](https://developer.android.com/reference/kotlin/android/os/Parcelable.html)

A data model class for the country.

This class takes values from the get country's API request.

## Constructors

| | |
|---|---|
| [Country](-country.md) | [androidJvm]<br>fun [Country](-country.md)(id: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), flagImg: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), langCode: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), phrases: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt;, quiz: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[Quiz](../-quiz/index.md)&gt;, attractions: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[Attraction](../-attraction/index.md)&gt;) |

## Functions

| Name | Summary |
|---|---|
| [describeContents](index.md#-1578325224%2FFunctions%2F-912451524) | [androidJvm]<br>abstract fun [describeContents](index.md#-1578325224%2FFunctions%2F-912451524)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [writeToParcel](index.md#-1754457655%2FFunctions%2F-912451524) | [androidJvm]<br>abstract fun [writeToParcel](index.md#-1754457655%2FFunctions%2F-912451524)(p0: [Parcel](https://developer.android.com/reference/kotlin/android/os/Parcel.html), p1: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)) |

## Properties

| Name | Summary |
|---|---|
| [attractions](attractions.md) | [androidJvm]<br>val [attractions](attractions.md): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[Attraction](../-attraction/index.md)&gt; |
| [flagImg](flag-img.md) | [androidJvm]<br>val [flagImg](flag-img.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [id](id.md) | [androidJvm]<br>val [id](id.md): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [langCode](lang-code.md) | [androidJvm]<br>val [langCode](lang-code.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [name](name.md) | [androidJvm]<br>val [name](name.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [phrases](phrases.md) | [androidJvm]<br>val [phrases](phrases.md): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt; |
| [quiz](quiz.md) | [androidJvm]<br>val [quiz](quiz.md): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[Quiz](../-quiz/index.md)&gt; |
