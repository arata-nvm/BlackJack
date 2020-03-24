package blackjack.player

import blackjack.card.Deck

abstract class PlayerBase {

    abstract val name: String

    abstract var point: Int

    abstract fun turn(deck: Deck)

    fun init(deck: Deck): PlayerBase {
        (0..1).forEach { _ ->
            draw(deck, false)
        }
        return this
    }

    fun draw(deck: Deck, showPoint: Boolean = true) {
        val card = deck.draw()
        point += card.number.num
        if (showPoint) {
            println("${card}を引きました。")
        }
    }

}