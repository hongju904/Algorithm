from collections import deque

N = int(input())
graph = [[] for _ in range(N)]

for i in range(N):
    graph[i] = input().split()

def dfs(start):
    print(start, end='')
    for i in range(N):
            if graph[i][0] == start:
                 leftnode, rightnode = graph[i][1], graph[i][2]
                 if leftnode != '.':
                      dfs(leftnode)
                 if rightnode != '.':
                      dfs(rightnode)
                 return ''

def dfs2(start):
     for i in range(N):
            if graph[i][0] == start:
                 leftnode, rightnode = graph[i][1], graph[i][2]
                 if leftnode == rightnode == '.':
                      return print(start, end='')
                 elif leftnode != '.':
                      dfs2(leftnode)

                 print(start, end='')
                 if rightnode != '.':
                      dfs2(rightnode)

                 print('', end='')
                 return ''

def dfs3(start):
     for i in range(N):
            if graph[i][0] == start:
                 leftnode, rightnode = graph[i][1], graph[i][2]
                 if leftnode != '.':
                      dfs3(leftnode)
                 if rightnode != '.':
                      dfs3(rightnode)
                 print(start, end='')
                 return ''

print(dfs('A'))
print(dfs2('A'))
print(dfs3('A'))