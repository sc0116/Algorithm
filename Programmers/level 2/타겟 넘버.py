def solution(numbers, target):
    answer = 0
    s = []
    s.append([numbers[0], 0])
    s.append([-numbers[0], 0])
    while s:
        temp, now = s.pop()
        if now == len(numbers) - 1:
            if temp == target:
                answer += 1
        else:
            s.append([temp + numbers[now + 1], now + 1])
            s.append([temp - numbers[now + 1], now + 1])
    return answer

#프로그래머스 제출 시 밑에 코드는 제외
numbers = list(map(int, input()))
target = int(input())
print(solution(numbers, target))