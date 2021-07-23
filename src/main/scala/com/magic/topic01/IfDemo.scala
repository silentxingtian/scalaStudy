package com.magic.topic01

/**
  * Company : glodon
  *
  * @author : liuwu
  */
object IfDemo {
  def main(args: Array[String]): Unit = {
    //如果{}内的逻辑代码只有一行，大括号可以省略
    if(true)
      println("ok")

    //有返回值
    var result = if(true) {
      "valj"
      "true"
    } else {
      7
      "false"
    }
    println(result)

    //scala不支持java的三目运算符(n1>n2?n1:n2)
    //在Scala中使用 if - else 的方式实现
    val n1 = 20;
    val n2 =30;
    val max = if(n1>n2) n1 else n2
    println("max=" + max)

  }
}
