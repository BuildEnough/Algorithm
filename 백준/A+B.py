import sys

sys.stdin = open("A+B.txt")

A, B = map(int, input().split())

print(A + B)
