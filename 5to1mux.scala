package practice

import chisel3._
import chisel3.util._

class mux5to1 extends Module {
    val io = IO(new Bundle{
        val sel = Input(UInt(3.W))
         
        val in0 = Input(UInt(32.W))
        val in1 = Input(UInt(32.W))
        val in2 = Input(UInt(32.W))
        val in3 = Input(UInt(32.W))
        val in4 = Input(UInt(32.W))
        

        val out = Output(UInt())
    })

    io.out := MuxLookup(io.sel,false.B , Array(
        (0.U) -> io.in0,
        (1.U) -> io.in1,
        (2.U) -> io.in2,
        (3.U) -> io.in3,
        (4.U) -> io.in4,
        (5.U) -> io.in4,
        (6.U) -> io.in4,
        (7.U) -> io.in4
    ))
}

