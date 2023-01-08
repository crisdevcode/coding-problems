def findMedian(arr):
    n = len(arr)
    arr.sort()
    return arr[n//2]

print(findMedian([0,1,2,3,4,5]))