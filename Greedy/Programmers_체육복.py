def solution(n, los, reserv):
    lost = set(los) - set(reserv)
    reserve = set(reserv) - set(los)
    for r in reserve:
        if r - 1 in lost:
            lost.remove(r - 1)
        elif r + 1 in lost:
            lost.remove(r + 1)
    return n - len(lost)

#프로그래머스 제출 시 밑에 코드는 제외
arr = [[5, [2, 4], [1, 3, 5]],
       [5, [2, 4], [3]],
       [3, [3], [1]]]
for a in arr:
    print('solution', a)
    print(solution(a[0], a[1], a[2]))