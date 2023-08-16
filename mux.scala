 package practice 

import chisel3._
import chisel3.util._

class Mux_2to1_IO extends Module {
    val io = IO( new Bundle {
val in_A = Input ( Bool () )
val in_B = Input ( Bool () )
val sel = Input ( Bool () )
val out = Output ( Bool () )
})
  io.out := (io.in_A & (~io.sel)) |  (io.in_B & io.sel)
}