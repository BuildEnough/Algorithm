def solution(my_string):
    answer = ['1', '2', '3', '4', '5', '6', '7', '8' ,'9']
    result = 0
    for i in my_string:
        if i in answer:
            result += int(i)
    return result