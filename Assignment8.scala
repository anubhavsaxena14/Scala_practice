import util.control.Breaks._
object Assignment8{
    def main(args: Array[String]){
        var arr = new Array[Int](6);
        arr(0) = 11; arr(1) = 20; arr(2) = 30; arr(3) = 76; arr(4) = 89; arr(5) = 40;
        var i:Int = 0;
        var temp:Int = 0;
        var n = 6;
        breakable
        {
            while(i<(n/2)) 
            {
                temp = arr(i);
                arr(i) = arr(n-i-1);
                arr(n-i-1) = temp;
                i = i+1; 
            }
        }
        printf("Reverse of Array"); 
        for(i <- arr)
        {
            println(i);
        }
    }
}
