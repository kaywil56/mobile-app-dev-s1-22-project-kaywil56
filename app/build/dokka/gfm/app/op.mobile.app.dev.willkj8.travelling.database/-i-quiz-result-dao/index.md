//[app](../../../index.md)/[op.mobile.app.dev.willkj8.travelling.database](../index.md)/[IQuizResultDao](index.md)

# IQuizResultDao

[androidJvm]\
interface [IQuizResultDao](index.md)

A interface used for the quiz result DB

controls the DB functionality

## Functions

| Name | Summary |
|---|---|
| [deleteAll](delete-all.md) | [androidJvm]<br>abstract fun [deleteAll](delete-all.md)()<br>This function all data from the quiz result DB |
| [getAll](get-all.md) | [androidJvm]<br>abstract fun [getAll](get-all.md)(): Flow&lt;[List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[QuizResult](../../op.mobile.app.dev.willkj8.travelling.model/-quiz-result/index.md)&gt;&gt;<br>This function gets all data from the quiz result DB |
| [insert](insert.md) | [androidJvm]<br>abstract fun [insert](insert.md)(quiz_result: [QuizResult](../../op.mobile.app.dev.willkj8.travelling.model/-quiz-result/index.md))<br>This function inserts given data into the quiz result DB |
