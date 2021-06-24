import sys
t = int(input())
dp = [0, 1, 1, 1] + [0] * 97
for i in range(4, 101):
    dp[i] = dp[i - 2] + dp[i - 3]
for _ in range(t):
    n = int(sys.stdin.readline().rstrip())
    print(dp[n])