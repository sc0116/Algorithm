import sys
sys.setrecursionlimit(10**6)
def dfs(i, j):
    if i <= -1 or i >= h or j <= -1 or j >= w:
        return False
    if (not visit[i][j]) and island[i][j] == 1:
        visit[i][j] = True
        for d in range(8):
            dfs(i + dx[d], j + dy[d])
        return True
    return False
dx = [1, 1, 0, -1, -1, -1, 0, 1]
dy = [0, -1, -1, -1, 0, 1, 1, 1]
while True:
    w, h = map(int, input().split())
    if w == 0 and h == 0:
        break
    island = [list(map(int, input().split())) for _ in range(h)]
    visit = [[False] * w for _ in range(h)]
    answer = 0
    for x in range(h):
        for y in range(w):
            if dfs(x, y):
                answer += 1
    print(answer)
