object MainObject{
    def main(args: Array[String]){
        var num, reversenum = 0;
        println("Enter a number"); 
        num = Console.readInt();
        printf("Reverse of no. is %d\n", reverseDigits(num)); 
    }
    def reverseDigits = {
        var rev_num = 0;
        while(num > 0)
        {
            rev_num = rev_num*10 + num%10;
            num = num/10;
        }
        return rev_num;
    }
}