// package practice


// import chisel3.tester._
// import chisel3._
// import org.scalatest._
// import chisel3.experimental.BundleLiterals._

// class MuxLookupTest extends FreeSpec with ChiselScalatestTester{
//     "Chisel Tester File" in{
//         test(new muxlookup) { a =>
//         a.io.sel.poke(5.U) 
//         // a.io.s1.poke(1.B) 
//         // a.io.s2.poke(1.B)

//         a.io.in0.poke(1.B)
//         a.io.in1.poke(0.B)
//         a.io.in2.poke(1.B)
//         a.io.in3.poke(0.B)
//         a.io.in4.poke(1.B)
//         a.io.in5.poke(0.B)
//         a.io.in6.poke(1.B)
//         a.io.in7.poke(0.B)
//         a.clock.step(1)
//         a.io.out.expect(0.B)
         

//         }
//     }
// }