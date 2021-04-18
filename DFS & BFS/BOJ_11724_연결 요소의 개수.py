import sys

def dfs(n, graph):
    stack = []
    count = 0
    visit = [False] * (n)
    for v in range(1, n):
        if not visit[v]:
            count += 1
            stack.append(v)
            visit[v] = True

            while stack:
                now = stack.pop()
                for next in range(1, n):
                    if (not visit[next]) and graph[now][next] == 1:
                        stack.append(next)
                        visit[next] = True
    return count

n, m = map(int, sys.stdin.readline().split())
graph = [[0] * (n + 1) for _ in range(n + 1)]

for _ in range(m):
    i, j = map(int, sys.stdin.readline().split())
    graph[i][j] = graph[j][i] = 1

print(dfs(len(graph), graph))