object StringImplicits {
  implicit class RichString(str: String) {
    def indexStartAtOne(ch: Char) = str.indexOf(ch) + 1

  }
}

import StringImplicits.RichString

"Hello".indexOf("e")
"Hello".indexStartAtOne('e')

