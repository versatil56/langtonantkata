package langtonsAnt

import org.scalatest._

class LantonsAntSpec extends FlatSpec with Matchers {

  //What's the simplest test possible we can do?
  "First test here" should
    "write my first test here" in {
      Hello.greeting shouldEqual "hello"
    }
}
