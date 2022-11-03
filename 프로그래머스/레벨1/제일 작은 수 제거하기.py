def solution(arr):
    arr.sort(reverse=True)
    arr.pop()
    if len(arr) == 0:
        return [-1]
    else:
        return arr