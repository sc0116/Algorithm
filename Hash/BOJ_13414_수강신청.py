import sys
h = {}
k, ll = map(int, input().split())
for i in range(ll):
    n = sys.stdin.readline().strip()
    h[n] = i
h = sorted(h.items(), key=lambda x: x[1])[0:k]
for i in range(len(h)):
    if i == len(h) - 1:
        print(h[i][0], end="")
    else:
        print(h[i][0])