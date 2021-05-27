def solution(n):
    if n == 1:
        return 1 % 1000000007
    elif n == 2:
        return 2 % 1000000007
    else:
        dp = [0, 1, 2] + [0] * (n - 2)
        for i in range(3, n + 1):
            dp[i] = (dp[i - 1] + dp[i - 2]) % 1000000007
        return dp[n]

# 프로그래머스 제출 시 밑에 코드는 제외
n = int(input())
print(solution(n))