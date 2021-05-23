import sys
n, k = map(int, input().split())
arr = [[] for _ in range(n + 1)]
for nn in range(1, n + 1):
    w, v = map(int , sys.stdin.readline().split())
    arr[nn].append(w)
    arr[nn].append(v)
dp = [[0] * (k + 1) for _ in range(n + 1)]
for nn in range(1, n + 1):
    for kk in range(1, k + 1):
        if kk < arr[nn][0]:
            dp[nn][kk] = dp[nn - 1][kk]
        else:
            dp[nn][kk] = max(arr[nn][1] + dp[nn - 1][kk - arr[nn][0]], dp[nn - 1][kk])
print(dp[n][k])