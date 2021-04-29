import sys
n = int(input())
arr = list(map(int, sys.stdin.readline().split()))
dp = [1] * n
for i in range(n):
    for j in range(i):
        if arr[i] < arr[j]:
            dp[i] = max(dp[i], dp[j] + 1)
print(n - max(dp))