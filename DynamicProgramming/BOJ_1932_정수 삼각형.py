n = int(input())
triangle = []
for _ in range(n):
    triangle.append(list(map(int, input().split())))
dp = []
for i in range(1, n + 1):
    dp.append([0] * i)
dp[0][0] = triangle[0][0]
result = 0
for i in range(n):
    for j in range(len(triangle[i])):
        if i == n - 1:
            result = max(result, dp[i][j])
        else:
            for (ii, jj) in ((i + 1, j), (i + 1, j + 1)):
                if 0 <= ii < n and 0 <= jj < n:
                    dp[ii][jj] = max(dp[ii][jj], dp[i][j] + triangle[ii][jj])
print(result)