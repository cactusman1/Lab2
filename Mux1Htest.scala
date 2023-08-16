package practice


import chisel3.tester._
import chisel3._
import org.scalatest.FreeSpec
import chisel3.experimental.BundleLiterals._ 

class mux1HTest extends FreeSpec with ChiselScalatestTester{
    "Chisel Tester File" in{
        test (new mux1H) { a =>
        a.io.in_A.poke(0.B)
        a.io.in_B.poke(0.B)
        a.io.in_C.poke(0.B)
        a.io.in_D.poke(0.B)
        a.io.sel.poke("b1000".U)
        a.clock.step(1)
        a.io.out.expect(1.B)
        
    }
}
}