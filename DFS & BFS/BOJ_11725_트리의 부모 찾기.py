import sys
from collections import deque
def bfs(root):
    q = deque([root])
    visit[root] = 0
    while q:
        now = q.popleft()
        if visit[now] != -1:
            for next in graph[now]:
                if visit[next] == -1:
                    q.append(next)
                    visit[next] = now
n = int(input())
graph = [[] for _ in range(n + 1)]
visit = [-1] * (n + 1)
for _ in range(n - 1):
    a, b = map(int, sys.stdin.readline().split())
    graph[a].append(b)
    graph[b].append(a)
bfs(1)
for i in range(2, n + 1):
    print(visit[i])