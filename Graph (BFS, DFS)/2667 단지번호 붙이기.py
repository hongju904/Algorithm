N = int(input())
graph = [[] for _ in range(N)]

for i in range(N):
     tmp = input()
     for j in range(N):
          graph[i].append(tmp[j])

visited = [[0 for i in range(N)] for j in range(N)]
number = []

def dfs(i,j,result):
     visited[i][j] = 1
     result += 1

     if i<N-1 and visited[i+1][j] == 0 and graph[i+1][j] == '1':
          result = dfs(i+1, j, result)
     if j<N-1 and visited[i][j+1] == 0 and graph[i][j+1] == '1':
          result = dfs(i, j+1, result)
     if i>0 and visited[i-1][j] == 0 and graph[i-1][j] == '1':
          result = dfs(i-1, j, result)
     if j>0 and visited[i][j-1] == 0 and graph[i][j-1] == '1':
          result = dfs(i, j-1, result)

     return result

for i in range(N):
     for j in range(N):
          if visited[i][j] == 0 and graph[i][j] == '1':
               number.append(dfs(i,j,0))

          visited[i][j] = 1

number.sort()
print(len(number))
for i in number:
     print(i)