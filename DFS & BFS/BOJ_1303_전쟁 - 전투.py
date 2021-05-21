from collections import deque
import sys
def solution(x, y, team):
    q = deque([[x, y]])
    count = 1
    visit[x][y] = True
    while q:
        r, c = q.popleft()
        for (rr, cc) in ((r, c + 1), (r, c - 1), (r + 1, c), (r - 1, c)):
            if 1 <= rr <= m and 1 <= cc <= n:
                if not visit[rr][cc] and graph[rr][cc] == team:
                    q.append([rr, cc])
                    count += 1
                    visit[rr][cc] = True
    return count ** 2
n, m = map(int, input().split())
w, b = 0, 0
graph = [[0]] + [([0] + list(sys.stdin.readline().rstrip())) for _ in range(m)]
visit = [[False] * (n + 1) for _ in range(m + 1)]
for x in range(1, m + 1):
    for y in range(1, n + 1):
        if not visit[x][y]:
            if graph[x][y] == 'W':
                w += solution(x, y, graph[x][y])
            elif graph[x][y] == 'B':
                b += solution(x, y, graph[x][y])
print(w, b, end=" ")