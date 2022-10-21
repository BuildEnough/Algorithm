def solution(hp):
    answer = 0
    j = hp // 5
    j_ = hp % 5
    if j_ < 5:
        b = j_ // 3
        b_ = j_ % 3
        if b_ < 3:
            i = b_
    answer = j + b + i
    return answer


def solution(hp):    
    return hp // 5 + (hp % 5 // 3) + ((hp % 5) % 3)


def solution(hp):
    answer = 0
    answer += hp//5
    hp %= 5
    answer += hp//3
    hp %= 3
    answer += hp//1

    return answer