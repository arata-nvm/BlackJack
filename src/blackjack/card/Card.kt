package blackjack.card

class Card(val number: Number, val mark: Mark) {

    val numberString: String
            get() = when(number) {
                Number.Jack -> "J"
                Number.Queen -> "Q"
                Number.King -> "K"
                else -> number.num.toString()
            }

    val numberPoint: Int
        get() = when(number) {
            Number.Jack, Number.Queen, Number.King -> 10
            else -> number.num
        }

    override fun toString(): String = "${mark.simbol}の${number.num}"
}

