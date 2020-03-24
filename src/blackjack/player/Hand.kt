package blackjack.player

import blackjack.card.Card

class Hand {

    private val cards: MutableList<Card> = mutableListOf()

    val point: Int
            get() = cards
                .map { it.numberPoint }
                .sum()

    fun addCard(card: Card) {
        cards.add(card)
    }

}
