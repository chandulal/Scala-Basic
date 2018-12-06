import java.net.{MalformedURLException, URL}

import scala.util.{Failure, Success, Try}

// Try


try{
  val url = new URL("garbage")
} catch {
  case e: MalformedURLException => e.printStackTrace()
}

//abstract class Try[T]
//
//case class Success[T](message: String) extends Try[T]
//case class Failure[T](message: String) extends Try[T]


def parseUrl(url: String): Try[URL] = Try(new URL(url))


val validUrl = parseUrl("https://grab.zoom.us/j/607691585")
val invalidUrl = parseUrl("garbage")

validUrl.isFailure
validUrl.isSuccess

validUrl.get
invalidUrl.getOrElse(new URL("https://www.mysite.com"))

invalidUrl match {
  case Success(url) => url
  case Failure(e) => e.printStackTrace()
}

validUrl.map(url => url.getProtocol)
invalidUrl.filter(url => url.getProtocol == "https")
