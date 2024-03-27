package net.wargaming.test.tasks;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Task1Test {

    @ParameterizedTest
    @CsvSource({"10,0", "999,989"})
    void testIntegerFastSearch(int target, int expected) {
        var numbers = IntStream.range(10, 1001).boxed().toList();

        Optional<Integer> result = Task1.fastSearch(numbers, target);

        assertTrue(result.isPresent());
        assertEquals(expected, result.get(), String.format("Number index must be %d, but found %d", expected, result.get()));
    }

    static Stream<Arguments> testCardFastSearch() {
        return Stream.of(
                Arguments.of(new Card(Suit.HEARTS, Ranks.TWO), 0),
                Arguments.of(new Card(Suit.CLUBS, Ranks.JACK), 35),
                Arguments.of(new Card(Suit.SPADES, Ranks.ACE), 51)
        );
    }

    @ParameterizedTest
    @MethodSource
    void testCardFastSearch(Card target, int expected) {
        List<Card> cards = new ArrayList<>();
        for (Suit suit : Suit.values()) {
            for (Ranks rank : Ranks.values()) {
                cards.add(new Card(suit, rank));
            }
        }

        Optional<Integer> result = Task1.fastSearch(cards, target);

        assertTrue(result.isPresent());
        assertEquals(expected, result.get(), String.format("Number index must be %d, but found %d", expected, result.get()));
    }

    @Test
    void testFastEfficiency() {
        List<Page> pages = IntStream.range(1, 10_000_001).boxed().map(Page::new).toList();

        Page page = new Page(5_000_000);
        int expected = 4_999_999;

        long start = System.nanoTime();
        Optional<Integer> result = Task1.fastSearch(pages, page);
        long end = System.nanoTime();
        long duration = (end - start) / 1000000;

        assertTrue(result.isPresent());
        assertEquals(expected, result.get(), String.format("Number index must be %d, but found %d", expected, result.get()));
        assertTrue(duration < 5);
    }
}