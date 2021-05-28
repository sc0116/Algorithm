import sys
t = int(input())
n = []
for tt in range(t):
    n.append(int(sys.stdin.readline()))
dp = [0, 1, 2, 4] + [0] * (max(n) - 3)
if max(n) > 3:
    for i in range(4, max(n) + 1):
        dp[i] = (dp[i - 3] + dp[i - 2] + dp[i - 1]) % 1000000009
for nn in n:
    print(dp[nn])