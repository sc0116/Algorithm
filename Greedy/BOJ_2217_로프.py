n = int(input())
rope = sorted([int(input()) for _ in range(n)], reverse=True)
result = 0

for i in range(n):
    result = max(result, rope[i] * (i + 1))

print(result)