F = int(input())
S = input()

S = S[::-1]

for i in S:
    print(F * int(i))

S = S[::-1]

print(F * int(S))