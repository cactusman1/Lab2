// package practice

// import chisel3._
// import chisel3.util._

// class muxlookup extends Module {
//     val io = IO(new Bundle{
//         val s0 = Input(Bool())
//         val s1 = Input(Bool())
//         val s2 = Input(Bool()) 
//         val in0 = Input(Bool())
//         val in1 = Input(Bool())
//         val in2 = Input(Bool())
//         val in3 = Input(Bool())
//         val in4 = Input(Bool())
//         val in5 = Input(Bool())
//         val in6 = Input(Bool())
//         val in7 = Input(Bool())

//         val out = Output(Bool())
//     })

//     io.out := MuxLookup(io.s0 ,false.B , Array(
//         (0.B) -> io.in0,
//         (1.B) -> io.in1,
//         MuxLookup(io.s1,false.B,Array(
//         (0.B) -> io.in2,
//         (1.B) -> io.in3,
//         ))
//         (0.B) -> io.in4,
//         (1.B) -> io.in5,
//         (0.B) -> io.in6,
//         (1.B) -> io.in7
//     ))
// }

