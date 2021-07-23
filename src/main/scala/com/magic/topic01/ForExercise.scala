package com.magic.topic01

/**
  * Company : glodon
  *
  * @author : liuwu
  */
object ForExercise {
  def main(args: Array[String]): Unit = {
    //练习题1： 打印1~100 之间所有是9的倍数的整数的个以及总和
    var cnt = 0
    var sum = 0
    for(i <- 1 to 100; if i % 9 ==0) {
      cnt = cnt+1
      sum+=i
    }
    println("总个数:"+cnt+",总和："+sum)

    //练习2:打印出下列语句
    /*
      * 0 + 6 = 6
      * 1 + 5 = 6
      * 2 + 4 = 6
      * *********
      * *********
      * 6 + 0 = 6
     */
    for(i <- 0 to 6; j <- 0 to 6 reverse;if i+j == 6 ) {
      println(s"$i + $j = ${i+j}")
    }
    println("---------------------------")
    //练习3九九乘法表
    for(i <- 0 to 9; j <- 0 to 9) {
      print(s"$i * $j = ${i*j} \t")
      //printf("%d * %d = %d \t", i, j, i * j)
      if(j == 9) {
        println()
      }
    }

  }
}
