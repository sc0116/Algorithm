def solution(answers):
    answer = []
    count = [0] * 4
    check1 = [1, 2, 3, 4, 5]
    check2 = [2, 1, 2, 3, 2, 4, 2, 5]
    check3 = [3, 3, 1, 1, 2, 2, 4, 4, 5, 5]

    for a in range(len(answers)):
        if check1[a % len(check1)] == answers[a]:
            count[1] += 1
        if check2[a % len(check2)] == answers[a]:
            count[2] += 1
        if check3[a % len(check3)] == answers[a]:
            count[3] += 1

    for i in range(len(count)):
        if max(count) == count[i]:
            answer.append(i)

    return(answer)

#프로그래머스 제출 시 밑에 코드는 제외
#answers = [1, 2, 3, 4, 5]
answers = [1, 3, 2, 4, 2]
print(solution(answers))