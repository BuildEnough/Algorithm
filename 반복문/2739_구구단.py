# N = int(input())

# for i in range(1, 10):
#     print(f"{N} * {i} = {N * i}")

N = int(input())
i = 1

while True:
    print(f"{N} * {i} = {N * i}")
    i += 1
    if i >= 10:
        break
