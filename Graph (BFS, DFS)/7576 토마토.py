from collections import deque

M, N = map(int, input().split())
tomato = [[0 for _ in range(M)] for _ in range(N)]

for i in range(N):
    tomato[i] = list(map(int, input().split()))

queue = deque()

for i in range(N):
        for j in range(M):
            if tomato[i][j] == 1:
                 queue.append([i, j])

days = -1

while queue:
    days += 1
    for _ in range(len(queue)):
          node = queue.popleft()
          i, j = node[0], node[1]

          if i>0 and tomato[i-1][j] == 0:
               tomato[i-1][j] = 1
               queue.append([i-1, j])

          if i<N-1 and tomato[i+1][j] == 0:
               tomato[i+1][j] = 1
               queue.append([i+1, j])

          if j>0 and tomato[i][j-1] == 0:
               tomato[i][j-1] = 1
               queue.append([i, j-1])

          if j<M-1 and tomato[i][j+1] == 0:
               tomato[i][j+1] = 1
               queue.append([i, j+1])

for i in range(N):
     if 0 in tomato[i]:
          days = -1

print(days)