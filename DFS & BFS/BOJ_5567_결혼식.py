import sys
from collections import deque
def solution(i):
    q = deque([[i, 0]])
    visit[i] = True
    while q:
        n, m = q.popleft()
        for nn in graph[n]:
            if not visit[nn] and m + 1 <= 2:
                q.append([nn, m + 1])
                visit[nn] = True
    return visit.count(True) - 1
n = int(input())
m = int(input())
graph = [[] * (n + 1) for _ in range(n + 1)]
visit = [False] * (n + 1)
for _ in range(m):
    a, b = map(int, sys.stdin.readline().split())
    graph[a].append(b)
    graph[b].append(a)
print(solution(1))