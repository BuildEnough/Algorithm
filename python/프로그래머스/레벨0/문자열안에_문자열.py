def solution(str1, str2):
    result = str1.find(str2)
    if result == -1:
        return 2
    else:
        return 1


def solution(str1, str2):
    if str1.count(str2):
        return 1
    else:
        return 2


def solution(str1, str2):
    if str2 in str1:
        return 1
    else:
        return 2
