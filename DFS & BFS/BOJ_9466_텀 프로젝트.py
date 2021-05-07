import sys
def solution(start):
    s = {start}
    while s:
        n = s.pop()
        if start == arr[n]:
            return 1
        if not visit[n]:
            s.add(arr[n])
            visit[n] = True
    return 0
t = int(sys.stdin.readline())
for _ in range(t):
    n = int(input())
    arr = [0] + list(map(int, sys.stdin.readline().split()))
    count = n
    for i in range(1, n + 1):
        visit = [True] + [False] * n
        if arr[i - 1] == i:
            count -= 1
        else: count -= solution(i)
    print(count)