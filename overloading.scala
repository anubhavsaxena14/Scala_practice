class Calculator{
	def sum(a:Int, b:Int):Int = {
		return a+b;
	}
	def sum(a:Int, b:Int, c:Int):Int = {
		return a+b;
	}
	def sum(a:String, b:String):String = {
		return a+ " " +b;
	}

	
}
object Sample{
	def main(args: Array[String]){
		var obj = new Calculator();
		var x:Int = 0;
		var y:Int = 0;
		var s:String = " ";
		x = obj.sum(3,4);
		println("3 + 4 = " + x);
		y = obj.sum(3,4,5);
		println("3 + 4 + 5 = " + y);
		s = obj.sum("Hello","World");
		println("String is " + s);

	}
	
	
}