right = max(lis)
left = min(lis)

while left <= right:
  mid = (left+right) // 2
  count = 0
  
  for l in lis:
    # 구해야할 코드
  
  if count >= n:
    result = mid
    right = mid - 1
  else:
    lefg = mid + 1

   
  ---
  예시: 나무 자르기
  
N, M = map(int, input().split())
trees = input().split()

for i in range(N):
    trees[i] = int(trees[i])
    
maxtr = max(trees)
mintr = 1

while mintr<=maxtr:
    mid = (mintr+maxtr) // 2
    tree = 0
    
    for i in trees:
        if i > mid:
            tree += (i - mid)
    
    if tree >= M:
        mintr = mid + 1
    else:
        maxtr = mid - 1

print(maxtr)
