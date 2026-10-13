sealed interface Result {
    data class Success(val data: String) : Result
    data class Error(val message: String) : Result
    object Loading : Result
}
fun describe(r: Result): String = when(r){
        is Result.Success -> "Успех: ${r.data}"
        is Result.Error -> "Ошибка: ${r.message}"
        Result.Loading -> "Загрузка..."
}
