import sys
from collections import deque
def bfs(i, j):
    q = deque()
    q.append([i, j])
    while q:
        ii, jj = q.popleft()
        if not visit[ii][jj]:
            visit[ii][jj] = True
            for d in range(4):
                if ii + dy[d] <= -1 or ii + dy[d] >= n or jj + dx[d] <= -1 or jj + dx[d] >= m:
                    continue
                elif (not visit[ii + dy[d]][jj + dx[d]]) and graph[ii + dy[d]][jj + dx[d]] == 1:
                    q.append([ii + dy[d], jj + dx[d]])
dx = [1, 0, -1, 0]
dy = [0, 1, 0, -1]
t = int(input())
for _ in range(t):
    m, n, k = map(int, input().split())
    graph = [[0] * m for _ in range(n)]
    visit = [[False] * m for _ in range(n)]
    count = 0
    for _ in range(k):
        x, y = map(int, sys.stdin.readline().split())
        graph[y][x] = 1
    for i in range(n):
        for j in range(m):
            if graph[i][j] == 1 and not visit[i][j]:
                bfs(i, j)
                count += 1
    print(count)