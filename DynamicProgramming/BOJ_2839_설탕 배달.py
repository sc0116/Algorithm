kg = [3, 5]
n = int(input())
dp = [10001] * (n + 1)

dp[0] = 0
for i in kg:
    for j in range(i, n + 1):
        if j % i == 0 or dp[j - i] != 10001:
            dp[j] = min(dp[j], dp[j - i] + 1)
if dp[n] != 10001: print(dp[n])
else: print(-1)