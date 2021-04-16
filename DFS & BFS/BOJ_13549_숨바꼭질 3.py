from collections import deque

def bfs(n, k):
    q = deque([n])
    visit = [-1] * 100001
    visit[n] = 0
    while q:
        way = q.popleft()
        if way == k:
            return visit[way]
        else:
            if 0 <= way * 2 <= 100000 and visit[way * 2] == -1:
                q.append(way * 2)
                visit[way * 2] = visit[way]
            for i in (way - 1, way + 1):
                if 0 <= i <= 100000 and visit[i] == -1:
                    q.append(i)
                    visit[i] = visit[way] + 1

n, k = map(int, input().split())
print(bfs(n, k))