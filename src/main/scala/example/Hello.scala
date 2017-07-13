package example

import another.SomeJavaClass

object Hello extends Greeting with App {
  println(greeting)
}

trait Greeting {
  lazy val greeting: String = "Hello " + SomeJavaClass.javifyString("Scala")
}
