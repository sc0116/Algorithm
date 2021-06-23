from collections import deque
def solution(n, m):
    q = deque([[0, 0, 0]])
    visit[0][0][0] = 1
    while q:
        r, c, check = q.popleft()
        if r == n - 1 and c == m - 1:
            return visit[r][c][check]
        for (rr, cc) in ((r, c + 1), (r - 1, c), (r, c - 1), (r + 1, c)):
            if 0 <= rr < n and 0 <= cc < m and visit[rr][cc][check] == 0:
                if graph[rr][cc] == 0:
                    q.append([rr, cc, check])
                    visit[rr][cc][check] = visit[r][c][check] + 1
                elif check == 0:
                    q.append([rr, cc, 1])
                    visit[rr][cc][1] = visit[r][c][check] + 1
    return -1
n, m = map(int, input().split())
graph = [list(map(int, input())) for _ in range(n)]
visit = [[[0] * 2 for _ in range(m)] for _ in range(n)]
print(solution(n, m))