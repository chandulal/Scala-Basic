package com.basics.worksheets.session1;

object TestLazyVal extends App{
  lazy val number = { println("Constant number is initialized."); 99 }
  println("Before Accessing 'number' constant:")
  println(number + 1)
  println(number + 1)
  println(number + 1)
}
