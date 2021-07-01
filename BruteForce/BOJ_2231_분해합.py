n = int(input())
for i in range(1, 1000001):
    index = i
    sum = i
    while index:
        sum += index % 10
        index = int(index / 10)
    if sum == n:
        print(i)
        exit()
print(0)