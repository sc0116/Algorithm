n, k = map(int, input().split())
coin = [int(input()) for _ in range(n)]
result = 0
for c in range(n - 1, -1, -1):
    if k == 0:
        break
    if coin[c] > k:
        continue
    result += k // coin[c]
    k %= coin[c]
print(result)