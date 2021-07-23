package com.magic.topic01

/**
  * Company : glodon
  *
  * @author : liuwu
  */
object ForDemo3 {
  def main(args: Array[String]): Unit = {
    //循环时控制步长
    for(i <- 1 to 10) {
      print(i + ", ")
    }
    println()
    //步长为3，range方式，这个range 相当于until 不包含下边界
    for (i <- Range(1,10,3)) {
      print(i + ", ")
    }
    println()
    //通过循环守卫方式实现步长为3
    for (i <- 1 to 10;if i %3 ==1) {
      print(i + ", ")
    }
    //循环反转
    val list = List(1,2,3)
    println(list.reverse)
    for(i <- 1 to 10 reverse) {
      println("to: " + i)
    }

  }
}
