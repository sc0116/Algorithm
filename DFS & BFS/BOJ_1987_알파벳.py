import sys
def solution(r, c):
    q = {(0, 0, graph[0][0])}
    count = 1
    while q:
        x, y, word = q.pop()
        for d in range(4):
            if x + dx[d] <= -1 or x + dx[d] >= r or y + dy[d] <= -1 or y + dy[d] >= c:
                continue
            elif graph[x + dx[d]][y + dy[d]] not in word:
                q.add((x + dx[d], y + dy[d], word + graph[x + dx[d]][y + dy[d]]))
                count = max(count, len(word) + 1)
    return count
dx = [1, 0, -1, 0]
dy = [0, 1, 0, -1]
r, c = map(int, sys.stdin.readline().split())
graph = [list(sys.stdin.readline()) for _ in range(r)]
print(solution(r, c))