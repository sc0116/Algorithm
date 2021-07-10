coin = [500, 100, 50, 10, 5, 1]
n = 1000 - int(input())
count = 0

for c in coin:
    if n == 0:
        break
    if n < c:
        continue
    count += n // c
    n %= c

print(count)