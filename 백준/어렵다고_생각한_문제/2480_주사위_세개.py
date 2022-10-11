# https://www.acmicpc.net/problem/2480

dice = list(map(int, input().split()))

a = 0

if len(set(dice)) == 1:
    print((10000) + (dice[0] * 1000))

elif len(set(dice)) == 3:
    print(max(dice) * 100)

else:
    for i in range(3):
        if dice.count(dice[i]) == 2:
            a = dice[dice.index(dice[i])]
    print(1000 + (a * 100))

# set 중복 제거 이용
# len(set(arr)) == 1이면 모든 수가 같은 수 => 같은 눈이 3개
# len(set(arr)) == 3 이면 모두 다름

# 2개일 경우
# 반복문 + count + index
# count가 2개 이상인 index찾아 dice[index]반환
