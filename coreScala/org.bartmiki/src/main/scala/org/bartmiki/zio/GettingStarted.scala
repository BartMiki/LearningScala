package org.bartmiki.zio

import java.io.IOException

import zio.{App, ZIO}
import zio.console._
import zio._

object GettingStarted extends App {

  override def run(args: List[String]) = {
    logic.fold(_ => 1, _ => 0)
  }

  val logic = for {
    _ <- putStrLn("Hello! What is your name?")
    name <- getStrLn
    _ <- putStrLn(s"Hello, ${name.toInt}, welcome to ZIO!")
  } yield ()
}
