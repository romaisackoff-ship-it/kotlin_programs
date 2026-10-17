class User(val name: String, val age: Int) {
    companion object {
        fun create(name: String): User = User(name, 0)
        const val MAX_AGE = 150
    }
}