from collections import deque
def solution(i, j):
    q = deque([[i, j, graph[i][j]]])
    while q:
        r, c, digit = q.popleft()
        if len(digit) == 6 and digit not in result:
            result.append(digit)
        for (rr, cc) in ((r + 1, c), (r, c + 1), (r - 1, c), (r, c - 1)):
            if 0 <= rr < 5 and 0 <= cc < 5 and len(digit) < 6:
                q.append([rr, cc, digit + graph[rr][cc]])
graph = [list(map(str, input().split())) for _ in range(5)]
result = []
for i in range(5):
    for j in range(5):
        solution(i, j)
print(len(result))