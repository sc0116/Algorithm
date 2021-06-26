import sys
arr = [int(sys.stdin.readline()) for _ in range(9)]
arr.sort()
for a in range(9):
    for b in range(a, 9):
        if sum(arr) - (arr[a] + arr[b]) == 100:
            for i in range(9):
                if i == a or i == b:
                    continue
                print(arr[i])
            exit()