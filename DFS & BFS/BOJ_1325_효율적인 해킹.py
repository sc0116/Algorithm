import sys
from collections import deque
def solution(start):
    global max
    visit = [0] * len(graph)
    q = deque([start])
    while q:
        now = q.popleft()
        if visit[now] == 0:
            visit[now] = 1
            for next in graph[now]:
                if visit[next] == 0: q.append(next)
    if max == visit.count(1): answer.append(start + 1)
    elif max < visit.count(1):
        max = visit.count(1)
        answer.clear()
        answer.append(start + 1)
n, m = map(int, sys.stdin.readline().split())
graph = [[] for _ in range(n)]
answer, max = [], 0
for _ in range(m):
    i, j = map(int, sys.stdin.readline().split())
    graph[j - 1].append(i - 1)
for start in range(n): solution(start)
for ans in answer: print(ans, end=' ')