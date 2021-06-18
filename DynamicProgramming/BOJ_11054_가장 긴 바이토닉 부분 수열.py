n = int(input())
arr = list(map(int, input().split()))
increase = [1] * n
decrease = [0] * n
result = 0
for now in range(n):
    for i in range(now):
        if arr[i] < arr[now]:
            increase[now] = max(increase[now], increase[i] + 1)
for now in range(n - 1, -1, -1):
    for d in range(n - 1, now, -1):
        if arr[now] > arr[d]:
            decrease[now] = max(decrease[now], decrease[d] + 1)
for now in range(n):
    result = max(result, increase[now] + decrease[now])
print(result)