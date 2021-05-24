t = int(input())
for _ in range(t):
    n = input().rstrip() + ' '
    s = []
    for nn in n:
        if nn != ' ':
            s.append(nn)
        else:
            for ss in range(len(s)):
                print(s.pop(), end="")
            print('', end=' ')