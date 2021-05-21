import sys
h = {}
size = 0
while True:
    tree = sys.stdin.readline().rstrip()
    if not tree:
        break
    elif tree in h:
        h[tree] += 1
    else:
        h[tree] = 1
    size += 1
for hh in sorted(h.keys()):
    print('{0} {1:0.4f}'.format(hh, h[hh] * 100 / size))