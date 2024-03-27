//> using scala 3.3.1

// Task #1
// ------------------------------------------------------------------------------------------------
// This task involves writing code for performing a quick search in a sorted sequence.
// The code should accept arguments of type Card, Page, and Int.
// It should be capable of finding the index of an element in the sequence.
// If the element is not present in the sequence, the code should return None as the result.
// Efficiency and speed are essential requirements for the search algorithm.
// A passed sequence is sorted by ascension so that:
//   Int
//       .. < -2 < -1 < 0 < 1 < 2 < ....
//   SuitEmum
//       Hearts < Tiles < Clovers < Pikes
//   RanksEmum
//       Two < Three < .. < King < Ace
//   Card
//       natural order by (suit, rank)
//         Card(SuitEmum.Hearts, ???) < Card(SuitEmum.Tiles, ???)
//         Card(SuitEmum.Tiles, RanksEmum.Two) < Card(SuitEmum.Tiles, RanksEmum.Three)
//   Page
//       natural order by (pageNumber)
//         Page(1) < Page(2)


import scala.math.Ordering
import java.nio.file.Path

enum SuitEmum:
    case Hearts, Diamonds, Clubs, Spades

given Ordering[SuitEmum] with
    def compare(l: SuitEmum, r: SuitEmum) = ???    

enum RankEmum:
    case Two, Three, Four, Five, Six, Seven, Eight, Nine, Ten, Jack, Queen, King, Ace

given Ordering[RankEmum] with
    def compare(l: RankEmum, r: RankEmum) = ???

case class Card(suit: SuitEmum, rank: RankEmum)

given Ordering[Card] with
    def compare(l: Card, r: Card) = ???

case class Page(pageNumber: Int)

given Ordering[Page] = ???

/**
 * Searches for the first occurrence of a value `x` within the given `IndexedSeq[T]`.
 *
 * @param xs The sequence to be searched, the sequence expected to be sorted.
 * @param x The value to search for within the sequence.
 * @param ord An implicit ordering for elements of type `T`.
 * @tparam T The type of elements in the sequence and the value to search for.
 * @return An option containing the index of the first occurrence of `x` within `xs`, if found; `None` otherwise.
 */
def fastSearch[T](xs: IndexedSeq[T], x: T)(using ord: Ordering[T]): Option[Int] = ???   
     

// ------------------------------------------------------------------------------------------------


// Task #2
// ------------------------------------------------------------------------------------------------
// Create an infinity iterator that produces the Fibonacci sequence.

// The Fibonacci sequence is a series of numbers where the first and second elements are 0 and 1, respectively.
// To generate further elements of the sequence, we sum the previous two elements.
// For example, the first 6 Fibonacci numbers are 0, 1, 1, 2, 3, 5.

import scala.collection.Iterator


/**
 * Returns an iterator that generates the Fibonacci sequence as a sequence of BigIntegers.
 *
 * Each element of the sequence represents a Fibonacci number, starting from 0 and 1.
 * The sequence continues indefinitely, generating Fibonacci numbers on-demand.
 *
 * @return An iterator that generates the Fibonacci sequence as a sequence of BigInts.
 */
def finobacciIterator: Iterator[BigInt] = ???


// ------------------------------------------------------------------------------------------------


// Task #3
// ------------------------------------------------------------------------------------------------


// Write a function powFunc(x), which takes a number n as an argument and returns a function 
// that raises its input to the power of n.
// ```scala
// scala> val cube = powFunc(3)
// val cube: Int => Int = Lambda/0x000000c8014fc800@434a2a10
                                                                                                                                                                                                                                                                                                                                                                            
// scala> cube(2)
// val res0: Int = 8
                                                                                                                                                                                                                                                                                                                                                                            
// scala> cube(3)
// val res1: Int = 27
                                                                                                                                                                                                                                                                                                                                                                            
// scala> val square = powFunc(2)
// val square: Int => Int = Lambda/0x000000c8014fc800@7be3a837
                                                                                                                                                                                                                                                                                                                                                                            
// scala> square(2)
// val res2: Int = 4
                                                                                                                                                                                                                                                                                                                                                                            
// scala> square(3)
// val res3: Int = 9
// ```


/**
 * Returns a function that raises its input to the power of `n`.
 *
 * The returned function takes an integer input and returns the result of raising that input to the power of `n`.
 *
 * @param n The exponent to which the input will be raised.
 * @return A function that raises its input to the power of `n`.
 */
def powFunc(n: Int): Int => Int = ???



// ------------------------------------------------------------------------------------------------


// Task №4
// ------------------------------------------------------------------------------------------------
// Write a function fileList(directory) that searches for text files within the specified directory and recursively bypassing all the subdirectories.

/**
 *  Recursively search for text files (with .txt extenstion ) within the specified directory.
  *
  * @param directory The directory to search for text files.
  * @return A sequence of paths to text files found within the directory.
  */
def fileList(directory: Path): Seq[Path] = ???