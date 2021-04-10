import sys  
import heapq

N = int(input())
sum = 0
heap = []

for _ in range(N):
    heapq.heappush(heap, int(sys.stdin.readline()))

while len(heap) > 1:
    first = heapq.heappop(heap) 
    second = heapq.heappop(heap)   
    sum += first + second
    heapq.heappush(heap, first + second)

print(sum)