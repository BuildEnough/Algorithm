N, M = map(int, input().split())
arr = list(map(int, input().split()))

A = sum(arr[:M])
result = A
for i in range(M, N):
    A += arr[i] - arr[i - M]
    result = max(result, A)

print(result)