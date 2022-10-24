def solution(n):
    
    result = list(str(n))
    result = result[::-1]
    
    result = list(map(int, result))
    return result

def digit_reverse(n):
    return list(map(int, reversed(str(n))))