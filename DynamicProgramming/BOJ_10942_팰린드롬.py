import sys

n = int(sys.stdin.readline())
num = list(map(int, sys.stdin.readline().split()))
dp = [[0] * n for _ in range(n)]

for e in range(n):
    for s in range(e + 1):
        if s == e:
            dp[s][e] = 1
        elif s + 1 == e:
            if num[s] == num[e]:
                dp[s][e] = 1
        else:
            if num[s] == num[e] and dp[s + 1][e - 1]:
                dp[s][e] = 1

m = int(sys.stdin.readline())
for _ in range(m):
    s, e = map(int, sys.stdin.readline().split())
    print(dp[s - 1][e - 1])