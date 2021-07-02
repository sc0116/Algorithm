dp = [[0] * 30 for _ in range(30)]
for i in range(1, 30):
    dp[1][i] = i
for i in range(2, 30):
    for j in range(1, 30):
        dp[i][j] = sum(dp[i - 1][:j])
t = int(input())
for _ in range(t):
    n, m = map(int, input().split())
    print(dp[n][m])