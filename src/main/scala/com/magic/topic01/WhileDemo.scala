package com.magic.topic01

/**
  * Company : glodon
  *
  * @author : liuwu
  */
import util.control.Breaks._
object WhileDemo {
  def main(args: Array[String]): Unit = {
    //scala内置控制结构，特地去掉了 break 和 continue
    //是为了更好的使用函数化编程
    //推荐使用函数式的风格解决break 和 contine的功能，而不是一个关键字

    //打印 1-20，10以后不打印
    var num = 0
    while (num < 20) {
      num += 1
      printf("index = %d\n",num)

      if(num > 10) {
        //scala有 break方法（需要导入包import util.control.Breaks._）
        break();
      }
    }

    println("正常结束")

  }
}
