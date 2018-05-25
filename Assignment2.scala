object Assignment2{
    def main(args: Array[String]){
        var i:Int = 1; var max:Int = 0; var min:Int = 0;var count:Int = 1;var prev:Int = 0;var curr:Int = 0;
	printf("Enter a number\n");
	prev = Console.readInt();
	max=prev;
	min=prev;
	while(i < 10)
	{
		printf("Enter a Number\n");
		curr = Console.readInt();
		

		//printf("Prev is::%d\t",prev);
		//printf("Curr is::%d",curr);

		if(curr>max)
		{
			max=curr;
			//min=curr;
		}
		if(curr<min)
		{
			min=curr;
		}



		prev = curr;
		i = i+1;
	}

	printf("Max is %d\n", max);
	printf("Min is %d\n", min);
	/*if(count > max)
	{
		printf("count is %d\n", count);
	}
	else
	{
		printf("%d\n", max);
	}*/
    }
}    