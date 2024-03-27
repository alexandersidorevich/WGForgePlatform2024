package net.wargaming.test.tasks;

import java.util.List;
import java.util.Optional;

// Task #1
// ------------------------------------------------------------------------------------------------
// This task involves writing code for performing a quick search in a sorted sequence.
// The code should accept arguments of type Card, Page, and Integer.
// It should be capable of finding the index of an element in the sequence.
// If the element is not present in the sequence, the code should return Optional.empty() as the result.
// Efficiency and speed are essential requirements for the search algorithm.
// A passed sequence is sorted by ascension so that:
//   Integer
//       .. < -2 < -1 < 0 < 1 < 2 < ....
//   Suit
//       HEARTS < DIAMONDS < CLUBS < SPADES
//   Ranks
//       TWO < THREE < .. < KING < ACE
//   Card
//       natural order by (suit, rank)
//         Card(Suit.HEARTS, ???) < Card(Suit.DIAMONDS, ???)
//         Card(Suit.DIAMONDS, Ranks.TWO) < Card(Suit.DIAMONDS, Ranks.THREE)
//   Page
//       natural order by (pageNumber)
//         Page(1) < Page(2)
public final class Task1 {

    /**
     * Searches for the first occurrence of a value `x` within the given List.
     *
     * @param xs The sequence to be searched, the sequence expected to be sorted.
     * @param x The value to search for within the sequence.
     * @param <T> The type of elements in the sequence and the value to search for.
     *
     * @return An Optional containing the index of the first occurrence of `x` within `xs`, if found; Optional.empty() otherwise.
     */
    public static <T> Optional<Integer> fastSearch(List<? extends Comparable<? super T>> xs, T x) {
        throw new UnsupportedOperationException("Not implemented yet.");
    }
}