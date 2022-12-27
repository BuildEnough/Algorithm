A = int(input())
B = int(input())
F = A // 100
result = F * 100

while result % B != 0:
    result += 1
print(str(result)[-2:])