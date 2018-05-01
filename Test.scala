object Test {

  def main(args:Array[String]): Unit ={

    println("hello world")

    for( i <- List(1,2,3) )
        println(i)

    for(i <- Array('a','b','c'))
      println(i)

  }

}
