import sys
t = int(input())
for _ in range(t):
    h = {}
    n = int(input())
    note1 = list(map(int, sys.stdin.readline().split()))
    for n1 in note1:
        h[n1] = 1
    m = int(input())
    note2 = list(map(int, sys.stdin.readline().split()))
    for n2 in note2:
        if n2 in h:
            print(1)
        else:
            print(0)