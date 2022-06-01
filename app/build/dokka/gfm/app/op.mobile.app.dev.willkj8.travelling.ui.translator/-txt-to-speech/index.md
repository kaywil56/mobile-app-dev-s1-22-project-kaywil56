//[app](../../../index.md)/[op.mobile.app.dev.willkj8.travelling.ui.translator](../index.md)/[TxtToSpeech](index.md)

# TxtToSpeech

[androidJvm]\
class [TxtToSpeech](index.md)(val context: [Context](https://developer.android.com/reference/kotlin/android/content/Context.html), val text: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val lang: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) : [TextToSpeech.OnInitListener](https://developer.android.com/reference/kotlin/android/speech/tts/TextToSpeech.OnInitListener.html)

A Class for *TTS*.

This class handles logic for the TTS feature.

## Parameters

androidJvm

| | |
|---|---|
| context | The Translator fragment context |
| text | The text to be played |
| lang | The language for the text to be played in |

## Constructors

| | |
|---|---|
| [TxtToSpeech](-txt-to-speech.md) | [androidJvm]<br>fun [TxtToSpeech](-txt-to-speech.md)(context: [Context](https://developer.android.com/reference/kotlin/android/content/Context.html), text: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), lang: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) |

## Functions

| Name | Summary |
|---|---|
| [onInit](on-init.md) | [androidJvm]<br>open override fun [onInit](on-init.md)(status: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html))<br>Logic for when the TTS is initialized. |

## Properties

| Name | Summary |
|---|---|
| [context](context.md) | [androidJvm]<br>val [context](context.md): [Context](https://developer.android.com/reference/kotlin/android/content/Context.html) |
| [lang](lang.md) | [androidJvm]<br>val [lang](lang.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [text](text.md) | [androidJvm]<br>val [text](text.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
