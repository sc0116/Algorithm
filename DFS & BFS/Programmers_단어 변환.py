from collections import deque

def solution(begin, target, words):
    if target not in words:
        return 0
    q = deque([[begin, 0]])
    visit = [False] * (len(words))

    while q:
        now, count = q.popleft()
        if now == target:
            return count

        for next in words:
            check = 0
            for i in range(len(next)):
                if not next[i].count(now[i]):
                    if check > 1:
                        break
                    check += 1
            for i in range(len(words)):
                if words[i] == next:
                    if check == 1 and not visit[i]:
                        q.append([next, count + 1])
                        visit[i] = True
    return 0

#프로그래머스 제출 시 밑에 코드는 제외
begin = "hit"
target = "cog"
words = ["hot", "dot", "dog", "lot", "log", "cog"]

print(solution(begin, target, words))