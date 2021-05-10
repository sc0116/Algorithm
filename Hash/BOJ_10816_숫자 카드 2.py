import sys
h = {}
n = int(input())
nArr = list(map(int, sys.stdin.readline().split()))
for nn in nArr:
    if nn in h:
        h[nn] += 1
    else:
        h[nn] = 1
m = int(input())
mArr = list(map(int, sys.stdin.readline().split()))
for mm in mArr:
    if mm in h:
        print(h[mm], end=" ")
    else:
        print(0, end=" ")