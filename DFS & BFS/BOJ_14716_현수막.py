import sys
def dfs(i, j):
    s = [[i, j]]
    while s:
        r, c = s.pop()
        for (rr, cc) in ((r + 1, c), (r, c + 1), (r - 1, c), (r, c - 1), (r - 1, c - 1), (r - 1, c + 1), (r + 1, c + 1), (r + 1, c -1)):
            if 0 <= rr < m and 0 <= cc < n and graph[rr][cc] == 1 and not visit[rr][cc]:
                s.append([rr, cc])
                visit[rr][cc] = True
    return 1
m, n = map(int, input().split())
graph = [list(map(int, sys.stdin.readline().split())) for _ in range(m)]
visit = [[False] * n for _ in range(m)]
result = 0
for i in range(m):
    for j in range(n):
        if not visit[i][j] and graph[i][j] == 1:
            result += dfs(i, j)
print(result)