s = int(input())
i = 1
count = 0

while True:
    s -= i

    if s >= 0:
        count += 1
        i += 1
    else:
        break

print(count)