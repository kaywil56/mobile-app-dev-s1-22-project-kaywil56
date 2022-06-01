//[app](../../../index.md)/[op.mobile.app.dev.willkj8.travelling.api](../index.md)/[ITranslate](index.md)/[savePost](save-post.md)

# savePost

[androidJvm]\

@POST(value = &quot;/api/v1.5/tr.json/translate&quot;)

@FormUrlEncoded

abstract fun [savePost](save-post.md)(@Field(value = &quot;key&quot;)key: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, @Field(value = &quot;text&quot;)text: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, @Field(value = &quot;lang&quot;)lang: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?): Call&lt;[Translate](../../op.mobile.app.dev.willkj8.travelling.model/-translate/index.md)&gt;

This functions is used to post to the translate api

## Parameters

androidJvm

| | |
|---|---|
| key | api key |
| text | text to be translated |
| lang | language code |
