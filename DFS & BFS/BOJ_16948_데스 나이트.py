from collections import deque
def solution(n, r1, c1, r2, c2):
    q = deque([[r1, c1, 0]])
    visit[r1][c1] = True
    result = 9999
    while q:
        r, c, count = q.popleft()
        if r == r2 and c == c2:
            result = min(result, count)
        for (rr, cc) in ((r - 2, c - 1), (r - 2, c + 1), (r, c - 2), (r, c + 2), (r + 2, c - 1), (r + 2, c + 1)):
            if 0 > rr or rr >= n or 0 > cc or cc >= n:
                continue
            elif not visit[rr][cc]:
                q.append([rr, cc, count + 1])
                visit[rr][cc] = True
    if result == 9999:
        return -1
    else:
        return result
n = int(input())
visit = [[False] * n for _ in range(n)]
r1, c1, r2, c2 = map(int, input().split())
print(solution(n, r1, c1, r2, c2))