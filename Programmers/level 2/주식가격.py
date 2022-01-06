def solution(prices):
    answer = [0] * (len(prices))
    size = len(prices)
    for i in range(size):
        for j in range(i + 1, size):
            answer[i] += 1
            if prices[i] > prices[j]:
                break
    return answer

#프로그래머스 제출 시 밑에 코드는 제외
prices = [1, 2, 3, 2, 3]
print(solution(prices))