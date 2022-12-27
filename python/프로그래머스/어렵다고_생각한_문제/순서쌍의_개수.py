def solution(n):
    count = 0
    for i in range(1, n+1):
        if n % i == 0:
            count += 1
    
    return count


def solution(n):
    return len(list(filter(lambda v: n % (v+1) == 0, range(n))))