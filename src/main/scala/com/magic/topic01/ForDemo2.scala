package com.magic.topic01

/**
  * Company : glodon
  *
  * @author : liuwu
  */
object ForDemo2 {

  def main(args: Array[String]): Unit = {
    //for语句中可以添加循环守卫
    for(i <- 1 to 3 if i !=2) {
      println("守卫:" + i)
    }
    //for循环中引入变量
    for(i <- 1 to 3;j = 4 - i) {
      println("引入变量:"+j)
    }
    //循环嵌套
    for(i <- 1 to 3;j <- 1 to 3) {
      println(s"$i * $j = ${i*j}")
    }
  }

}
