N = input()

num = [0 for _ in range(len(N))]
for i in range(len(N)):
    num[i] = (int)(N[i])

if (sum(num) % 3) != 0:
     print(-1)
else:
     num.sort(reverse=True)
     if num[-1] != 0:
          print(-1)
     else:
          for i in num:
               print(i, end="")