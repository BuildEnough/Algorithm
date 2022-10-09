A, B = map(int, input().split())
C = int(input())

if B + C >= 60:
    A += 1
    B += 60 - C
else:
    B = B + C

if A >= 24:
    A = 0

print(A, B)