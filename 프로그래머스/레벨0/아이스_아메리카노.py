def solution(money):
    cost = 5500
    cup = money // cost
    change = money - (cup * cost)

    answer = []
    answer.append(cup)
    answer.append(change)
    return answer


def solution(money):
    answer = [money // 5500, money % 5500]
    return answer
