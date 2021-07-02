fun main(args: Array<String>) {

    var num=25
    var number=when(num){
        1->"one"
        2->"two"
        in 3..10 -> "in our range"
        else -> println("Invalid")

    }
    println(number)
}