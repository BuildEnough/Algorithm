def solution(x):
    sum_ = 0
    for i in str(x):
        sum_ += int(i)
    if x % sum_ == 0:
        return bool(1)
    else:
        return bool(0)

def Harshad(n):
    return n % sum([int(c) for c in str(n)]) == 0