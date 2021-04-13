from collections import deque

def solution(n, computers):
    answer = 0
    visit = [False] * n
    for i in range(n):
        if not visit[i]:
            answer += 1
            queue = deque([i])
            visit[i] = True

            while queue:
                v = queue.popleft()
                for j in range(n):
                    if (not visit[j]) and computers[v][j] == 1:
                        queue.append(j)
                        visit[j] = True
    return answer

#프로그래머스 제출 시 밑에 코드는 제외
network = [list(map(int, input().split())) for _ in range(int(input()))]
print(solution(len(network), network))
