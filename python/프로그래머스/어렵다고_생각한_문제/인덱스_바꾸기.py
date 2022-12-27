def solution(my_string, num1, num2):
    
    result = list(my_string)
    result.pop(num1)
    result.insert(num1, my_string[num2])
    result.pop(num2)
    result.insert(num2, my_string[num1])
    answer = ''.join(result)
    return answer

def solution(my_string, num1, num2):
    s = list(my_string)
    s[num1],s[num2] = s[num2],s[num1]
    return ''.join(s)