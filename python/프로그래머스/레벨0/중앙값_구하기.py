def solution(array):
    array.sort()
    if len(array) % 2 == 1:
        result = len(array) // 2
    return array[result]