package com.kaoruk

object Adder extends App {
  println("Hello World")

  def add(numbers: Int*): Int = {
    numbers.sum
  }
}
