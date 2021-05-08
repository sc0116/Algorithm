import sys
n = int(input())
s = {}
for _ in range(n):
    e, l = sys.stdin.readline().split()
    if l == 'enter': s[e] = 1
    else: del s[e]
s = sorted(s.keys(), reverse=True)
for k in s: print(k)