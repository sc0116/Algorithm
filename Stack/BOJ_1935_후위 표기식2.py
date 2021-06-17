n = int(input())
postfix = list(input())
arr = [int(input()) for _ in range(n)]
s = []
for p in postfix:
    if p in "+-*/":
        a = s.pop()
        b = s.pop()
        if p == "+":
            s.append(b + a)
        elif p == "-":
            s.append(b - a)
        elif p == "*":
            s.append(b * a)
        elif p == "/":
            s.append(b / a)
    else:
        s.append(arr[ord(p) - ord('A')])
print("%.2f" % (s[0]))