package otus.homework.flowcats

sealed class Result {
    object Initial: Result()
    class Success<T>(val data: T):Result()
    class Error(val error: Throwable): Result()
}