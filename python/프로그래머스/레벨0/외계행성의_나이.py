def solution(age):
    answer = []
    for i in str(age):
        i = int(i)
        i += 97
        answer.append(chr(i))
    answer = ''.join(answer)
    return answer


def solution(age):
    str_age = str(age)
    answer = ''
    lst =["a","b","c","d","e","f","g","h","i","j"]
    for ch in str_age:
        for i in range(0,10):
            if int(ch) == i:
                answer += lst[i]
    return answer