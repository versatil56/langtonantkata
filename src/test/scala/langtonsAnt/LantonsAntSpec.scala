package langtonsAnt

import org.scalatest._

class LantonsAntSpec extends FlatSpec with Matchers {
  "First test here" should
    "write my first test here" in {
      Hello.greeting shouldEqual "hello"
    }
}
