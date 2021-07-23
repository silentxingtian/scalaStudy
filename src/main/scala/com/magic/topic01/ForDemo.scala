package com.magic.topic01

/**
  * Company : glodon
  *
  * @author : liuwu
  */
object ForDemo {
  def main(args: Array[String]): Unit = {

    //包含上下边界
    for(i <- 1 to 5) {
      println("to: " + i)
    }

    //左闭右开 ，不包含下边界
    for (i <- 1 until 5 ) {
      println("until: " + i)
    }
    //遍历集合数据
    for (i <- List(1,3,4,5)) {
      println("list: " + i)
    }

  }
}
