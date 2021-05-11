import sys
n, m = map(int, input().split())
h = {}
count = 0
for _ in range(n):
    p = sys.stdin.readline().strip()
    count += 1
    h[p] = count
reverse_h = dict(map(reversed, h.items()))
for _ in range(m):
    i = sys.stdin.readline().strip()
    if i in h:
        print(h[i])
    elif int(i) in reverse_h:
        print(reverse_h[int(i)])