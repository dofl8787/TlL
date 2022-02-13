# HTML 

#### Hyper Text Markup Language

-> 참조(하이퍼링크)를 통해 사용자가 한 문서에서 다른 문서로 즉시 접근할 수 있는 텍스트 (비선형구조)

->정보를 추가적으로 마킹해놓음(텍스트 문서 내용 중 내가 원하는 내용에다가 표시(태그)를 해놓는 것)



###### 시맨틱태그

```
왜? div태그보다 더 간편하게 구간을 나누려고 (공간에 이름을 배정-> 의미 부여) 요소 의미가 명확해지기 때문에 코드의 가독성을 높이고 유지보수를 쉽게 함

header : 문서 전체나 섹션의 헤더
nav : 내비게이션
aside : 사이드에 위치한 공간, 메인 컨텐츠와 관련성이 적은 컨텐츠
section : 문서의 일반적인 구분, 컨텐츠의 그룹을 표현
article : 문서, 페이지, 사이트 안에서 독립적으로 구분되는 영역
footer: 문서 전체나 섹션의 마지막 부분
```

###### b/strong과 i/em

```
b와 i는 굵은 글씨, 기울임 글씨 요소이고
strong과 em은 중요한 강조하고자 하는 요소로, 시맨틱태그상 더 중요한 것은 strong, em을 사용합니다.
```



##### 1.돔트리

html - title : 조상관계

head - title : 부모 자식 관계 

h1 - a : sibling

![image-20220213155751456](C:\Users\kim\AppData\Roaming\Typora\typora-user-images\image-20220213155751456.png)



##### 2.내용없는 태그들(객)

```
br(개행(줄바꿈)), hr(수평선), img(링크), link, input, meta
```



##### 3.시맨틱 태그

- html : 문서의 구조화

```
text 
b=stong
b
strong 강조
--------------
i
em(empasys?강조) markup 자체에 em
```



# CSS

#### Cascading Style Sheets



선택하고, 스타일을 지정한다.
선택 : css 작성할 때, 어떤 애한테 스타일을 입힐 건지 선택을 해야함(명시해야함) : html 안에 있는 어떤 요소(혹은 그룹핑 된 영역)을 선택해야 함.(어떤 부분을 위한 선택자)



왜 선택자가 필요해요?

html 문서에서 내가 원하는 부분을 선택해서 스타일을 지정할 수 있기 때문



css 우선 적용 순위

!important > Inline Style > Id선택자 > Class 선택자 > 요소 선택자 > 소스 순서





#### css 단위

##### 1.크기 단위

```
-px(픽셀)
	- 모니터 해상도의 한 화소인 픽셀 기준(도트)
	- 픽셀의 크기는 변하지 않기 때문에 고정적 단위
- %(브라우저 화면 크기에 대한 백분율)
	- 백분율 단위
	- 가변적인 레이아웃에서 자주 사용
	
-em
	-(바로 위, 부모 요소에 대한)상속의 영향을 받음
	(우리가 크기의 단위로 px을 썼듯, 1em;으로 사용)
	-배수 단위, 요소에 지정된 사이즈에 상대적인 사이즈를 가짐

-rem(r == root)
	-(바로 위, 부모 요소에 대한)상속의 영향을 받지 않음
	-최상위 요소(html)의 사이즈를 기준으로 배수 단위를 가짐
    : 1rem = 16px
    
-viewport(지금은 이런게 있구나 정도!)
	-웹 페이지를 방문한 유저에게 바로 보이게 되는 웹 컨텐츠의 영
	역(디바이스 화면) : 그냥 풀브라우징, 웹 전체라고 생각
	- 디바이스의 viewport를 기준으로 상대적인 사이즈가 결정
	-vw, vh, vmin, vmax(이것도 비율(%)처럼 사용)
```

##### 2.색상 단위

```
-색상키워드
	- 대소문자 구분x, red,black등 특정 색 나타냄
-RGB
	-#+16진수 표기법, 함수형 표기법 사용해서 나타냄(rgb()) 
-HSL
	-색상, 채도, 명도를 통해 특정 색을 표현하는 방식
```



