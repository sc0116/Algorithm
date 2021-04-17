import heapq
import sys

heap = []

for _ in range(int(input())):
    i = int(sys.stdin.readline())
    if i != 0:
        heapq.heappush(heap, (abs(i), i))
    else:
        if len(heap):
            print(heapq.heappop(heap)[1])
        else: print(0)