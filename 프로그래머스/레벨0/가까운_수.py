def solution(array, n):
    answer = []
    for i in array:
        num = n - i
        if num < 0:
            num *= -1
        answer.append(num)
    answer = answer.index(min(answer))
    return array[answer]
    