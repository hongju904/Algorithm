# 분할정복
작은 문제로 분할 - 하위 문제를 재귀적으로 해결 - 통합하여 해결

### 1. 합병 정렬
- 하나의 리스트를 두 개의 균등한 크기로 분할하여 정렬
- 정렬된 부분 리스트를 합하여 전체 정렬 반복
```python
def merge_sort(arr):
    def sort(low, high):
        if high - low < 2:
            return
        mid = (low + high) // 2
        sort(low, mid)
        sort(mid, high)
        merge(low, mid, high)

    def merge(low, mid, high):
        temp = []
        l, h = low, mid

        while l < mid and h < high:
            if arr[l] < arr[h]:
                temp.append(arr[l])
                l += 1
            else:
                temp.append(arr[h])
                h += 1

        while l < mid:
            temp.append(arr[l])
            l += 1
        while h < high:
            temp.append(arr[h])
            h += 1

        for i in range(low, high):
            arr[i] = temp[i - low]

    return sort(0, len(arr))
```

### 2. 퀵 정렬
- 특정 원소를 기준으로 배열을 분할
- 퀵 정렬을 순환적으로 적용
```python
def quick_sort(arr):
    def sort(low, high):
        if high <= low:
            return

        mid = partition(low, high)
        sort(low, mid - 1)
        sort(mid, high)

    def partition(low, high):
        pivot = arr[(low + high) // 2]
        while low <= high:
            while arr[low] < pivot:
                low += 1
            while arr[high] > pivot:
                high -= 1
            if low <= high:
                arr[low], arr[high] = arr[high], arr[low]
                low, high = low + 1, high - 1
        return low

    return sort(0, len(arr) - 1)
```

### 3. [이진 탐색](https://github.com/hongju904/Algorithm/tree/main/Binary%20Search)
- 정렬된 데이터 탐색에 효과적
- 정렬되지 않은 데이터는 파라메트릭 서치로 가능