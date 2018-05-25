import util.control.Breaks._
object Assignment6{
    def main(args: Array[String]){
        var i:Int = 0;
        var j:Int=0;
        var count:Int=0;

        

            for(i <- 1 until 50)
            {
                count=0;
                //printf("I is::%d\n",i);
                breakable
                {
                    for(j<-2 to (i/2))
                    {

                        //printf("I is::%d\n",i);
                        if(i%j==0)
                        {
                            count=1;
                            break;
                        }

                    }

                }
                if(count==0)
                    printf("%d\n",i);

            }

        

        
    }
}