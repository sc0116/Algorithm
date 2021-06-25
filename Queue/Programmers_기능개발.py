from collections import deque
def solution(progresses, speeds):
    answer = []
    p = deque(progresses)
    s = deque(speeds)
    while p:
        count = 0
        for i in range(len(p)):
            p[i] += s[i]
        while p[0] >= 100:
            p.popleft()
            s.popleft()
            count += 1
            if not p:
                break
        if count > 0:
            answer.append(count)
    return answer

#프로그래머스 제출 시 밑에 코드는 제외
progresses = [93, 30, 55]
speeds = [1, 30, 5]
#progresses = [95, 90, 99, 99, 80, 99]
#speeds = [1, 1, 1, 1, 1, 1]
print(solution(progresses, speeds))