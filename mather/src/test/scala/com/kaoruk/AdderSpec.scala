import com.kaoruk.Adder
import org.scalatest.FlatSpec
import org.scalatest.Matchers._

class AdderSpec extends FlatSpec {
  ".add" should "sum numbers correctly" in {
    5 should equal(Adder.add(1, 4))
  }
}