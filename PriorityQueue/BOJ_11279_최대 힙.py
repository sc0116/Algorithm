import heapq
import sys

heap = []

for _ in range(int(input())):
    i = int(sys.stdin.readline())
    if i:
        heapq.heappush(heap, (-i ,i))
    else:
        if not len(heap): print(0)
        else: print(heapq.heappop(heap)[1])