def solution(phone_number):
    answer = phone_number.replace(phone_number[0:-4], '*' * len(phone_number[0:-4]))
    return answer