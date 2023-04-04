N = int(input())
P = list(map(int, input().split()))

P = [0] + P
dp = P.copy()

for i in range(1, N+1):
     for j in range(1, i):
          dp[i] = max(P[j]+dp[i-j], dp[i])

print(dp[-1])