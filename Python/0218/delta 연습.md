delta 연습 

델타 연습 ㅅㅂ ㅅㅄㅄㅄㅄㅄㅄㅄ





```python
arr = [['_']* 10 for _ in range(10)]
dr = [-1, 0, 1, 0] # 상 우 하 좌
dc = [0, 1, 0, -1]

#임의 기준점 하나 정하기
r,c = 6,7
arr[r][c] = '#'

for i in range(4):
# 1번 방법 (그냥 주변 좌표만 별찍기)
#    nr = r + dr[i]
#    nc = c + dc[i]
#    arr[nr][nc] = '*'
#2번 방법 : 십자가 만들기
	while 0 <= nr < 10 and 0 <= nc < 10:
	arr[nr][nc] = '*'
	nr = nr + dr[i]
	nc = nc + dc[i]

for lst in arr:
    print(*lst)
```

![image-20220217174321417](C:\Users\kim\AppData\Roaming\Typora\typora-user-images\image-20220217174321417.png)

```
while 0 <= nr < 10 and 0 <= nc < 10:
	arr[nr][nc] = '*'
	nr = nr + dr[i]
	nc = nc + dc[i]
```

<방법 2>

![image-20220217174758646](C:\Users\kim\AppData\Roaming\Typora\typora-user-images\image-20220217174758646.png)

<정해진 칸만 가고싶다>

![image-20220217174952719](C:\Users\kim\AppData\Roaming\Typora\typora-user-images\image-20220217174952719.png)

![image-20220217175008006](C:\Users\kim\AppData\Roaming\Typora\typora-user-images\image-20220217175008006.png)



== 같은 방법 

![image-20220217175050312](C:\Users\kim\AppData\Roaming\Typora\typora-user-images\image-20220217175050312.png)

![image-20220217175058749](C:\Users\kim\AppData\Roaming\Typora\typora-user-images\image-20220217175058749.png)

<대각>

![image-20220217175225398](C:\Users\kim\AppData\Roaming\Typora\typora-user-images\image-20220217175225398.png)

![image-20220217175231286](C:\Users\kim\AppData\Roaming\Typora\typora-user-images\image-20220217175231286.png)

```
처음에 델타를 해보고 , 끝까지 가는 걸 연습해보기
그리고 원하는 거리만큼 가보기 (경계 체크 중요)

참고할 수 있도록 올려놨음 (여러가지 패턴을 ㅎ)
여러분들이 여러분들 스타일대로 코드를 짜보고 ,
막상 로직까지 합쳐져 있다 보니 처음에는 일단! 그냥 여기다가 기준점 하나를 잡아놓고 연습 해보세요
그러고 문제 푸는 데 적용을 해라 ㅎㅎ
조졌넴 ㅎㅎ
```

```
델타 (좀 어려운 문제)
문제풀이를 내일 할텐데 ㅎㅎ 파리퇴치 꼭 풀어보세요
파리퇴치 파리퇴치 파리퇴치 퇴치 그냥 퇴치 제발 
퇴실 제발 하고싶어 퇴실 ;;ㅎㅎ 
상호의 배틀 필드 빼고 아마 쭉 보면서 푸는 방법에 대해서 이야기를 해줄 것임
접근 방법에 대해서
그리고 웹 코칭 시간에 푸는 거긴 한데,
이야기를 하고 몇 개 여러분들 푸는 건데
내일 들으면 문제를 들으면 되겠지만 미리 좀 읽어보세요 시간 날 때 ㅎㅎ
```

