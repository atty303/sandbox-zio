package sandbox.zio
import zio.{console, ExitCode, URIO}

object GettingStarted extends zio.App {
  override def run(args: List[String]): URIO[zio.ZEnv, ExitCode] = myAppLogic.exitCode

  val myAppLogic = for {
    _ <- console.putStrLn("Hello! What is your name?")
    name <- console.getStrLn
    _ <- console.putStrLn(s"Hello, ${name}, welcome to ZIO!")
  } yield ()
}
