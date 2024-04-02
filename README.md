Kotlin은 JAVA 기반 언어라길래 뭐 그럼 자바랑 별반 다르지 않겠네~ 했다가 제대로 통수 맞고 정리하는 글
~~방학 때부터 거의 파이썬만 썼더니 더 어색하게 느껴지는 건가~~

우선 가장 기본인
### 변수 및 상수
#### val, var, Nullable
- val: valuable의 약자, 상수
- var: variable의 약자, 변수
- Nullable: null값을 허용, NullPointException 예방
```kotlin
var age: Int = 23
val name: String = "HelloWorld"
var num: Int? = null
```

### 조건문
#### If, When
- If는 자바와 똑같으니 생략
- When: 하나의 변수를 여러 값과 비교할 때 사용 
상위 조건에 부합하면 나머지는 실행되지 않음
``` kotlin
val money = 1000
when (money) {
	0 -> println("값이 1인가")
  1 -> println("1이다")
    is Int -> println("자료형이 Int인가")
    else -> println("어떤 조건도 만족하지 않아서 실행됨")
}
```
여기서 'is'란 type checker이다.

### 반복문
#### for, while
while은 자바와 동일
for
```kotlin
for (i in 0..5) {
	print(i) // 0부터 5까지 1씩 증가
}

for (i in 5 downTo 0) {
	print(i) // 5부터 0까지 1씩 감소
}

for (i in 0..10 step 2) {
	print(i) // 0, 2, 4, 8, 10 출력
}

for (i in 10 downTo 0 step 2) {
	print(i) // 10, 8, 6, 4, 2, 0출력
}
```
다른 언어는 0<=i<10인데 kotlin은 0<=i<=10인 걸 주의해야겠다!

#### break, continue, forEach

!! label 개념 추가하기 !!

### 클래스
``` kotlin
// 클래스 이름 옆에 선언된 기본 생성자
class Person constructor (name: String, age: Int) {
  var name: String = name
  var age: Int = age
}

// 생성자 키워드를 생략한 형태
class Person (name: String, age: Int) {
  var name: String = name
  var age: Int = age
}

class Person (var name:String = "개발자", var age:Int = "20")
```	

### 함수
_내가 이 글을 쓰게 만든 결정적 이유..._
``` kotlin
fun function(): Unit {
	println("Hello World")
} // Unit은 생략 가능 (JAVA의 void)

//name이라는 파라미터가 있는 함수
fun getName(name:String){
    println(name)  
}
```
vararg 파라미터: 값이 정해져 있지 않은 상황에서 쓰는 한정자 (ex. public) 

``` kotlin
//값을 합산하는 함수 선언
fun sum(vararg numbers:Int) : Int{
    numbers.forEach { number ->
        //전달 받은 값 확인
        println(number)
    }
    var sum = numbers.sum()
    return sum
}
```

단일 표현식 함수: 중괄호를 사용하지 않고 바로 함수 결과 반환
``` kotlin
//타입 지정
fun getName():String = "개발이 취미인 사람"

//타입 추론
fun getName() = "개발이 취미인 사람"
```

꼬리 재귀 함수: 함수의 마지막 작업으로 자기 자신을 호출하는 재귀 수행 (필요할 때 찾아봐야겠다)

정보는 계속 추가할 예정!
