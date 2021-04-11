import sys

def solution():
    count = 1
    h = stack.pop()
    while(len(stack) != 0):
        if stack[-1] > h:
            h = stack[-1]
            count += 1
        stack.pop()
    return count

N = int(input())
stack = []

for _ in range(N):
    stack.append(int(sys.stdin.readline()))

print(solution())