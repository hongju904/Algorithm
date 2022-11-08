모든 문제들은 한 번만 풀어낸다.

정답을 구한 문제는 저장해두고, 다시 일어날 때 가져와 사용한다.


- 작은 문제가 반복해서 일어날 때 사용

---
예시. 피보나치 수열
```python
dp = [0 for _ in range(n+1)]

if n<=3:
  return n
else:
  dp[1] = 1
  dp[2] = 2
  for i in range(3, n+1):
    dp[i] = dp[i-1]+dp[i-2]
```