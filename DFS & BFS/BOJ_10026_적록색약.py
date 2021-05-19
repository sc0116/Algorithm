import sys
from collections import deque
def solution(visit, nn, mm, color):
    q = deque([[nn, mm]])
    visit[nn][mm] = True
    while q:
        r, c = q.popleft()
        for (rr, cc) in ((r, c + 1), (r, c - 1), (r + 1, c), (r - 1, c)):
            if 0 > rr or rr >= n or 0 > cc or cc >= n:
                continue
            elif graph[rr][cc] in color and not visit[rr][cc]:
                q.append([rr, cc])
                visit[rr][cc] = True
    return 1
n = int(input())
graph = [list(sys.stdin.readline().rstrip()) for _ in range(n)]
visit = [[False] * n for _ in range(n)]
visit2 = [[False] * n for _ in range(n)]
count = count2 = 0
for i in range(n):
    for j in range(n):
        if not visit[i][j]:
            color = [graph[i][j]]
            count += solution(visit, i, j, color)
        if not visit2[i][j]:
            if graph[i][j] in ('R', 'G'):
                color = ['R', 'G']
            elif graph[i][j] == 'B':
                color = ['B']
            count2 += solution(visit2, i, j, color)
print(count, count2, end="")