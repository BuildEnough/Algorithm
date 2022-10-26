def solution(rsp):
    rsp_d = {
        '2': '0',
        '0': '5',
        '5': '2',
    }
    answer_list= []
    for i in rsp:
        answer_list.append(rsp_d[i])
    
    answer = "".join(answer_list)
    return answer
        



def solution(rsp):
    d = {
        '0':'5',
        '2':'0',
        '5':'2'
    }
    return ''.join(d[i] for i in rsp)