```python
A = list(map(int, input().split()))
B = list(map(int, input().split()))
while True:
    A[1] -= B[0]
    B[1] -= A[0]
    if A[1] <= 0 and B[1] <= 0:
        print('DRAW')
        break
    elif A[1] <= 0:
        print('PLAYER B')
        break
    elif B[1] <= 0:
        print('PLAYER A')
        break
```

