N, M, K = map(int, input().split())

team = 0
while ((N+M)-3 >= K) and N>=2 and M>=1:
    N -= 2
    M -= 1
    team += 1

print(team)