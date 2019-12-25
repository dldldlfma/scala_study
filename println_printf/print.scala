object LearnScala{
    def main(args: Array[String]): Unit={
        var x=10
        var y=1

        // 1번 println 문자열에 덧셈을 하면 그냥 문자로 출력되는 듯
        println("1 : " + x + " is bigger than " + y)

        // 2번 문자열 앞에 s를 쓰면 문자열 안에서 $를 붙이고 변수이름 쓸때 바로 출력이 된다함
        println(s"2. $x is bigger than $y")

        // 3번 수식을 입력하고 싶으면 ${} 사이에 넣으면 된다고 하는군 물론 s가 붙은 문장만 되겠지?
        println(s"3. $x + $y = ${x+y}")

        // 4번 어? 근데 s붙은 println에서 그냥 $를 출력하고 싶으면 어쩌나?
        // 역시 두번 쓰면 되는구만
        println(s"$$ 이렇게 하면되나?")

        // 5. printf도 된다고 하네요 
        // java.lang.*은 자동으로 import되는데 거기에 Math가 포함이라네요 
        printf("4. Pi is %f",Math.PI)

    }
}