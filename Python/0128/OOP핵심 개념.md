추상화가 어렵기 때문에 OOP가 어려울 수 있음

중요 포인트 !! 객체 !!

객체와 클래스를 잘 구분해야 한다~

```
class -> 하나의 명세서 
(어떤 공간에 어떠한 타입(종)에 대해 자세하게 작성해놓은 것)
명세서를 바탕으로 구체화된 정보가 만들어짐
그게 바로 객체, 인스턴스라고 불림(명세서를 기반으로)
```

![image-20220126184144328](C:\Users\kim\AppData\Roaming\Typora\typora-user-images\image-20220126184144328.png)

```
절차중심 : C, 어셈블리어, 하드웨어
=> 굉장히 low level
객체중심 : 파이썬, 자바, JS (High level)
하드웨어에 가까워질수록 복잡합 패러다임 적용 어려움
```

```
어딘가에 물어볼 수 있겠죠
직관성 , 용이성 , 유연성
```

---

 속성과 메서드

```
속성 -> 변수
메서드 -> 함수

근데 왜 이름을 구분해서 불러?
쟤네가 클래스 안에 적용이 돼서 변수긴 변수인뎅 ,, 클래스나 인스턴스에 달린 변수라서 속성이라 불리는거임~
메서드도 마찬가지!
(연결고리를 만드려구 새로운 이름 붙였다고 생각행)
```

----

##### attribute 

```
class 밑에
a = 1
b = 2
c = 3
==> 얘네들은 클래스 속성으로 속함
```





```
def __init__(self): (생성자 형태)
	self.A = 1
	self.B = 2
	self.C = 1
==> 인스턴스 속성으로 속함
```



```
명세서라고 이야기 한 이유
명세서를 바탕으로 인스턴스 생성
개별 인스턴스가 
인스턴스가 개별적으로 A,B,C라는 정보를 들고 있어요! 라고 생성자에 쓰여있음(def__init__(self))
인스턴스 n개를 가지고 있다면, n개의 인스턴스가 각각 개별의 A,B,C를 가지고 있다.
```

![image-20220126184926919](C:\Users\kim\AppData\Roaming\Typora\typora-user-images\image-20220126184926919.png)

```
클래스 속성과 인스턴스 속성의 가장 큰 차이점
인스턴스1이 ABC를 가지고 있는데, 클래스에 접근해서 클래스 속성들을 확인할 수 있음
근데 인스턴스 3로는 찾아갈 수 없음 
(명세서 가서 읽어봤을 때, 인스턴스가 개별 ABC를 가지고 있다는 말 뿐. 인스턴스1에서는 다른 인스턴스가 얼마나 있는지 확인할 수 없음)

인스턴스가 거꾸로 클래스를 조회하면 바로 접근 가능함
그런데 인스턴스 끼리는 접근할 수 없는 상태임.

클래스에서 인스턴스메서드를 사용하는 건 좀 불편했음(self를 넘겨줘야 하는데 클래스 입장에선 모르는 정보)

class에서 인스턴스가 파생되어 나왔지만, 그 이후는 인스턴스는 인스턴스의 것
그래서 class는 인스턴스를 찾아갈 수 없음 (엥?? 너 누군뎅??)
근데 인스턴스는 class에서 파생되었기 때문에 class를 찾아갈 수 있음!(나왔엉~~~~~) 
```

![image-20220126195555017](C:\Users\kim\AppData\Roaming\Typora\typora-user-images\image-20220126195555017.png)

```
클래스 안에 인스턴스 메서드라고 정의되어 있기 때문에 접근은 가능하나, 정보는 없기 때문에 인스턴스가 값을 넣어주어야 함!

클래스 메서드야! 라고 적혀있어서 접근하는 건 당연
인스턴스에서도 클래스로 접근하는 건 가능함
그리고 클래스 정보도 알고 있어서
cls라고 쓰는 거 가능함

나 스태틱 메서드야! 라고 있어서 클래스도, 인스턴스도 접근 가능함(대신 사용하는 건 좀 다를 수 있음)
```











---

#### 인스턴스 메서드

```
현재 속성은 
1) 클래스
2) 인스턴스
로 나눴음.

속성, 즉 method (함수) 
1) 클래스와 관련 있는지
2) 인스턴스와 관련 있는지
3) 스태틱(클래스도 상관없고, 인스턴스와도 관련 없음)

인스턴스 메서드는 어떤 목적으로 작동을 하나요?
->인스턴스를 조작하기 위해 사용합니다

클래스 메서드 -> 클래스를 조작하기 위해서

=> 조작하고 싶은 목적(대상)이 다르다
```

```
@ => 데코레이터
사실 그냥 함수! wrapping (함수를 한 번 감싼다)
데코레이터가 없다 ? 무조건 인스턴스 변수

왜 이렇게 설계를 했나?
인스턴스 변수가 쓸 일이 많기 때문에!
제일 많이 사용이 되기 때문에 @ 없으면 인스턴스 변수임
```

```
객체지향적 특징
인스턴스 method <- 아무것도 안 쓴 친구
굉장히 많이 사용하기 때문에 사용할 때 마다 @쓰기 귀찮으니까 생략한다~

==> 객체지향의 목적은 뭐다?
인스턴스를 통한 로직관리를 위해서 
(개별정보가 중요하다) + 인스턴스가 중요하다
```

```
인스턴스 메서드 -> 인스턴스 조작 (목적)
```

