package practice 

import chisel3._
import chisel3.util._

class mux1H extends Module {
    val io = IO( new Bundle {
val in_A = Input ( Bool () )
val in_B = Input ( Bool () )
val in_C = Input ( Bool () )
val in_D = Input ( Bool () )
val sel = Input ( UInt (4.W) )
val out = Output ( Bool () )
})
  val Bsel = io.sel.asBools
  io.out := Mux1H(Bsel, Seq(io.in_A, io.in_B, io.in_C, io.in_D))
}