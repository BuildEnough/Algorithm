def solution(n):
    sum = 0
    for i in range(1, n+1):
        if n % i == 0:
            sum += i
    return sum

def solution(n):
    return sum([i for i in range(1, n+1) if n % i == 0])