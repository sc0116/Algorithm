import sys

t = int(input())

for tt in range(t):
    n = int(input())
    score = [list(map(int, sys.stdin.readline().split())) for _ in range(n)]
    score.sort(key=lambda x: x[0])
    result = 1
    check = score[0][1]
    for i in range(1, n):
        if check > score[i][1]:
            check = score[i][1]
            result += 1
    print(result)