```
클래스 메서드랑 연결지어 생각하기
클래스 메서드가 붙는다면?
인스턴스 메서드가 아니라 클래스가 첫번째 인자로 넘어간다!!!
언제? 클래스 메서드가 데코레이터로 붙어있을 때!
```

```
스태틱 매서드 -> 인자가 x, 약속 x
스태틱 매서드 왜 써?
둘 다 상관없는 조작일 때
보통의 함수를 구현을 할 때 사용함

스태틱 매서드는 없을 수 있음
	@staticmethod
ex) def static_method()
	return
```



---

#### self



```
키워드가 중요하지 않음 (self라고 지정되어있지 x)

@생략 => 인스턴스 메서드
인스턴스 메서드 애들은 self를 통해서 인스턴스 자기 자신이 들어가야함
구체화된 정보가 그대로 자기 자신으로 들어감

```



---

#### 생성자 메서드

```
인스턴스 객체가 생성될 때 자동으로 !!호출!!됨

자동으로 class에 들어가있는데, 우리가 걍 꺼내서 쓰는 거얌 (우리가 생성할 때 self말고, 정보를 추가적으로 입력하고 싶어! 하고싶을 때)
그 때 마다 __init__을 사용한다.
```



---

#### 소멸자 메서드

직접적으로 소멸자를 불러서 없애고 삭제하는 건 거의 쓸 일이 없음

```
소멸자 => 자동으로 호출되는 함수
```

---

#### 속성

```
변수인데 class / instance로 나뉨
```

---

#### 매직(스페셜) 메서드

```
__xxxxx__ : 약간 인스타 넉김~~
특별한 너낌~~
+ 파이썬 내부에 존재(이미 구현되어있고, 각자 위치에 맞게 구현되어 있습니다.)
보통 오버라이딩 해서 사용함
간단하게 이런게 있다 정두~~~~~ 장고에 넘어가게 되면 매직메서드를 기가막히게 사용하게 됨
(경로를 사용할 때) ^^
```

```
__gt__ (greater than)
__eq__ 정도만 알아두기 ~~ (eq == equal)
```

---

#### 클래스 생성

```
PascalCase로 정의함 (개발자의 약속) == CamelCase
```



---

#### 클래스 변수

```
바꾸고 싶으면 클래스 변수 받아서 쓴당
```

---

#### 클래스 매서드

```
@classmethod
매서드 호출 시, 첫 번재 인자로 클래스 'cls'가 들어간당~
```

#### 스태틱 매서드

```
@staticmethod
호출 시, 어떠한 인자도 전달되지 않습니다.
속성을 다루지 않고 기능 행동만을 하는 메서드를 정의할 때 사용합니다.

밖에다가 하면 되지 왜 굳이 staticmethod를 사용해?
완전 상관 없는 내용은 아냠..
보통 이럴 경우에는 클래스,인스턴스 속성값을 직접 변경하는게 아니라 그걸 가지고 다른 걸 변형할 때 사용햄...
(라이브러리 활용할 때 자주 사용!_ 인스턴스끼리 계산하거나, 인스턴스끼리 정보 공유 등을 통해 사용자에게 더 좋은 서비스를 제공할 수 있을 때 사용)
```

#### 인스턴스와 메서드

```
속성
- 클래스 : + 모든 인스턴스 접근 가능한 정보
-인스턴스 : + 개별정보

메서드
-클래스 @class + 첫번째 인자 cls
-인스턴스 x + 첫번째 인자 instance
-스태틱매서드 @static + 첫번째 인자 X
```

---



### OOP핵심 개념

=> 그냥 이런게 있당~ 하는 느낌 (계속 하면서 느껴야 하기 때문에 코드로서 확인해보긴 쉽지 않음)

```
파이썬에서 가장 많이 사용되는 개념은 !!상속!!이라는 개념
실제로 다형성과 캡슐화는 파이썬에선 그렇게까지나, 일반적인 OOP처럼 구현되어 있진 않음.
dynamic하게 구성되어 있기 때문에 완벽 구현은 아님
```

```
나머지 측면에선 OOP관련해서 정리하는게 좋음 (객체지향 면접에서 물어볼 때 기본적인 것이기 때문엥 ㅎㅎ)
```

---

#### 메서드 오버라이딩

같은 이름의 메서드로 덮어씀

```
__init__, __str__ 등
```









---



#### super.

![image-20220126194612177](C:\Users\kim\AppData\Roaming\Typora\typora-user-images\image-20220126194612177.png)

```
super() 까지 부모!!
```



---

인스턴스는 인스턴스 변수끼리 놀고!

클래스 변수는 클래스 변수끼리 놀아!!

==> 캡슐의 목적

```
Dynamic하게 반응
프로그래밍적으로 문제가 되진 않음
보안 문제 있나욤? 없음~
보안은 로직적으로 고민해봐야 하는 것이기 때문에
개인정보를 저장할 수 없음~~ DB에 있음~~
DB에 저장할 때에는 보안을 별도로! 신경 씀 (암호화)
코딩 구조와는 달라염~
설계할 땐 없어여~~
```

---

#### 다중상속

```
파이썬이 가지고 있는 대표적인 특징 중 하나!
class를 여러 개 받을 수 있다
상속을 할 때, 두 가지를 한 번에 할 수 있다.
```

---

#### MRO

```
지금 단계에선 class instance가 복잡하지 않음
그래봤자 한 세 번?
클래스가 많은 상속을 받으려면 Framework에서나 가능
지금은 그런게있다~ 그런게 존재한다~
인스턴스 -> 자식 -> 부모 정도로~
```













































