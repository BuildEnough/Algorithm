A, B, C = map(int, input().split())

x = (C-B)/(A-B)
if x == int(x):
    print(int(x))
else:
    print(int(x) + 1)