package com.magic.topic01

/**
  * Company : glodon
  *
  * @author : liuwu
  */

import scala.util.control.Breaks._

object WhileContinue {
  def main(args: Array[String]): Unit = {
    //使用循环守卫，实现continue
    for(i <- 1 to 3 if i != 2) {
      println(i)
    }

    val list = List(21,33,-22,312,423)
    //使用breakable 语句块来实现continue操作
    println("breakable语句块来实现continue操作")
    for(elem <- list) {
      breakable {
        if(elem < 0) break() else println(elem)
      }
    }
    //使用if else 控制 来实现 continue操作
    println("if else控制来实现continue操作")
    for(elem <- list) {
      if(elem < 0) () else println(elem)
    }
  }
}
