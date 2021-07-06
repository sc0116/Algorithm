def solution(array, commands):
    answer = []
    for (i, j, k) in commands:
        temp = sorted(array[i - 1 : j])
        answer.append(temp[k - 1])
    return answer

#프로그래머스 제출 시 밑에 코드는 제외
array = [1, 5, 2, 6, 3, 7, 4]
commands = [[2, 5, 3], [4, 4, 1], [1, 7, 3]]
print(solution(array, commands))