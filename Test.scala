class Point{
	var x:Int=0;
	var y:Int=0;

	def set(x:Int, y:Int){
		this.x=x;
		this.y=y;
	}

	def show(){
	 	println("x = "+ x+ " y = "+y);
	}
}

object Test
{
	def main(args:Array[String]){
		var p= new Point();
		p.set(3,4);
		p.show();
	}
}