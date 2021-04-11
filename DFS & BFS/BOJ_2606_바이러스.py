def dfs(v):
    visited[v] = True
    for i in range(1, len(network)):
        if (not visited[i]) and network[v][i] == 1:
            dfs(i)

c = int(input())
n = int(input())
network = [[0] * (c + 1) for _ in range(c + 1)]
visited = [False] * (c + 1)

for _ in range(n):
    x, y = map(int, input().split())
    network[x][y] = 1
    network[y][x] = 1
dfs(1)

count = 0
for i in range(2, c + 1):
    if visited[i]:
        count += 1
print(count)