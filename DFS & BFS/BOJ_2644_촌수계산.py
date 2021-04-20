import sys
from collections import deque
def bfs(start, end):
    q = deque([start])
    visit[start] = 0
    while q:
        now = q.popleft()
        if now == end:
            return visit[end]
        if visit[now] != -1:
            for i in range(1, n + 1):
                if visit[i] == -1 and graph[now][i] == 1:
                    q.append(i)
                    visit[i] = visit[now] + 1
    return -1

n = int(sys.stdin.readline())
graph = [[0] * (n + 1) for _ in range(n + 1)]
visit = [-1] * (n + 1)
start, end = map(int, sys.stdin.readline().split())
m = int(sys.stdin.readline())
for _ in range(m):
    x, y = map(int, sys.stdin.readline().split())
    graph[x][y] = graph[y][x] = 1
print(bfs(start, end))