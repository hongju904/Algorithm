N = int(input())
request = list(map(int, input().split()))
M = int(input())

if sum(request) <= M:
     print(max(request))

else:
     request.sort()
     
     left = M//N
     right = request[-1]

     while left <= right:
          mid = (left+right)//2
          Sum = M

          for i in request:
               if i < mid:
                    Sum -= i
               else:
                    Sum -= mid

          if Sum >= 0:
               result = mid
               left = mid + 1
          else:
               right = mid - 1

     print(result)