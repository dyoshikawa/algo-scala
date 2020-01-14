package com.example.watabe

import scala.collection.mutable.ArrayBuffer

object P269 {
  def invoke(n: Int, ass: Array[Array[Int]]): ArrayBuffer[ArrayBuffer[Int]] = {
    val res = ArrayBuffer.empty[Int]
    ass.foreach { as =>
      as.zipWithIndex.foreach { case (v: Int, i: Int) =>
        i match {
          case 0 => ()
          case 1 => ()
          case _ => res += v
        }
      }
    }
    ArrayBuffer(ArrayBuffer(1, 2))
  }
}