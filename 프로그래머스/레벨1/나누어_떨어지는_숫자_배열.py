def solution(arr, divisor):
    answer = [i for i in arr if i % divisor == 0]
    if len(answer) == 0:
        return [-1]
    else:
        return sorted(answer)


def solution(arr, divisor):
    return sorted([n for n in arr if n%divisor == 0]) or [-1]