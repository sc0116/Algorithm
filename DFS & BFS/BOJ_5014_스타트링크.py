from collections import deque
def solution(f, s, g, u, d):
    if (s < g and u == 0) or (s > g and d == 0):
        return "use the stairs"
    q = deque([s])
    visit = [-1] * (f + 1)
    visit[s] = 0
    while q:
        now = q.popleft()
        if now == g:
            return visit[now]
        for next in ((now + u), (now - d)):
            if 1 <= next <= f:
                if visit[next] == -1:
                    q.append(next)
                    visit[next] = visit[now] + 1
    if visit[g] == -1:
        return "use the stairs"
f, s, g, u, d = map(int, input().split())
print(solution(f, s, g, u, d))