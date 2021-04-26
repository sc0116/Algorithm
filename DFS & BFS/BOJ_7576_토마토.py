from collections import deque
import sys
def solution(n, m):
    answer = -1
    while q:
        for _ in range(len(q)):
            nn, mm = q.popleft()
            for dn, dm in ([1, 0], [0, -1], [-1, 0], [0, 1]):
                dnn, dmm = nn + dn, mm + dm
                if dnn <= -1 or dnn >= n or dmm <= -1 or dmm >= m:
                    continue
                elif tomato[dnn][dmm] == 0:
                    q.append([dnn, dmm])
                    tomato[dnn][dmm] = 1
        answer += 1
    for i in tomato:
        if 0 in i:
            return -1
    return answer
m, n = map(int, sys.stdin.readline().split())
tomato = [list(map(int, sys.stdin.readline().split())) for _ in range(n)]
q = deque([])
for i in range(n):
    for j in range(m):
        if tomato[i][j] == 1:
            q.append([i, j])
print(solution(n, m))