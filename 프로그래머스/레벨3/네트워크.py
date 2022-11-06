g_check = []
g_computers = []

def solution(n, computers):
    answer = 0
    global g_check, g_computers
    g_computers = computers
    g_check = [False for i in range(n)]
    for j in range(n):
        if g_check[j] == False:
            dfs(j)
            answer += 1
    return answer

def dfs(j):
    global g_check
    if g_check[j] == True:
        return
    g_check[j] = True
    for (idx, v) in enumerate(g_computers[j]):
        if v == 1:
            if g_check[idx] == False:
                dfs(idx)