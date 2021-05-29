from collections import deque
def solution(n, k):
    minimum = 0
    result = 0
    answer = False
    q = deque([[n, 0]])
    visit[n] = True
    while q:
        now, count = q.popleft()
        visit[now] = True
        if answer and count > minimum:
            break
        if now == k:
            if not answer:
                minimum = count
                answer = True
            result += 1
        for next in (now - 1, now + 1, now * 2):
            if 0 <= next <= 100000 and not visit[next]:
                q.append([next, count + 1])
    print(minimum)
    print(result)
n, k = map(int, input().split())
visit = [False] * 100001
solution(n, k)