package com.example.watabe

import org.scalatest.funsuite.AnyFunSuite

import scala.collection.mutable.ArrayBuffer

class P269Spec extends AnyFunSuite {
  test("invoke") {
    val n = 4
    val ass = Array(
      Array(1, 2, 2, 4),
      Array(2, 1, 4),
      Array(3, 0),
      Array(4, 1, 3),
    )
    val expected = ArrayBuffer(
      ArrayBuffer(0, 1, 0, 1),
      ArrayBuffer(0, 0, 0, 1),
      ArrayBuffer(0, 0, 0, 0),
      ArrayBuffer(0, 0, 1, 0),
    )
    assert(P269.invoke(n, ass) == expected)
  }
}