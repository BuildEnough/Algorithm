def solution(my_string):
    alpa = ['a', 'e', 'i', 'o', 'u']
    for i in alpa:
        my_string = my_string.replace(i, '')
    return my_string


def solution(my_string):
    answer = ''

    for c in my_string:
        if c in ['a', 'e', 'i', 'o', 'u']:
            continue
        answer += c

    return answer