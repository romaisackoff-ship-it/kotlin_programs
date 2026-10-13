interface Animal {
    fun sound(): String
    fun name(): String
}
class Dog : Animal {
        override fun sound(): String = "Гав"
        override fun name(): String = "Вова"

        }
class Cat : Animal {
        override fun sound(): String = "Мяу"
        override fun name(): String = "Зеля"

        }
class Cow : Animal {
        override fun sound(): String = "Мууу"
        override fun name(): String = "Батька"
    }
