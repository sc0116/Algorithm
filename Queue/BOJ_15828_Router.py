import sys
from collections import deque
n = int(input())
q = deque()
while 1:
    p = int(sys.stdin.readline().rstrip())
    if p == -1:
        break
    elif p == 0:
        q.popleft()
    else:
        if len(q) < n:
            q.append(p)
if not len(q):
    print('empty')
else:
    while q:
        print(q.popleft(), end=' ')