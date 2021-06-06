import sys
n = int(input())
arr = [0] * (n + 1)
for i in range(1, n + 1):
    arr[i] = int(sys.stdin.readline())
if n == 1:
    print(arr[1])
elif n == 2:
    print(arr[1] + arr[2])
else:
    dp = [0, arr[1], arr[1] + arr[2]] + [0] * (n - 2)
    for i in range(3, n + 1):
        dp[i] = max(dp[i - 2] + arr[i], dp[i - 3] + arr[i - 1] + arr[i])
    print(dp[n])