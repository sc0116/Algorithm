import sys

n = int(input())
case = [sys.stdin.readline().split() for _ in range(n)]
for i in range(n):
    print(f"Case #{i + 1}:", end=' ')
    while len(case[i]):
        print(case[i].pop(), end=' ')
    print()