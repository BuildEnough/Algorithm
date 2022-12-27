def solution(seoul):
    answer = seoul.index("Kim")
    result  = '김서방은 ' + str(answer) + '에 있다'
    return result

def findKim(seoul):
    return "김서방은 {}에 있다".format(seoul.index("Kim"))
