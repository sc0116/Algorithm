from collections import deque
def solution(n, k):
    q = deque([n])
    while q:
        now = q.popleft()
        if now == k:
            return visit[now][0]
        for next in (now - 1, now + 1, now * 2):
            if 0 <= next <= 100000 and not visit[next][0]:
                q.append(next)
                visit[next][0] = visit[now][0] + 1
                visit[next][1] = now
n, k = map(int, input().split())
visit = [[0, 0] for _ in range(100001)]
print(solution(n, k))
answer = [k]
while k != n:
    k = visit[k][1]
    answer.append(k)
print(*answer[::-1])