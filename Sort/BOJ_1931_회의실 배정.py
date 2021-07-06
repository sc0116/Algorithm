n = int(input())
room = []
for i in range(n):
    room.append(list(map(int, input().split())))
room.sort(key=lambda x: (x[1], x[0]))
check = 0
result = 0
for (start, end) in room:
    if check <= start:
        result += 1
        check = end
print(result)