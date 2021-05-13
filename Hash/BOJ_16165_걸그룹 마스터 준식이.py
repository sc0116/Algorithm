import sys
h = {}
n, m = map(int, input().split())
for _ in range(n):
    t = sys.stdin.readline().rstrip()
    p = int(sys.stdin.readline())
    g = [sys.stdin.readline().rstrip() for _ in range(p)]
    g.sort()
    h[t] = g
for _ in range(m):
    i = sys.stdin.readline().rstrip()
    j = int(sys.stdin.readline())
    if j == 0:
        for hh in h[i]:
            print(hh)
    elif j == 1:
        for hh in h:
            if i in h[hh]:
                print(hh)