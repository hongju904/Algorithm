from collections import deque

T = int(input())

def dfs(start):
     visited[start] = 1
     node = arr[1][start]

     if visited[node-1] == 0:
          dfs(node-1)

for _ in range(T):
     N = int(input())
     arr = [[i for i in range(1,N+1)]]
     arr.append(list(map(int, input().split())))
     
     count = 0
     visited = [0 for _ in range(N)]

     for i in range(N):
          if visited[i] == 0:
               dfs(i)
               count += 1

     print(count)