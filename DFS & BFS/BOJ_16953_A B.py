from collections import deque
def solution(a, b):
    q = deque([[a, 1]])
    minNum = 10001
    while q:
        n, c = q.popleft()
        if n == b:
            minNum = min(minNum, c)
        for i in (n * 2, n * 10 + 1):
            if i <= b:
                q.append([i, c + 1])
    if minNum == 10001:
        return -1
    else:
        return minNum
a, b = map(int, input().split())
print(solution(a, b))