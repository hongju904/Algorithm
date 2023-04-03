# 양방향 node, bfs
from collections import deque

N = int(input())
M = int(input())

graph = [[0]*(N+1) for _ in range(N+1)]
for i in range(M):
     node1, node2 = map(int, input().split())
     graph[node1][node2] = graph[node2][node1] = 1

def dfs(start, visited=[]):
     visited.append(start)

     for i in range(1, N+1):
          if (graph[start][i]) and (i not in visited):
               dfs(i, visited)
     
     return visited
          
print(len(dfs(1))-1)
# 자기자신 제외