import sys
t = int(sys.stdin.readline())
for tt in range(t):
    n = int(sys.stdin.readline())
    coinArr = list(map(int, sys.stdin.readline().split()))
    m = int(sys.stdin.readline())
    dp = [1] + [0] * m
    for coin in coinArr:
        for mm in range(coin, m + 1):
            dp[mm] += dp[mm - coin]
    print(dp[m])