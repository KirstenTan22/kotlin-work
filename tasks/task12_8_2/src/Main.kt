// Task 12.8.2: program to manipulate playing cards
import Card.Rank
import Card.Suit

fun main() {
    var cards = mutableListOf<Card>()
    for (suit in Suit.entries) {
        for (rank in Rank.entries) {
            cards.add(Card(rank, suit))
        }
    }

    cards.shuffle()

    for (card in cards) {
        println(card)
    }
}