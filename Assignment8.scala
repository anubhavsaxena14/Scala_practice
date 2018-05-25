import util.control.Breaks._
object Assignment8{
    def main(args: Array[String]){
        var arr = new Array[Int](3);
        arr(0) = 11; arr(1) = 11; arr(2) = 11; arr(3) = 11; arr(4) = 11; arr(5) = 11;
        var i:Int = 0;
        var n = 6;
        var j = n-1;
        breakable
        {
            for( i <- 0 to n/2) 
            {
                j = j-1;
                arr(i) = arr(n-i)
                if(i>=j)
                {
                    break;
                }   
            }
        }
        printf("Reverse of Array"); 
        for(i <- arr)
        {
            println(i);
        }
    }
}