package net.dev_bay.simplerecursion

import scala.annotation.tailrec

object MainScala extends App {

  def getPrintableRangeSimple(from: Int, to: Int): String = {
    if (from <= to) from + " " + getPrintableRangeSimple(from + 1, to)
    else ""
  }

  @tailrec
  def getPrintableRangeTail(from: Int, to: Int, acc: String): String = {
    if (from <= to) getPrintableRangeTail(from + 1, to, acc + " " + from)
    else acc.trim
  }

  println(getPrintableRangeSimple(0, 10))
  println(getPrintableRangeTail(0, 10, ""))

}
