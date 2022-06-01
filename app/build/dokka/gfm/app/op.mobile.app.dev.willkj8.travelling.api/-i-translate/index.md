//[app](../../../index.md)/[op.mobile.app.dev.willkj8.travelling.api](../index.md)/[ITranslate](index.md)

# ITranslate

[androidJvm]\
interface [ITranslate](index.md)

A interface used to translate the given text

## Functions

| Name | Summary |
|---|---|
| [savePost](save-post.md) | [androidJvm]<br>@POST(value = &quot;/api/v1.5/tr.json/translate&quot;)<br>@FormUrlEncoded<br>abstract fun [savePost](save-post.md)(@Field(value = &quot;key&quot;)key: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, @Field(value = &quot;text&quot;)text: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, @Field(value = &quot;lang&quot;)lang: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?): Call&lt;[Translate](../../op.mobile.app.dev.willkj8.travelling.model/-translate/index.md)&gt;<br>This functions is used to post to the translate api |
