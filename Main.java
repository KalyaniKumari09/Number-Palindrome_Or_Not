class Main{
    public static void main(String args[]){
        int r,sum=0,num;
        int n=24;//It is the number variable to be checked for palindrome

        num=n;
        while(n>0){
            r=n%10;  //getting remainder
            sum=(sum*10)+r;
            n=n/10;
        }
        if(num==sum)
            System.out.println("palindrome number ");
        else
            System.out.println("not palindrome");
    }
}
