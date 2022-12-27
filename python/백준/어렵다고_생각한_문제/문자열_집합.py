import sys
input = sys.stdin.readline

n, m = map(int, input().split())
result = 0

S = {input().strip() for _ in range(n)}

for j in range(m):
    if input().strip() in S:result += 1
print(result)