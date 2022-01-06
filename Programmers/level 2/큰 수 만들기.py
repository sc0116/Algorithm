def solution(number, k):
    answer = []
    for n in number:
        while answer and answer[-1] < n and k > 0:
            answer.pop()
            k -= 1
        answer.append(n)
    return "".join(answer[:len(answer) - k])

#프로그래머스 제출 시 밑에 코드는 제외
arr = [['1924', 2],
       ['1231234', 3],
       ['4177252841', 4]]
for a in arr:
    print(solution(a[0], a[1]))