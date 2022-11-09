# BFS (너비 우선 탐색)
- 큐 자료구조
- 탐색 `시작 노드를 큐에 삽입`하고 `방문처리`
- 위 과정을 수행할 수 없을 때까지 반복
- 최단거리 찾기에 유리

```python
# 함수를 사용할 때, graph에 노드 설정이 되어 있어야 한다.
def bfs(graph, start):
  from collections import deque

  Q = deque([start])  # 현재 위치
  visited = [start]   # 방문한 노드

  while Q:
    v = Q.popleft()
    print(v, end=' ')
  
    for i in graph[v]:
      if i not in visited:
        Q.append(i)
        visited.append(i)
```

---

# DFS (깊이 우선 탐색)
- 스택 or 재귀 자료구조
- 탐색 `시작 노드를 스택에 삽입`하고 `방문처리`
- 최상단 노드에 방문하지 않은 인접 노드가 있다면, 해당 노드를 스택에 넣고 방문 처리
- 방문하지 않은 인접 노드가 없으면 스택에서 최상단 노드를 꺼냄
- 위 과정을 수행할 수 없을 때까지 반복

```python
# 함수를 사용할 때, graph에 노드 설정이 되어 있어야 한다.
def dfs(graph, v, visited):
  visited.append(v)       # 방문 처리
  print(v, end=' ')
  
  for i in graph[v]:
    if i not in visited:  # 방문하지 않은 노드가 있다면 방문
      dfs(graph, i, visited)
```
