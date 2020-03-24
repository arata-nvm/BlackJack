package blackjack.player

import blackjack.card.Deck

class Cpu : PlayerBase() {

    override val name: String = "CPU"

    override var point = 0

    override fun turn(deck: Deck) {
        while (true) {
            println("現在のポイント:$point")
            if (point <= 17) {
                draw(deck)
            } else {
                break
            }
        }
    }

}
