Input = input().split()

A = Input[0]
P = int(Input[1])
num = [int(A)]

while True:
     tmp = 0
     for i in range(len(A)):
          tmp += int(A[i]) ** P
     
     if tmp in num:
          print(num.index(tmp))
          break
     else:
          num.append(tmp)
          A = str(tmp)