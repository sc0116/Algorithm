import sys
from collections import deque
def solution(nn, mm):
    q, count = deque([[nn, mm]]), 0
    while q:
        r, c = q.popleft()
        if not visit[r][c]:
            visit[r][c] = True
            count += 1
            for rr, cc in ([1, 0], [0, -1], [-1, 0], [0, 1]):
                if (0 < r + rr <= n) and (0 < c + cc <= m) and (graph[r + rr][c + cc] == 1):
                    q.append([r + rr, c + cc])
    return count
n, m, k = map(int, input().split())
graph = [[0] * (m + 1) for _ in range(n + 1)]
visit = [[False] * (m + 1) for _ in range(n + 1)]
answer = 0
for _ in range(k):
    r, c = map(int, sys.stdin.readline().split())
    graph[r][c] = 1
for nn in range(1, n + 1):
    for mm in range(1, m + 1):
        if graph[nn][mm] == 1 and not visit[nn][mm]:
            answer = max(answer, solution(nn, mm))
print(answer)