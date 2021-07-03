dp = [0, 1] + [0] * 89
n = int(input())
for i in range(2, n + 1):
    dp[i] = dp[i - 1] + dp[i - 2]
print(dp[n])