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
