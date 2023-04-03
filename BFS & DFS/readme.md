# 일방향 간선
## BFS (너비 우선 탐색)
- 큐 자료구조
- 탐색 `시작 노드를 큐에 삽입`하고 `방문처리`
- 위 과정을 수행할 수 없을 때까지 반복
- 최단거리 찾기에 유리

```python
# 함수를 사용할 때, graph에 노드 설정이 되어 있어야 한다.
def bfs(graph, start):
  from collections import deque

  queue = deque([start])  # 현재 위치
  visited = []            # 방문한 노드

  while queue:
    node = queue.popleft()
    # print(v, end=' ')

    if node not in visited:
      visited.append(node)  # 방문 처리
      queue.extend(graph[node])

  return visited
```

## DFS (깊이 우선 탐색)
- 스택 or 재귀 자료구조
- 탐색 `시작 노드를 스택에 삽입`하고 `방문처리`
- 최상단 노드에 방문하지 않은 인접 노드가 있다면, 해당 노드를 스택에 넣고 방문 처리
- 방문하지 않은 인접 노드가 없으면 스택에서 최상단 노드를 꺼냄
- 위 과정을 수행할 수 없을 때까지 반복

```python
# 함수를 사용할 때, graph에 노드 설정이 되어 있어야 한다.
# 스택 구현
def dfs(graph, start):
  stack = [start]   # 현재 위치
  visited = []      # 방문한 노드

  while stack:
    node = stack.pop()
    # print(v, end=' ')

    if node not in visited:
      visited.append(node)  # 방문 처리
      stack.extend(reversed(graph[node]))

  return visited
```

```python
# 함수를 사용할 때, graph에 노드 설정이 되어 있어야 한다.
# 재귀 구현
def dfs(graph, start, visited = []):
  visited.append(start)

  for node in graph[start]:
    if node not in visited:
      dfs(graph, node, visited)

  return visited
```

최종 코드

```python
from collections import deque

def bfs(graph, start):
     visited = []
     queue = deque([start])

     while queue:
          node = queue.popleft()

          if node not in visited:
               visited.append(node)
               queue.extend(graph[node])
     
     return visited

def dfs(graph, start):
     visited = []
     stack = [start]

     while stack:
          node = stack.pop()

          if node not in visited:
               visited.append(node)
               stack.extend(reversed(graph[node]))

     return visited
```
---

# 양방향 간선
## BFS (너비 우선 탐색)
```python
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
```

## DFS (깊이 우선 탐색)
```python
def dfs(graph, start, visited = []):
     visited.append(start)

     for i in range(N+1):
          if (graph[start][i]) and (i not in visited):
               dfs(graph, i, visited)

     return visited
```

최종 코드 (예제: 1260 DFS & BFS)
```python
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
```