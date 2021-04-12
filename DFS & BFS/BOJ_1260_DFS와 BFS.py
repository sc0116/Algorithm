from collections import deque

def dfs(graph, v):
    dfs_visit[v] = True
    print(v, end=' ')
    for i in range(1, len(graph)):
        if (not dfs_visit[i]) and graph[v][i] == 1:
            dfs(graph, i)

def bfs(graph, start):
    queue = deque([start])
    bfs_visit[start] = True
    while queue:
        v = queue.popleft()
        print(v, end=' ')
        for i in range(1, len(graph)):
            if (not bfs_visit[i]) and graph[v][i] == 1:
                queue.append(i)
                bfs_visit[i] = True

N, M, V = map(int, input().split())
graph = [[0] * (N + 1) for _ in range(N + 1)]
dfs_visit = [False] * (N + 1)
bfs_visit = [False] * (N + 1)

for _ in range(M):
    row, col = map(int, input().split())
    graph[row][col] = graph[col][row] = 1

dfs(graph, V)
print()
bfs(graph, V)