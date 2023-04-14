N = int(input())
graph = [[] for _ in range(N+1)]
visited = [0 for _ in range(N+1)]
visited[1] = 1

for i in range(N-1):
    node1, node2 = map(int, input().split())
    graph[node1].append(node2)
    graph[node2].append(node1)

def dfs(start):
    for i in graph[start]:
        if visited[i] == 0:
            visited[i] = start
            dfs(i)

dfs(1)

for i in range(2, N+1):
     print(visited[i])