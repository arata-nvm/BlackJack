package blackjack.player

import blackjack.card.Deck

class Player : PlayerBase() {

    override val name: String = "Player"

    override var point = 0

    override fun turn(deck: Deck) {
        while (true) {
            println("現在のポイント:$point")
            if (point < 21 && waitForInputYorN()) {
                draw(deck)
            } else {
                break
            }
        }
    }

    private fun waitForInputYorN(): Boolean {
        var userInput: String? = ""
        while (userInput != "y" && userInput != "n") {
            print("カードを引きますか?[y/n]:")
            userInput = readLine()?.trim()
        }
        return when(userInput) {
            "y" -> true
            else -> false
        }

    }

}
