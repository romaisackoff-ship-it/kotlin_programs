enum class OrderStatus(val lavel: String) {
    PENDING("Ожидает"),
    PAID("Оплачен"),
    SHIPPED("Отправлен"),
    DELIVERED("Доставлен"),
    CANCELLED("Отменён");

    fun describe(status: OrderStatus): String = when(status) {

        OrderStatus.PENDING -> "Ожидает"
        OrderStatus.PAID -> "Оплачен"
        OrderStatus.SHIPPED -> "Отправлен"
        OrderStatus.DELIVERED -> "Доставлен"
        OrderStatus.CANCELLED -> "Отменён"

    }
}