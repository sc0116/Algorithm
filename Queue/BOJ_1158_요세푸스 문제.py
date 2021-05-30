from collections import deque
n, k = map(int, input().split())
q = deque([i for i in range(1, n + 1)])
answer = []
while q:
    q.rotate(-k + 1)
    answer.append(str(q.popleft()))
print("<%s>" %(", ".join(answer)))