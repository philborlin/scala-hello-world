package com.example

import org.scalatest.WordSpec

class HelloWorldSpec extends WordSpec {
  "A Hello World Program" when {
    "run" should {
      "return Hello World!" in {
        assert(HelloWorld() == "Hello World!")
      }
    }
  }
}