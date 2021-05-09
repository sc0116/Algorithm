import sys
n = int(input())
h = {}
for _ in range(n):
    b = sys.stdin.readline()
    if b in h: h[b] += 1
    else: h[b] = 1
h = sorted(h.items(), key=lambda x: (-x[1], x[0]))
print(h[0][0])