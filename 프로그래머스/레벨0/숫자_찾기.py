def solution(num, k):
    num = str(num)
    if num.find(str(k)) >= 0:
        return num.find(str(k)) + 1
    else:
        return num.find(str(k))


def solution(num, k):
    try:
        return str(num).index(str(k)) + 1
    except ValueError:
        return -1