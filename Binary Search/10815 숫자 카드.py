N = int(input())
N2 = list(map(int, input().split()))
# 갖고 있는 숫자

M = int(input())
M2 = list(map(int, input().split()))
# 판별할 숫자

N2.sort()
maxN = N2[-1]
minN = N2[0]
mid = N//2
midN = N2[mid]

for i in range(M):
     right = N-1
     left = 0

     while left <= right:
          mid = (left+right)//2
          if N2[mid] < M2[i]:
               left = mid + 1
          elif N2[mid] > M2[i]:
               right = mid - 1
          else:
               print(1, end=" ")
               break

     if left > right:
          print(0, end=" ")