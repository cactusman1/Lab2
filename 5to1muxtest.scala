package practice


import chisel3.tester._
import chisel3._
import org.scalatest._
import chisel3.experimental.BundleLiterals._

class mux5to1test extends FreeSpec with ChiselScalatestTester{
    "Chisel Tester File" in{
        test(new mux5to1) { a =>
        a.io.sel.poke(1.U) 
        // a.io.s1.poke(1.B) 
        // a.io.s2.poke(1.B)

        a.io.in0.poke(0.U)
        a.io.in1.poke(8.U)
        a.io.in2.poke(16.U)
        a.io.in3.poke(24.U)
        a.io.in4.poke(32.U)
        
        a.clock.step(3)
        a.io.out.expect(8.U)
         

        }
    }
}