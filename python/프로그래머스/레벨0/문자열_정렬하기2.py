def solution(my_string):
    answer = []
    for i in my_string:
        if i.isupper():
            answer += i.lower()
        else:
            answer += i
    answer.sort()
    answer =''.join(answer)
    return answer


def solution(my_string):
    answer = "".join(sorted(list(my_string.lower())))
    return answer