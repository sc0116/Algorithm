n, m = map(int, input().split())
card = list(map(int, input().split()))
max = 0
for a in range(n):
    for b in range(a + 1, n):
        for c in range(b + 1, n):
            sum = card[a] + card[b] + card[c]
            if max < sum and sum <= m:
                max = sum
print(max)