package blackjack.card

class Deck private constructor() {

    private val cards: MutableList<Card> = mutableListOf()

    companion object {
        fun createShuffledDeck(): Deck {
            val deck = Deck()
            Mark.values().forEach { m ->
                Number.values().forEach { n ->
                    deck.cards.add(Card(n, m))
                }
            }
            deck.cards.shuffle()
            return deck
        }

    }

    fun draw(): Card {
        return cards.removeAt(0)
    }

}
