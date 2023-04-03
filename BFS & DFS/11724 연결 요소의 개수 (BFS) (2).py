# 연결 요소의 개수이므로 깊이 우선 탐색

N, M = map(int, input().split())
graph = [[0]*(N+1) for _ in range(N+1)]

for i in range(M):
     node1, node2 = map(int, input().split())
     graph[node1][node2] = graph[node2][node1] = 1

visited = [0 for _ in range(N+1)]

def dfs(v):
     visited[v] = 1
     for j in range(1, N+1):
          if (graph[v][j]) and (visited[j] == 0):
               dfs(j)

result = 0

for i in range(1,N+1):
     if visited[i] == 0:
          dfs(i)
          result += 1

print(result)