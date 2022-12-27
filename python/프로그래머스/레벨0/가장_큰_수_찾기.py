def solution(array):
    answer = []
    max_ = max(array)
    index_ = array.index(max_)
    answer.append(max_)
    answer.append(index_)
    return answer


def solution(array):
    return [max(array), array.index(max(array))]


def solution(array):
    val = max(array)
    return [val, array.index(val)]