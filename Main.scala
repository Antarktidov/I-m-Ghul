object Ghul {
   def main(args: Array[String]): Unit = {
      var a = 1000;
      var b = 7;
      while( a > b ){
        var c = a - b;
         println(s"$a - $b = $c");
         a = c;
         Thread.sleep(100)
      }
      println("I'm Ghul!");
   }
}
