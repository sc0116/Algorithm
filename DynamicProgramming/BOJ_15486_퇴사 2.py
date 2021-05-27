import sys
n = int(input())
tp = [list(map(int, sys.stdin.readline().split())) for _ in range(n)]
dp = [0] * (n + 1)
answer = 0
for i in range(n):
    answer = max(answer, dp[i])
    if i + tp[i][0] > n:
        continue
    dp[i + tp[i][0]] = max(answer + tp[i][1], dp[i + tp[i][0]])
print(max(dp))