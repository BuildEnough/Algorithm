def solution(s):
    s = s.lower()
    
    s_count = s.count('p')
    y_count = s.count('y')
    
    if s_count == y_count or s_count == y_count == 0:
        return bool(1)
    else:
        return bool(0)

def numPY(s):
    return s.lower().count('p') == s.lower().count('y')