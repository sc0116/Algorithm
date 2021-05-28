n = int(input())
if n == 1:
    print(1 % 10007)
else:
    dp = [0, 1] + [0] * (n - 1)
    for i in range(2, n + 1):
        if i % 2 == 0:
            dp[i] = (dp[i - 1] * 2 + 1) % 10007
        else:
            dp[i] = (dp[i - 1] * 2 - 1) % 10007
    print(dp[n])