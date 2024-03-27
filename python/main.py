# Task №1
# ------------------------------------------------------------------------------------------------
# This task requires writing code for a quick search in a sorted sequence,
# which can take the Card, Page and int class as an argument.
# The code should be able to find an index to an element in the sequence,
# if the element is not present in the sequence, then it should return None as the result.
# The code should be efficient and should be able to carry out the search quickly.
from enum import Enum
from typing import List, TypeVar, Optional, Callable


class SuitEnum(Enum):
    hearts = 1
    tiles = 2
    clovers = 3
    pikes = 4


class RanksEnum(Enum):
    two = 2
    three = 3
    four = 4
    five = 5
    six = 6
    seven = 7
    eight = 8
    nine = 9
    ten = 10
    jack = 11
    queen = 12
    king = 13
    ace = 14


# Card instance is equal to another card instance
# if the rank and suit are equal to the rank and suit of the another page instance
class Card:
    def __init__(self, suit: SuitEnum, rank: RanksEnum):
        self.suit = suit
        self.rank = rank

    def __str__(self):
        return f'<Card rank={self.rank}, suit={self.suit}>'

    __repr__ = __str__


# Page instance is equal to another page instance
# if the page_number is equal to the page_number of the another page instance
class Page:
    def __init__(self, page_number):
        self.page_number = page_number

    def __str__(self):
        return f'<Page #{self.page_number}>'

    __repr__ = __str__


T = TypeVar('T')


def fast_search(list_of_numbers: List[T], x: T) -> Optional[T]:
    """
    This function takes in a list of numbers in some order and a number x as input
    and finds the index of x in the list.
    If x is not present in the list, it returns None.

    Parameters
    ----------
    list_of_numbers : list
        List of numbers in ascending order
    x : int
        The number to be searched for

    Returns
    -------
    index : int
        The index of x in the list, None if x is not present
    """


# ------------------------------------------------------------------------------------------------


# Task №2
# ------------------------------------------------------------------------------------------------
# Create a Python generator that yields the Fibonacci sequence.

# The Fibonacci sequence is a sequence of numbers whose first and second elements are 1.
# To generate further elements of the sequence we take the sum of the previous two elements.
# For example the first 6 Fibonacci numbers are 0, 1, 1, 2, 3, 5.
#
# Write a generator that returns the Fibonacci sequence up to a certain number of elements.
#
# For example:
#
# ```python
# >>> list(fibonacci_generator(6))
# [0, 1, 1, 2, 3, 5]

from typing import Generator


def fibonacci_generator(n: int) -> Generator[int, None, None]:
    """
    This function generates fibonacci numbers.
    Parameters
    ----------
    n : int
        Quantity of fibonacci numbers to generate.

    Returns
    -------
    Each iteration of the generator function returns next fibonacci number
    """


# ------------------------------------------------------------------------------------------------


# Task №3
# ------------------------------------------------------------------------------------------------


# Write a custom function pow_func(x), which should take as an argument the number n and build function
# that can be used like:
# ```
# >>> pow3_func = pow_func(n=3)
# >>> pow3_func(x=2)
# 8
# >>> pow3_func(x=3)
# 27
# >>> pow2_func = pow_func(n=2)
# >>> pow2_func(x=2)
# 4
# >>> pow2_func(x=3)
# 9
# ```
# In case of successful calculations, the function should return result of calculations.
# Otherwise, the corresponding error message should be displayed and None should be returned.
# Check the function by calling it with arguments 5 and '5'.
# To solve the problem, use the try/except/else statement in the function body.

def pow_func(n: int) -> Callable[[int], int]:
    """
    This function should return function, that can do calculation like this:
    ```
    >>> pow3_func = pow_func(n=3)
    >>> pow3_func(2)
        8
    >>> pow3_func(3)
        27
    >>> pow2_func = pow_func(n=2)
    >>> pow2_func(2)
        4
    >>> pow2_func(3)
        9
    ```
    Parameters
    ----------
    n : int
        Quantity of fibonacci numbers to generate.

    Returns
    -------
    Each iteration of the generator function returns next fibonacci number
    """


# ------------------------------------------------------------------------------------------------


# Task №4
# ------------------------------------------------------------------------------------------------
# Write a custom function file_list(directory_path), which returns a list of names of text files


from typing import List


def file_list(directory_path: str) -> List[str]:
    """
   This function should take in directory_path and go recursively through the directory_path
   and return a list of all text files (extension .txt).

   If txt files is not present in directory, it should return empty list ([]).

   Parameters
   ----------
   directory_path : str
       Directory path to search for text files in.
   Returns
   -------
   file_names : List[str]
       List of all text files in the directory.
   """

# ------------------------------------------------------------------------------------------------
