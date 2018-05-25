object Assignment6{
    def main(args: Array[String]){
        var i:int = 0;
        for(i <- 1 until 50)
        {
            if((!(i%2))||(!(i%3))||(!(i%5))||(!(i%7)))
            {
            }
            else
            {
                printf("%d",i);
            }
        }
    }
}