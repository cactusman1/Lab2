package practice


import chisel3.tester._
import chisel3._
import org.scalatest.FreeSpec
import chisel3.experimental.BundleLiterals._ 

class muxTest extends FreeSpec with ChiselScalatestTester{
    "Chisel Tester File" in{
        test (new Mux_2to1_IO) { a =>
        a.io.in_A.poke(1.B)
        a.io.in_B.poke(0.B)
        a.io.sel.poke(1.B)
        a.clock.step(1)
        a.io.out.expect(0.B)
        
    }
}
}

