import math
from itertools import permutations

def sosu(checkNum):
    for i in range(2, int(math.sqrt(checkNum)) + 1):
        if checkNum % i == 0:
            return 0
    return 1

def solution(numbers):
    answer = set()
    intNumArr = []

    for i in range(1, len(numbers) + 1):
        intNumArr += list(map(''.join, permutations(numbers, i)))

    for s in list(set(intNumArr)):
        if int(s) > 1 and sosu(int(s)):
            answer.add(int(s))

    return len(answer)

#프로그래머스 제출 시 밑에 코드는 제외
#numbers = "3256"
#numbers = "17"
numbers = "011"
print(solution(numbers))