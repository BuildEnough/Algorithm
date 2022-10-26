def solution(n):
    answer = [i for i in str(n)]
    answer.sort()
    answer.reverse()
    return int(''.join(answer))

def solution(n):
    ls = list(str(n))
    ls.sort(reverse = True)
    return int("".join(ls))