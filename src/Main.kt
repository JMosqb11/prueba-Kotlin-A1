fun main() {
    //Un solo valor.
        val notification = 187
        printNotificationSummary(notification)
}

fun printNotificationSummary(numberOfMessages: Int) {
        if (numberOfMessages < 100) {
            println("You have $numberOfMessages notifications.")
        } else {
            println("Your phone is blowing up! You have 99+ notifications.")
        }
}


