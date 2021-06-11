import sys
n = int(input())
arr = [list(map(int, sys.stdin.readline().split())) for _ in range(n)]
dp = [0] * (n + 1)
temp = 0
for i in range(n):
    temp = max(temp, dp[i])
    if 0 <= i + arr[i][0] <= n:
        dp[i + arr[i][0]] = max(temp + arr[i][1], dp[i + arr[i][0]])
print(max(dp))