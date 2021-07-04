import sys
N = int(input())
card = [0] + list(map(int, sys.stdin.readline().split()))
dp = [0] * (N + 1)
for n in range(1, N + 1):
    for i in range(n, N + 1):
        if i % n == 0 or i - n != 0:
            dp[i] = max(dp[i], dp[i - n] + card[n])
print(dp[N])