def solution(participant, completion):
    h = {}
    for i in participant:
        if i in h: h[i] += 1
        else: h[i] = 0
    for i in completion:
        if i in h:
            if h[i] != 0: h[i] -= 1
            else: del h[i]
    return "".join(h)

#프로그래머스 제출 시 밑에 코드는 제외
participant = ["mislav", "stanko", "mislav", "ana"]
completion = ["stanko", "ana", "mislav"]
solution(participant, completion)