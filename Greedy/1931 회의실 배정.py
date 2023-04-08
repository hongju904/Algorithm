N = int(input())

team = [[0, 0] for _ in range(N)]
for i in range(N):
     team[i] = list(map(int, input().split()))

team.sort(key = lambda x: (x[1], x[0]))
time = [0,0]
count = 0
for now in (team):
     if now[0] >= time[1]:
          time = now
          count += 1
     if now[0] == time[0]:
          if now[1] < time[1]:
               time = now

print(count)