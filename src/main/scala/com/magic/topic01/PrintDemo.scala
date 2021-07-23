package com.magic.topic01

/**
  * Company : glodon
  *
  * @author : liuwu
  */
object PrintDemo {
  def main(args: Array[String]): Unit = {
    val name:String = "zhangsan"
    val age:Int = 10
    val height:Double = 178.3

    //第一种方式
    println("name="+name+",age"+age+",height="+height)
    //第二种（%f默认保留6位小数） s代表String, d代表数字, f代表flout/double
    printf("name=%s, age=%d, height=%f\n",name,age,height)
    //第三种 $紧跟变量名即可, ${变量名}还可以对变量进行运算
    println(s"name=$name,age=$age,height=$height,10年后年龄=${age+10}")
  }
}
