import sys
from collections import deque
def solution(n, m):
    q = deque([[1, 1]])
    visit[1][1] = 0
    while q:
        r, c = q.popleft()
        for (rr, cc) in ((r + 1, c), (r, c + 1), (r - 1, c), (r, c - 1)):
            if 1 > rr or rr > n or 1 > cc or cc > m:
                continue
            elif visit[rr][cc] == 9999:
                if graph[rr][cc] == 0:
                    q.appendleft([rr, cc])
                    visit[rr][cc] = visit[r][c]
                else:
                    q.append([rr, cc])
                    visit[rr][cc] = visit[r][c] + 1
    return visit[n][m]
m, n = map(int, input().split())
graph = [[]]
visit = [[9999] * (m + 1) for _ in range(n + 1)]    #9999는 방문X 의미
for _ in range(n):
    graph.append([0] + list(map(int, sys.stdin.readline().rstrip())))
print(solution(n, m))