package net.wargaming.test.tasks;

public record Card(Suit suit, Ranks rank) implements Comparable<Card> {

    @Override
    public int compareTo(Card other) {
        int suitResult = this.suit.compareTo(other.suit);
        return suitResult != 0
                ? suitResult
                : this.rank.compareTo(other.rank);
    }
}