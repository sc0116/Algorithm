from collections import deque

def solution(i, j, mm):
    q = deque([[i, j]])
    visit[i][j] = 1
    while q:
        r, c = q.popleft()
        for rr, cc in ((r + 1, c), (r, c + 1), (r - 1, c), (r, c - 1)):
            if 0 <= rr < n and 0 <= cc < n:
                if arr[rr][cc] > mm and not visit[rr][cc]:
                    q.append([rr, cc])
                    visit[rr][cc] = 1

n = int(input())
arr = [list(map(int, input().split())) for _ in range(n)]
m = max(map(max, arr))
result = 1

for mm in range(1, m):
    temp = 0
    visit = [[0] * n for _ in range(n)]
    for i in range(n):
        for j in range(n):
            if arr[i][j] > mm and not visit[i][j]:
                solution(i, j, mm)
                temp += 1
    result = max(result, temp)
print(result)