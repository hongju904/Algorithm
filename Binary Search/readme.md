# 이분 탐색
양단에서 시작해서 중간지점의 값을 찾는다.
필요한 만큼 많이(N), 최대값(K)을 설정하는 등의 문제

- 양단을 max, min을 이용하여 지정
- left <= right인 동안 반복
- mid = (left + right) // 2
- if count >= n 이라면: `result = mid`, `right = mid - 1`

```python
right = max(lis)
left = min(lis)

while left <= right:
  mid = (left+right) // 2
  count = 0
  
  for l in lis:
    # result 계산 코드
  
  if count >= n:
    result = mid
    right = mid - 1
  else:
    lefg = mid + 1
```