##### 3.Box model

![image-20220203154536891](C:\Users\kim\AppData\Roaming\Typora\typora-user-images\image-20220203154536891.png)

```
개발자 도구에서 어떤 요소를 선택하면, 네모 박스 형태가 보임
네 개의 영역을 색깔로 구분해서 표시를 해줌
위 박스 속 숫자들은 px값, '-'는 값이 없음
바깥에서부터 안쪽 들어가는 순서로 
1. Margin(테두리 바깥 여백)
2. Border(테두리) : 선이기 때문에 두께 표현 가능
3. Padding(테두리 안쪽 여백) : 이미지는 padding까지 적용
4. Content: 실제 내용
```

margin, padding shorthand

![image-20220213174231410](C:\Users\kim\AppData\Roaming\Typora\typora-user-images\image-20220213174231410.png)



margin: 0 auto; 
content가 중앙에 옴 -> 중앙정렬 할 때 사용!(시험문제 나올 수 있음!)



###### block

```
줄 바꿈이 일어나는 요소
화면 크기 전체의 가로 폭을 차지 (기본 너비는 가질 수 있는 너비의 100%)
블록 레벨 요소 안에 인라인 레벨 요소가 들어갈 수 있음
```

###### inline

```
줄바꿈이 일어나지 않는 행의 일부 요소
content 너비만큼 가로 폭을 차지한다
width, height, margin-top, margin-bottom을 지정할 수 없다.
상하 여백은 line-height로 지정한다.
```







###### CSS Position

```
- static : 모든 태그의 기본 값 (기준 위치)
	일반적인 요소의 배치 순서에 따름(좌측 상단)
	부모 요소 내에서 배치될 때 부모 요소의 위치를 기준으로 배치

- relative : 자기 자신의 static 위치를 기준으로 이동
	= normal flow 유지
	- 요소가 차지하는 공간은 static과 동일, 보이는 것만 옮김

- absolute : 절대 위치
	- 요소 내 공간을 삭제 (normal flow out)
	- static이 아닌 제일 가까운 부모,조상 요소를 기준으로 이동(없는 경우 body)

-fixed : 고정 위치
	- normal flow out
	- viewport를 기준으로 이동
    = (웹브라우저 크기 맞춰서 항상 같은 위치에 존재)
<===>
- sticky : 고정 위치
	- 항상 같은 곳에 존재하지만, 공간도 차지하고 있음
	
```



---

###### 선택자

![image-20220213161355873](C:\Users\kim\AppData\Roaming\Typora\typora-user-images\image-20220213161355873.png)

```
더 좁게 선택하는게 우선순위라고 보기
```

![image-20220213161429509](C:\Users\kim\AppData\Roaming\Typora\typora-user-images\image-20220213161429509.png)

id class element(tag)

id > class > element(tad) (금은동)

id(문서 하나) class (문서 여러번) tag (기본 태그)



클래스 같이 지정되어있다면 ? -> CSS 선언 순서(마지막에 지정된 상태로 적용)

---



### CSS Layout

###### Flex box

```
flex-direction : main axis 방향 설정
flex-wrap : 컨테이너 내 배치되도록 설정
flex-flow : direction + wrap shorthand

justify-content -> main축 기준으로 공간 배분
[start, end, center, between, around, evenly]

align-content -> cross축 기준으로 공간 배분
[start, end, center, between, around, evenly]

align-items : 모든 아이템을 cross기준으로 정렬
[stretch(컨테이너 공간 꽉 차게 분배), start, end, center, baseline(글자 베이스라인 기준으로 설정)]

align-self : 개별 아이템을 cress축 기준으로 정렬
(컨테이너 적용이아닌 개별 아이템에 적용)
[stretch, start, end, center]

flex-grow : 남은 영역을 아이템에 분배
order : 배치 순서 설정
```



###### Bootstrap

| class name | rem  |  px  |
| :--------: | :--: | :--: |
|    m-1     | 0.25 |  4   |
|    m-2     | 0.5  |  8   |
|    m-3     |  1   |  16  |
|    m-4     | 1.5  |  24  |
|    m-5     |  3   |  48  |

