n = int(input())
d = list(map(int, input().split()))
o = list(map(int, input().split()))
cost = d[0] * o[0]
temp = o[0]

for i in range(1, len(d)):
    if temp > o[i]:
        temp = o[i]
    cost += temp * d[i]
print(cost)