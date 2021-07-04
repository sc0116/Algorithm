import copy
from collections import deque
def solution(g):
    visit = [[False] * m for _ in range(n)]
    q = deque(virus)
    for (r, c) in q:
        visit[r][c] = True
    while q:
        r, c = q.popleft()
        for (rr, cc) in ((r + 1, c), (r, c - 1), (r - 1, c), (r, c + 1)):
            if 0 <= rr < n and 0 <= cc < m and not visit[rr][cc] and g[rr][cc] == 0:
                q.append([rr, cc])
                g[rr][cc] = 2
                visit[rr][cc] = True
    result = 0
    for i in range(n):
        result += g[i].count(0)
    return result
n, m = map(int, input().split())
graph = [list(map(int, input().split())) for _ in range(n)]
empty_place, virus = [], []
result = 0
for i in range(n):
    for j in range(m):
        if graph[i][j] == 0:
            empty_place.append([i, j])
        elif graph[i][j] == 2:
            virus.append([i, j])
for w1 in range(len(empty_place)):
    for w2 in range(w1 + 1, len(empty_place)):
        for w3 in range(w2 + 1, len(empty_place)):
            w = [empty_place[w1], empty_place[w2], empty_place[w3]]
            for (r, c) in w:
                graph[r][c] = 1
            g = copy.deepcopy(graph)
            result = max(result, solution(g))
            for (r, c) in w:
                graph[r][c] = 0
print(result)