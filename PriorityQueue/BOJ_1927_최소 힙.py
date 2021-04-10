import sys
import heapq

N = int(input())
heap = []

for _ in range(N):
    input = int(sys.stdin.readline())
    if input != 0:
        heapq.heappush(heap, input)
    else:
        if len(heap) == 0: print(0)
        else: print(heapq.heappop(heap))