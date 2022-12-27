import sys

input=lambda:sys.stdin.readline().strip()

dic={}

N, M=map(int,input().split())

for i in range(N):
    a = input()
    dic[a] = str(i+1)
    dic[str(i + 1)] = a
    
for _ in range(M):
    print(dic[input()])