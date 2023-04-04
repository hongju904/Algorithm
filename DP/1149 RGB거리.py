N = int(input())
cost = [[0, 0, 0] for i in range(N)]
for i in range(N):
    cost[i] = list(map(int, input().split()))

dp = cost.copy()

for i in range(1, N):
     dp[i][0] = min(dp[i][0]+dp[i-1][1], dp[i][0]+dp[i-1][2])
     dp[i][1] = min(dp[i][1]+dp[i-1][2], dp[i][1]+dp[i-1][0])
     dp[i][2] = min(dp[i][2]+dp[i-1][0], dp[i][2]+dp[i-1][1])

print(min(dp[-1]))