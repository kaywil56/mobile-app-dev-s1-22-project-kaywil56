//[app](../../../index.md)/[op.mobile.app.dev.willkj8.travelling.helpers.settings](../index.md)/[SettingsManager](index.md)

# SettingsManager

[androidJvm]\
class [SettingsManager](index.md)(val context: [Context](https://developer.android.com/reference/kotlin/android/content/Context.html))

A class for managing the apps settings features

This class manages ui features like dark mode.

## Parameters

androidJvm

| | |
|---|---|
| context | Current context of the app |

## Constructors

| | |
|---|---|
| [SettingsManager](-settings-manager.md) | [androidJvm]<br>fun [SettingsManager](-settings-manager.md)(context: [Context](https://developer.android.com/reference/kotlin/android/content/Context.html)) |

## Types

| Name | Summary |
|---|---|
| [Companion](-companion/index.md) | [androidJvm]<br>object [Companion](-companion/index.md) |

## Functions

| Name | Summary |
|---|---|
| [setCheckedUIMode](set-checked-u-i-mode.md) | [androidJvm]<br>fun [setCheckedUIMode](set-checked-u-i-mode.md)(uiMode: [UIMode](../-u-i-mode/index.md)?, isMainActivity: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), swUIMode: [SwitchCompat](https://developer.android.com/reference/kotlin/androidx/appcompat/widget/SwitchCompat.html)?, googleMap: GoogleMap?)<br>This function sets the checked ui mode |
| [setUIMode](set-u-i-mode.md) | [androidJvm]<br>suspend fun [setUIMode](set-u-i-mode.md)(uiMode: [UIMode](../-u-i-mode/index.md))<br>This function sets the current UI mode |

## Properties

| Name | Summary |
|---|---|
| [context](context.md) | [androidJvm]<br>val [context](context.md): [Context](https://developer.android.com/reference/kotlin/android/content/Context.html) |
| [uiModeFlow](ui-mode-flow.md) | [androidJvm]<br>val [uiModeFlow](ui-mode-flow.md): Flow&lt;[UIMode](../-u-i-mode/index.md)&gt; |
