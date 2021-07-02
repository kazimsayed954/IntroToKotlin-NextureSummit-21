class Account{

    var acc_no:Int=0
    var name:String=""
    var amount:Float=0.toFloat()

    fun insert(ac:Int,n:String,am:Float){
        acc_no=ac
        name=n
        amount=am

        println("$acc_no $name $amount")
    }


}

fun main(args: Array<String>) {
    Account()
    var acc=Account()
    acc.insert(7455,"Balaji Sarkar",1000f)
    println("${acc.name}")
}
