import org.graalvm.nativeimage.c.function._
import org.graalvm.nativeimage.c.function.CFunction._

@CLibrary("test")
object Main {
  @CFunction(transition = Transition.NO_TRANSITION)
  @native def myFunction(): Unit

  def main(args: Array[String]): Unit = {
    myFunction()
  }
}
