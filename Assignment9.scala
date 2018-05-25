object Assignment9{
	def main(args: Array[String]){
	var i:Int = 0;
	var n:Int = 0 ;
	var k:Int = 0;
	print("Enter length of array");
	n = Console.readInt();
    var arr = new Array[Int](n);
    for( i <- 0 until n) {
    	arr(i) = Console.readInt();
    }
    for( i <- 0 until n) {
    	print(arr(i)+"\t");
	}
	print("Enter index of array to be deleted");
	n = Console.readInt();
	for(i <- 0 until n)
	{
		if(i == k)
		{
			for( i <- k until n) {
				arr(i) = arr(i+1);	
			}
			arr(n-1) = 0;
		}
	}
}
}