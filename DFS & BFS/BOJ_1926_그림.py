from collections import deque
def solution(r, c):
    mNum = 1
    q = deque([[r, c]])
    visit[r][c] = True
    while q:
        rr, cc = q.popleft()
        for (ii, jj) in ((rr + 1, cc), (rr, cc + 1), (rr - 1, cc), (rr, cc - 1)):
            if ii < 1 or n < ii or jj < 1 or m < jj:
                continue
            elif graph[ii][jj] == 1 and not visit[ii][jj]:
                q.append([ii, jj])
                visit[ii][jj] = True
                mNum += 1
    return mNum
n, m = map(int, input().split())
graph = [[0] * (m + 1) for _ in range(n + 1)]
visit = [[False] * (m + 1) for _ in range(n + 1)]
count = maxNum = 0
for g in range(1, n + 1):
    graph[g] = [0] + list(map(int, input().split()))
for i in range(1, n + 1):
    for j in range(1, m + 1):
        if graph[i][j] == 1 and not visit[i][j]:
            count += 1
            maxNum = max(maxNum, solution(i, j))
print(count)
print(maxNum)