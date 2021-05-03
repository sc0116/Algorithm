import sys
from collections import deque
def solution(i, n):
    q = deque([i])
    visit = [False] * (n + 1)
    visit[i] = True
    while q:
        n = q.popleft()
        for nn in graph[n]:
            if not visit[nn]:
                q.append(nn)
                visit[nn] = True
                answer[i][1] += 1
                answer[nn][0] += 1
n, m = map(int, sys.stdin.readline().split())
graph = [[] for _ in range(n + 1)]
answer = [[0, 0] for _ in range(n + 1)]
result = 0
for _ in range(m):
    a, b = map(int, sys.stdin.readline().split())
    graph[a].append(b)
for i in range(1, n + 1):
    solution(i, n)
for i in range(1, n + 1):
    if answer[i][0] + answer[i][1] == n - 1:
        result += 1
print(result)