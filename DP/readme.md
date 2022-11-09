모든 문제들은 한 번만 풀어낸다.

정답을 구한 문제는 저장해두고, 다시 일어날 때 가져와 사용한다.


- 작은 문제가 반복해서 일어날 때 사용

---
### 예시. 피보나치 수열
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
---

### 관련 문제
- [11726 2xn 타일링](https://github.com/hongju904/Baekjoon/blob/main/silver/silver3/11726%202xn%20%ED%83%80%EC%9D%BC%EB%A7%81.txt) [(백준)](https://www.acmicpc.net/problem/11726)
- [11727 2xn 타일링2](https://github.com/hongju904/Baekjoon/blob/main/silver/silver3/11727%202xn%20%ED%83%80%EC%9D%BC%EB%A7%812.txt) [(백준)](https://www.acmicpc.net/problem/11727)
- [9095 1,2,3 더하기](https://github.com/hongju904/Baekjoon/blob/main/silver/silver3/9095%201%2C2%2C3%20%EB%8D%94%ED%95%98%EA%B8%B0.txt) [(백준)](https://www.acmicpc.net/problem/9095)
- [10844 쉬운 계단 수](https://github.com/hongju904/Baekjoon/blob/main/silver/silver1/10844%20%EC%89%AC%EC%9A%B4%20%EA%B3%84%EB%8B%A8%20%EC%88%98.txt) [(백준)](https://www.acmicpc.net/problem/10844)
