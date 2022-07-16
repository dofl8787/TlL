













테스트케이스를 미리 주는 방식 (10개를 줄테니 닌가 10번 반복하렴~)



백만개정도





















![image-20220209094918805](C:\Users\kim\AppData\Roaming\Typora\typora-user-images\image-20220209094918805.png)

---

![image-20220209095117620](C:\Users\kim\AppData\Roaming\Typora\typora-user-images\image-20220209095117620.png)

0->i에서 다시 쓴다면

![image-20220209095141817](C:\Users\kim\AppData\Roaming\Typora\typora-user-images\image-20220209095141817.png)



---



카운팅정렬



테스트케이스를 미리 주는 방식 (10개를 줄테니 닌가 10번 반복하렴~)



백만개정도



![image-20220209110645741](C:\Users\kim\AppData\Roaming\Typora\typora-user-images\image-20220209110645741.png)

![image-20220209110708840](C:\Users\kim\AppData\Roaming\Typora\typora-user-images\image-20220209110708840.png)



갯수세기 꼭! 기억하기 꼭!꼭!꼭!!!!!

1단계 꼭 기억~~



음수나 소수는 잘 안한다(무리해서까지 안함)



--------

교수님 정리



offline에서 시험을 볼 때

pycham 2020.3.5

pypy 3.7 사용하기 때문에

이렇게 맞춰서 써랑~



learn-course-(실습날 기본적으로 풀어야 될 것)

programming intermediate

(APS기본)

programming advanced

(APS응용)



APS -> Algorithm program solving



삼성 여러개를 동시에





---

일차로 폴더이름 생성하고

문제 번호로 시작하는 파일(소스코드)이름을 작성

-> ex)1234_문제이름.py

월수 이론 화목 실습

월수->1문제

화목->5문제 +추가문제 제시

---



오후



절댓값 100 이하 정수 -> - 들어가니까 초기값 0 안돼

자료형 데이터 타입 

저장할수 있는 범위를 정하는 언어들이 있음 (정수는 절댓값 20억 이하)



![image-20220209154457482](C:\Users\kim\AppData\Roaming\Typora\typora-user-images\image-20220209154457482.png)



--------------------------





겨수님

## list

연습 많이 해야 할 것

인덱스 이용하기 ^^,,,,,,, 쉬발

기타 

list 1차 배열이라고 부르는



1차 배열 (파이썬에서 list)에 저장된 자료들을 조작

->전체 자료들을 순회 (0순위) / 역방향 순회

​	-> 정수들의 총합

-> 최댓값/최솟값 찾기(기본 연산)

​	->위치(인덱스)찾기

​	->최대값의 여러개인 경우

-> 거품 정렬/카운팅 정렬



#### 알고리즘 설계 기법

- 완전 탐색(Exaustive Search) - 가장 기본적인 접근 방법
- 탐욕(Greedy)
- 분할 정복(Divide and Quanqer)
- 백트래킹(Backtracking)
- 동적 계획법(Dynamic Programming, DP)

```
수십년동안 사람들이 알고리즘을 풀기 위한 어떠한 틀을 생성
```



효율적인 알고리즘

컴퓨터 자원을 최대한 적게 사용하면서 결과를 내기



점근적 표기법

Big-O표기법



T = 10 for tc in range(1, T+1):    N = int(input())    b_lst = list(map(int, input().split()))  # 빌딩리스트     # 변수초기화    cnt = 0    # 앞 뒤 0 두개 뺀 상태에서 for 문 돌면서    for i in range(2, N-2):        # 왼쪽 2개보다 크고 & 오른쪽 두개보다 크면        if b_lst[i] > b_lst[i-1] and b_lst[i] > b_lst[i-2] and b_lst[i] > b_lst[i+1] and b_lst[i] > b_lst[i+2]:            # 양 옆 애들 중 높이 가장 높은 애 만큼 빼주고 카운팅 해줌            # 값 차이가 가장 적은 애가 높이가 가장 높기 때문에 반복문 돌려서 두번째로 높은애 찾음            a1 = b_lst[i] - b_lst[i - 2]            a2 = b_lst[i] - b_lst[i - 1]            a3 = b_lst[i] - b_lst[i + 1]            a4 = b_lst[i] - b_lst[i + 2]            min_gap = a1            for a in [a1, a2, a3, a4]:                if a < min_gap:                    min_gap = a            cnt += min_gap        print("#{} {}".format(tc, cnt))

```
for tc in range(1, 11):
    T = int(input())
    arr = list(map(int, input().split()))
    result = 0

    #for i in T : T를 돌 때
    for i in range(2, T-2):

    # 만약 i-2, i-1, i, i+1, i+2 중 i가 가장 클 때,
        if arr[i-2]<arr[i] and arr[i-1]<arr[i] and arr[i+1]<arr[i] and arr[i+2]<arr[i]:
            a = arr[i] - arr[i-2]
            b = arr[i] - arr[i-1]
            c = arr[i] - arr[i+1]
            d = arr[i] - arr[i+2]

            numbers = [a,b,c,d]

            max_num = a
            for number in numbers:
                if max_num < number:
                    max_num = number

            result += max_num
    print(result)



    # i - 두번째로 큰 i[idx] 를 빼서
    #result에 더하기

    #print result
```





































