object LearnScala{
    def main(args: Array[String]): Unit={
        var x = 1+2
        x=3*4
        println(x)

        val y=1+2
        // val = 3 * 4  // 이거는 error남 type변경 불가
        println( y )

        var a=2;
        println(a)

        //var bb; //type이 확정나지 않아서 에러!

        def hello="이것도 됨"
        println(hello);
    }
}