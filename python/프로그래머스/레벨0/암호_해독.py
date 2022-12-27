def solution(cipher, code):
    answer= []
    a = code
    for i in range(1, (len(cipher)//code)+1):
        answer.append(cipher[i*code-1])
    answer = ''.join(answer)
    return answer