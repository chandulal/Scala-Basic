/******************************************************************************

//Extension method

  ******************************************************************************/

object StringImplicits{

  implicit class RichString(s: String) {
    def indexOfOneBase(ch: Char) = s.indexOf(ch) + 1
  }
}


import StringImplicits.RichString

"Hello".indexOfOneBase('e')


(1 to 5).foreach(x => println("Hello"))

object IntImplicits {
  implicit class RichInt(i: Int) {
    def times(f: => Any) = {
      def loop(current: Int): Unit = {
        if(current > 0){
          f
          loop(current-1)
        }
      }
      loop(i)
    }
  }
}

import IntImplicits.RichInt

5 times println("Hello")