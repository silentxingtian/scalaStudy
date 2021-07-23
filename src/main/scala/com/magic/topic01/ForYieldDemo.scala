package com.magic.topic01

/**
  * Company : glodon
  *
  * @author : liuwu
  */
object ForYieldDemo {
  //循环返回值
  def main(args: Array[String]): Unit = {
    //将遍历的结果，存放到一个Vector集合中
    val res = for (i <- 1 to 10) yield i
    println(res)
    //yield 可以写表达式
    val res2 = for(i <- 1 to 10) yield i * 2
    println(res2)
    //yield 可以跟上代码块
    val res3 = for (i <- 1 to 10) yield {
      if (i % 2 ==0) {
        i
      } else {
        "不是偶数"
      }
    }
    println(res3)

  }
}
