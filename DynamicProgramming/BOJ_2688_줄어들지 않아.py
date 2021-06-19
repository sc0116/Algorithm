import sys
t = int(input())
dp = [[0] * 10 for _ in range(65)]
for i in range(10):
    dp[1][i] = 1
for i in range(2, 65):
    for j in range(10):
        dp[i][j] = sum(dp[i-1][:j + 1])
for _ in range(t):
    n = int(sys.stdin.readline().rstrip())
    print(sum(dp[n]))