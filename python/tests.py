def test_decorator(func):
    def wrapper():
        print('-' * 30)
        print(f'Start test {func.__name__}')
        try:
            func()
        except AssertionError as e:
            print(f'Testing {func.__name__} fails test case not passed throw assertion. {e}')
        except Exception as e:
            print(f'Testing {func.__name__} fails because unexpected exception: {e}')
        else:
            print(f'Testing {func.__name__} passed successfully')
        finally:
            print('-' * 30)

    return wrapper()


# ------------------------------------------------------------------------------------------------
@test_decorator
def test_first_task():
    import time

    from main import Card, Page, SuitEnum, RanksEnum, fast_search

    numbers = [*range(10, 1001)]

    # Test case #1
    # Target value to be searched
    target = 10

    # Function call
    index = fast_search(numbers, target)

    assert index == 0, f'Number index must be 0, but found {index}, Test case #1 failed'

    # Test case #2
    # Target value to be searched
    target = 999

    # Function call
    index = fast_search(numbers, target)

    assert index == 989, f'Number index must be 989, but found {index}, Test case #2 failed'

    cards = [
        Card(suit=suit, rank=rank)
        for suit in SuitEnum
        for rank in RanksEnum
    ]

    # Test case #3
    # Target value to be searched
    target = Card(SuitEnum.hearts, RanksEnum.two)

    # Function call
    card_index = fast_search(cards, target)

    assert card_index == 0, f'Card index must be 0, but found {card_index}, Test case #3 failed'

    # Test case #4
    # Target value to be searched
    target = Card(SuitEnum.clovers, RanksEnum.jack)

    # Function call
    card_index = fast_search(cards, target)

    assert card_index == 35, f'Card index must be 35, but found {card_index}, Test case #4 failed'

    # Test case #5
    # Target value to be searched
    target = Card(SuitEnum.pikes, RanksEnum.ace)

    # Function call
    card_index = fast_search(cards, target)

    assert card_index == 51, f'Card index must be 51, but found {card_index}, Test case #5 failed'

    pages_count = 10_000_000
    pages = [
        Page(page_number=page_number)
        for page_number in range(1, pages_count)
    ]

    target = Page(page_number=5_000_000)

    start = time.monotonic()
    page_index = fast_search(pages, target)
    finish_time = time.monotonic()

    assert finish_time - start < 1e-3, f'It\'s to slow, search runs {finish_time - start} seconds, Test case #6 failed'

    assert page_index == 4_999_999, f'Page index must be 499_999, but found {page_index}, Test case #7 failed'


# ------------------------------------------------------------------------------------------------


# ------------------------------------------------------------------------------------------------
@test_decorator
def test_second_task():
    import time
    import types

    from main import fibonacci_generator

    # Test case #1
    fib_generator = fibonacci_generator(n=1)
    assert isinstance(fib_generator, types.GeneratorType), f'fibonacci_generator is not sequence of generators'

    # Test case #2
    fibonacci_number = next(fib_generator)
    assert fibonacci_number == 0, f'Expected 0, but got {fibonacci_number} as first fibonacci number'

    # Test case #3
    fib_generator = fibonacci_generator(n=6)

    last_fibonacci_number = None
    for last_fibonacci_number in fib_generator:
        pass

    assert last_fibonacci_number == 5, f'Expected 5, but got {fibonacci_number} as 6th fibonacci number'

    # Test case #4
    fib_generator = fibonacci_generator(n=10000)

    last_fibonacci_number = None
    start_time = time.monotonic()
    for last_fibonacci_number in fib_generator:
        pass
    finish_time = time.monotonic()

    assert finish_time - start_time < 1e-1, f'It\'s to slow, generation runs {finish_time - start_time} seconds'

    # 10000th fibonacci number
    expected_number = 20793608237133498072112648988642836825087036094015903119682945866528501423455686648927456034305226515591757343297190158010624794267250973176133810179902738038231789748346235556483191431591924532394420028067810320408724414693462849062668387083308048250920654493340878733226377580847446324873797603734794648258113858631550404081017260381202919943892370942852601647398213554479081823593715429566945149312993664846779090437799284773675379284270660175134664833266377698642012106891355791141872776934080803504956794094648292880566056364718187662668970758537383352677420835574155945658542003634765324541006121012446785689171494803262408602693091211601973938229446636049901531963286159699077880427720289235539329671877182915643419079186525118678856821600897520171070499437657067342400871083908811800976259727431820539554256869460815355918458253398234382360435762759823179896116748424269545924633204614137992850814352018738480923581553988990897151469406131695614497783720743461373756218685106856826090696339815490921253714537241866911604250597353747823733268178182198509240226955826416016690084749816072843582488613184829905383150180047844353751554201573833105521980998123833253261228689824051777846588461079790807828367132384798451794011076569057522158680378961532160858387223882974380483931929541222100800313580688585002598879566463221427820448492565073106595808837401648996423563386109782045634122467872921845606409174360635618216883812562321664442822952537577492715365321134204530686742435454505103269768144370118494906390254934942358904031509877369722437053383165360388595116980245927935225901537634925654872380877183008301074569444002426436414756905094535072804764684492105680024739914490555904391369218696387092918189246157103450387050229300603241611410707453960080170928277951834763216705242485820801423866526633816082921442883095463259080471819329201710147828025221385656340207489796317663278872207607791034431700112753558813478888727503825389066823098683355695718137867882982111710796422706778536913192342733364556727928018953989153106047379741280794091639429908796650294603536651238230626
    assert last_fibonacci_number == expected_number, f'Expected {expected_number}, ' \
                                                     f'but got {last_fibonacci_number} as 10000th fibonacci number'


# ------------------------------------------------------------------------------------------------


# ------------------------------------------------------------------------------------------------
@test_decorator
def test_third_task():
    import types
    from main import pow_func

    pow3_func = pow_func(n=3)
    assert isinstance(pow3_func, types.FunctionType), f'pow3_func is not sequence of functions'

    # Test case #1
    assert pow3_func(3) == 27, f'Expected 27, but got {pow3_func(3)} as 3 ^ 3'

    # Test case #2
    assert pow3_func(2) == 8, f'Expected 8, but got {pow3_func(2)} as 2 ^ 3'

    # Test case #3
    pow2_func = pow_func(n=2)
    assert pow2_func(3) == 9, f'Expected 9, but got {pow2_func(3)} as 3 ^ 2'

    # Test case #4
    pow2_func = pow_func(n='2')
    assert pow2_func(3) is None, f'Expected None, but got {pow2_func(3)}'


# ------------------------------------------------------------------------------------------------


# ------------------------------------------------------------------------------------------------
@test_decorator
def test_fourth_task():
    # There are no tests for this task :(
    pass
# ------------------------------------------------------------------------------------------------
