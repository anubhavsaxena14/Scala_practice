object Assignment5{
    def main(args: Array[String]){
        var n1:Int = 0; var n2:Int = 0; var d1:Int = 0; var d2:Int = 0;
        var i:Int = 1; var j:Int = 1;
        println("Enter a number"); 
        n1 = Console.readInt();
        println("Enter a number"); 
        n2 = Console.readInt();
        for(i <- 1 to (n1&n2))
        {
            if(n1%i == 0 & n2%i==0)
            {
                d1 = i;
            }
        }
        printf("Greatest Common Divisor of two numbers is %d\n", (d1)); 
    }
}
