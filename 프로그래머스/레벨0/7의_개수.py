def solution(array):
    answer = 0
    for i in array:
        a = str(i).count('7')
        answer += a
    return answer
        

def solution(array):
    answer = sum([str(i).count("7") for i in array])
    return answer