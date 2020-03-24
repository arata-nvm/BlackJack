package blackjack.main

import blackjack.card.Deck
import blackjack.player.Cpu
import blackjack.player.Player
import blackjack.player.PlayerBase

fun main() {
    println("ブラックジャック")
    val deck = Deck.createShuffledDeck()
    val player1 = Player().init(deck)
    val player2 = Cpu().init(deck)
    turn(player1, deck)
    turn(player2, deck)
    judge(player1, player2)
}

fun judge(player1: PlayerBase, player2: PlayerBase) {
    println("${player1.name}のポイント:${player1.point}")
    println("${player2.name}のポイント:${player2.point}")

    val p1 = player1.point
    val p2 = player2.point

    val result = when {
        p1 > 21 && p2 > 21  || p1 == p2 -> "引き分け"
        p1 > 21 -> "${player2.name}の勝ち"
        p2 > 21 -> "${player1.name}の勝ち"
        p1 > p2 -> "${player1.name}の勝ち"
        p2 > p1 -> "${player2.name}の勝ち"
        else -> ""
    }

    println(result)
}


fun turn(player: PlayerBase, deck: Deck) {
    println("${player.name}のターン")
    player.turn(deck)
    println("${player.name}のターン終了")
    println()
}