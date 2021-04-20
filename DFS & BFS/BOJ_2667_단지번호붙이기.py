import sys
sys.setrecursionlimit(10**6)
def solution(c, x, y):
    if (not visit[x][y]) and graph[x][y] == 1:
        visit[x][y] = True
        count[c] += 1
        for d in range(4):
            if 0 <= x + dx[d] < n and 0 <= y + dy[d] < n:
                solution(c, x + dx[d], y + dy[d])
        return True
    return False

n = int(input())
graph = [list(map(int, input())) for _ in range(n)]
visit = [[False] * n for _ in range(n)]
dx = [0, -1, 0, 1]
dy = [1, 0, -1, 0]
count = [0] * (n * n)
c = 0
answer = 0
for i in range(n):
    for j in range(n):
        if solution(c, i, j):
            answer += 1
            c += 1
print(answer)
count.sort()
for i in count:
    if i != 0:
        print(i)