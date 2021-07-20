from collections import deque

def solution():
    visit = [[False] * n for _ in range(n)]
    answer = False
    for i in range(n):
        for j in range(n):
            if not visit[i][j]:
                q = deque([[i, j]])
                country = set()

                while q:
                    r, c = q.popleft()
                    for rr, cc in ((r + 1, c), (r, c + 1), (r - 1, c), (r, c - 1)):
                        if 0 <= rr < n and 0 <= cc < n:
                            check = abs(land[r][c] - land[rr][cc])
                            if L <= check <= R and not visit[rr][cc]:
                                q.append([rr, cc])
                                visit[rr][cc] = True
                                country.add((rr, cc))

                if len(country):
                    num = sum(land[r][c] for r, c in country) // len(country)
                    for r, c in country:
                        land[r][c] = num
                    answer = True
    return answer

n, L, R = map(int, input().split())
land = [list(map(int, input().split())) for _ in range(n)]
result = 0

while True:
    if solution():
        result += 1
    else:
        break
print(result)