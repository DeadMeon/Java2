import java.util.concurrent.TimeUnit

fun main() {
    timeuur(0,0, 1)
    timeuur(0 ,1, 0)
    timeuur(1,0 ,0)




}


private fun timeuur(a: Int,b: Int,c: Int){
    var h = a
    var m = b
    var s = c
    do
    {
        do
        {
            do
            {
                println("Time Left : "
                        + (if (h < 10){"0$h"} else {h})
                        + ":"
                        + (if (m < 10){"0$m"} else {m})
                        + ":"
                        + (if (s < 10){"0$s"} else {s})
                )
                TimeUnit.SECONDS.sleep(1)
            } while (s-- > 0)
            s = 59
        } while (m-- > 0)
        m = 59
    } while (h-- > 0)
    println("\tTime Out !\n")
}