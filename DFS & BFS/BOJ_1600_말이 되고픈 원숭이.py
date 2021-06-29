from collections import deque
def solution(k, h, w):
    q = deque([[0, 0, k]])
    while q:
        r, c, kk = q.popleft()
        if r == h - 1 and c == w - 1:
            return visit[r][c][kk]
        if kk > 0:
            for (rr, cc) in ((r - 1, c + 2), (r - 2, c + 1), (r - 2, c - 1), (r - 1, c - 2), (r + 1, c - 2), (r + 2, c - 1), (r + 2, c + 1), (r + 1, c + 2)):
                if 0 <= rr < h and 0 <= cc < w and not visit[rr][cc][kk - 1] and graph[rr][cc] == 0:
                    q.append([rr, cc, kk - 1])
                    visit[rr][cc][kk - 1] = visit[r][c][kk] + 1
        for (rr, cc) in ((r, c + 1), (r - 1, c), (r, c - 1), (r + 1, c)):
            if 0 <= rr < h and 0 <= cc < w and not visit[rr][cc][kk] and graph[rr][cc] == 0:
                q.append([rr, cc, kk])
                visit[rr][cc][kk] = visit[r][c][kk] + 1
    return -1
k = int(input())
w, h = map(int, input().split())
graph = [list(map(int, input().split())) for _ in range(h)]
visit = [[[0] * (k + 1) for _ in range(w)] for _ in range(h)]
print(solution(k, h, w))