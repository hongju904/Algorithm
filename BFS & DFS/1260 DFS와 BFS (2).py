from collections import deque

N, M, V = map(int, input().split())
graph = [[0]*(N+1) for _ in range(N+1)]

for i in range(M):
     node1, node2 = map(int, input().split())
     graph[node1][node2] = True
     graph[node2][node1] = True

def bfs(graph, start):
     visited = [start]
     queue = deque([start])

     while queue:
          node = queue.popleft()

          for i in range(N+1):
               if (graph[node][i]) and (i not in visited):
                    visited.append(i)
                    queue.append(i)

     return visited

def dfs(graph, start, visited = []):
     visited.append(start)

     for i in range(N+1):
          if (graph[start][i]) and (i not in visited):
               dfs(graph, i, visited)

     return visited

print(" ".join(map(str,dfs(graph, V))))
print(" ".join(map(str, bfs(graph, V))))