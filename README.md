# Hello Scala

스칼라 공부할려고 만들어봤습니다. 

ubuntu 20.04 기준으로 진행하며 가능하면 Windows에서 할 수 있는 환경도 알아보겠습니다. 

Compile 환경을 vscode에 어떻게 설정하는지 부터 알아보겠습니다. 

---

스칼라는 JVM(Java Virtual Machine) 언어입니다.

따라서 JAVA JDK를 설치해야 사용할 수 있습니다. 

JDK는 여러가지가 있는데 무료 JDK가 있습니다. 

https://openjdk.java.net/install/

위 주소에 나와있는 설명에 따라 JDK를 설치하시면 됩니다. 

---

잘 설치가 되었는지 확인하려면 terminal에 
```
java --version
```
을 입력해보시면 됩니다. 

---

## Scala 설치

Scala 설치는 아래 명령어를 통해서 하시면 됩니다. 

```bash
sudo apt remove scala-library scala
wget https://downloads.lightbend.com/scala/2.13.4/scala-2.13.4.deb
sudo dpkg -i scala-2.13.4.deb
```

잘 설치 되었다면 terminal에 아래 scala를 입력하면 scala terminal이 실행됩니다. 

```bash
scala
```

끝내기 위해서는 :quit 을 입력하시면 됩니다.

```scala
scala>:quit
```

---

여기까지 순조롭게 진행이 되셨다면 이제 Hello world를 하는 두가지 방법을 볼수 있습니다. 

1. terminal에서 해보기 
2. code작성하고 compile하기! 


1번부터 보겠습니다. 너무 쉬울거 같죠?

1. terminal에서 해보기 
    - terminal에 scala를 입력한다. 
    - println("Hello world") 를 입력한다.

2. code 작성하고 compile하기!

아래와 같이 코드를 작성합니다. 

hello.scala

```scala
object LearnScala{
    def main(args: Array[String]): Unit = {
        println("Hello, world!")
    }
}
```

그리고 terminal에 아래와 같이 입력합니다. 

```bash
scala hello.scala
```

---

