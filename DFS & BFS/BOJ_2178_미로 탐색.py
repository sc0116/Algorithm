from collections import deque
def bfs(endN, endM):
    q = deque()
    q.append([0, 0])
    visit[0][0] = 1
    while q:
        nowX, nowY = q.popleft()
        if nowX == endN and nowY == endM:
            return visit[nowX][nowY]
        for next in range(4):
            if nowX + dx[next] <= -1 or nowX + dx[next] >= n or nowY + dy[next] <= -1 or nowY + dy[next] >= m:
                continue
            elif visit[nowX + dx[next]][nowY + dy[next]] == 0 and maze[nowX + dx[next]][nowY + dy[next]] == 1:
                q.append([nowX + dx[next], nowY + dy[next]])
                visit[nowX + dx[next]][nowY + dy[next]] += visit[nowX][nowY] + 1


n, m = map(int, input().split())
maze = [list(map(int, input())) for _ in range(n)]
visit = [[0] * m for _ in range(n)]
dx = [1, -1, 0, 0]
dy = [0, 0, -1, 1]
print(bfs(n - 1, m - 1))
