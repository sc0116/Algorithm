import copy
from itertools import combinations
from collections import deque

def solution(g,v ):
    visit = [[-1] * n for _ in range(n)]
    q = deque(v)

    for (r, c) in q:
        visit[r][c] = 0

    while q:
        r, c = q.popleft()

        for (rr, cc) in ((r + 1, c), (r, c + 1), (r - 1, c), (r, c - 1)):
            if 0 <= rr < n and 0 <= cc < n:
                if g[rr][cc] in (0, 2) and visit[rr][cc] == -1:
                    q.append([rr, cc])
                    g[rr][cc] = 2
                    visit[rr][cc] = visit[r][c] + 1

    count = 0
    result = 0
    for i in range(n):
        count += g[i].count(2)
        result = max(result, max(visit[i]))
    if count == (len(emptyList) + len(virusList)):
        return result
    else:
        return -1

n, m = map(int, input().split())
graph = [list(map(int, input().split())) for _ in range(n)]
emptyList = []
virusList = []
result = 999999
for i in range(n):
    for j in range(n):
        if graph[i][j] == 0:
            emptyList.append([i, j])
        elif graph[i][j] == 2:
            virusList.append([i, j])

for v in combinations(virusList, m):
    for (r, c) in v:
        graph[r][c] = 2

    g = copy.deepcopy(graph)
    check = solution(g, v)
    if check != -1:
        result = min(result, check)

    for (r,c) in v:
        graph[r][c] = 0

if result == 999999:
    print(-1)
else:
    print(result)