H, M = map(int, input().split())

if M - 45 < 0:
    M = M - 45 + 60
    H -= 1
else:
    M -= 45

if H < 0:
    H = 23

print(H, M)