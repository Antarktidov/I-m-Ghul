fun main (args: Array<String>) {
    var a = 1000
    var b = 7
    while (a > b) {
        var c = a - b
        println("$a - $b =  $c")
        a = c
        Thread.sleep(100L)
    }
    println("I'm Ghul!")
}
