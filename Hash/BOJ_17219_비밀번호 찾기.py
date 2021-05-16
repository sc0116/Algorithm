import sys
h = {}
n, m = map(int, input().split())
for _ in range(n):
    i, p = sys.stdin.readline().rstrip().split()
    h[i] = p
for _ in range(m):
    mm = sys.stdin.readline().rstrip()
    print(h[mm])