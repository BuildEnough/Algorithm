def solution(numbers, direction):
    if direction == 'right':
        pop_ = numbers.pop()
        numbers.insert(0, pop_)
        return numbers
    else:
        pop_ = numbers.pop(0)
        numbers.append(pop_)
        return numbers


from collections import deque

def solution(numbers, direction):
    numbers = deque(numbers)
    if direction == 'right':
        numbers.rotate(1)
    else:
        numbers.rotate(-1)
    return list(numbers)