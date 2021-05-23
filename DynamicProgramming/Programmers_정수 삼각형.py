def solution(triangle):
    answer = 0
    arr = [[] for _ in range(len(triangle))]
    for t in range(len(triangle)):
        arr[t] = [0] * len(triangle[t])
    arr[0][0] = triangle[0][0]

    for i in range(len(triangle)):
        for j in range(len(triangle[i])):
            if i == len(triangle) - 1:
                answer = max(answer, arr[i][j])
            else:
                for (ii ,jj) in ((i + 1, j), (i + 1, j + 1)):
                    if ii < len(triangle) and jj < len(triangle[ii]):
                        if arr[ii][jj]:
                            arr[ii][jj] = max(arr[i][j] + triangle[ii][jj], arr[ii][jj])
                        else:
                            arr[ii][jj] = arr[i][j] + triangle[ii][jj]
    return answer

#프로그래머스 제출 시 밑에 코드는 제외
triangle = [[7], [3, 8], [8, 1, 0], [2, 7, 4, 4], [4, 5, 2, 6, 5]]
print(solution(triangle))