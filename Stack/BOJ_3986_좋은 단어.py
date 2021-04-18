word = [list(input()) for _ in range(int(input()))]
count = 0
for str in word:
    stack = []
    for i in str:
        if (not len(stack)) or stack[-1] != i: stack.append(i)
        elif stack[-1] == i: stack.pop()
    if not len(stack): count += 1
print(count)