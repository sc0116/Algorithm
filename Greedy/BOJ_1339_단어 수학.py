n = int(input())
alphabet = [0] * 26
word = []
result = 0

for nn in range(n):
    word.append(input())

for w in word:
    count = len(w) - 1
    for c in w:
        alphabet[ord(c) - ord('A')] += pow(10, count)
        count -= 1

count = 9
for i in sorted(alphabet, reverse=True)[:10]:
    result += count * i
    count -= 1
print(result)