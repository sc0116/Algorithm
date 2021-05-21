from collections import deque
def solution(i, r1, c1, r2, c2):
    visit = [[False] * i for _ in range(i)]
    q = deque([[r1, c1, 0]])
    visit[r1][c1] = True
    result = 9999
    while q:
        r, c, count = q.popleft()
        if r == r2 and c == c2:
            result = min(result, count)
        for (rr, cc) in ((r - 1, c + 2), (r - 2, c + 1), (r - 2, c - 1), (r - 1, c - 2), (r + 1, c - 2), (r + 2, c - 1), (r + 2, c + 1), (r + 1, c + 2)):
            if 0 > rr or rr >= i or 0 > cc or cc >= i:
                continue
            elif not visit[rr][cc]:
                q.append([rr, cc, count + 1])
                visit[rr][cc] = True
    return result
t = int(input())
for _ in range(t):
    i = int(input())
    r1, c1 = map(int, input().split())
    r2, c2 = map(int, input().split())
    print(solution(i, r1, c1, r2, c2))