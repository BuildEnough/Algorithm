# def solution(num_list):
#     EVEN = 0
#     ODD = 0

#     answer = []
#     for i in num_list:
#         if i % 2 == 0:
#             EVEN += 1
#         else:
#             ODD += 1
#     answer.append(EVEN)
#     answer.append(ODD)
#     return answer


# def solution(num_list):
#     answer = [0,0]

#     for num in num_list:
#         if num % 2 == 0:
#             answer[0] += 1
#         else:
#             answer[1] += 1

#     return answer

# def solution(num_list):
#     answer = [0, 0]
#     for n in num_list:
#         answer[n % 2] += 1
#     return answer
num_list = [
    1,
    2,
    3,
    4,
    5,
]


answer = [0, 0]
for n in num_list:
    answer[n % 2] += 1
print(answer)
