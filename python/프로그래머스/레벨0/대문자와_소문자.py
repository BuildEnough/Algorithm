def solution(my_string):
    result = []
    for i in my_string:
        if ord(i) >= 97:
            result.append(chr(ord(i) - 32))
        elif ord(i) >= 65 and ord(i) < 97:
            result.append(chr(ord(i) + 32))
    
    answer = ''.join(result)
    return answer


def solution(my_string):
    answer = ''

    for i in my_string:
        if i.isupper():
            answer+=i.lower()
        else:
            answer+=i.upper()
    return answer