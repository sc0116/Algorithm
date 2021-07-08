n = int(input())
atm = sorted(list(map(int, input().split())))
result = 0
for i in range(n):
    result += atm[i] * (n - i)
print(result)