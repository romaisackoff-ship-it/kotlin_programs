enum class DayOfWeek(val isWeekend: Boolean) {

    MONDAY (false),
    TUESDAY (false),
    WEDNESDAY ( false),
    THURSDAY  (false),
    FRIDAY   (false),
    SATURDAY    (true),
    SUNDAY     (true);


    fun describe(): String = when(this) {
        DayOfWeek.MONDAY -> "Понедельник"
        DayOfWeek.TUESDAY -> "вторник"
        DayOfWeek.WEDNESDAY -> "среда"
        DayOfWeek.THURSDAY -> "четверг"
        DayOfWeek.FRIDAY -> "пятница"
        DayOfWeek.SATURDAY -> "суббота"
        DayOfWeek.SUNDAY -> "воскресенье"

    }

}