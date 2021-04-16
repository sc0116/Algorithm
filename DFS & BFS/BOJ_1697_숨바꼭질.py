from collections import deque

def bfs(n, k):
    queue = deque([n])
    visit = [-1] * 100001
    visit[n] = 0
    while queue:
        way = queue.popleft()
        if way == k:
            return visit[way]
        else:
            for i in (way - 1, way + 1, way * 2):
                if 0 <= i <= 100000 and visit[i] == -1:
                    queue.append(i)
                    visit[i] = visit[way] + 1

n, k = map(int, input().split())
print(bfs(n, k))