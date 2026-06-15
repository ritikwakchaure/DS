public class ReverseInteger {
   public static  boolean  reverseInteger(int x){
     int orignal = x;
     int reverse = 0;
     if(x <0) {
        return false;

     }

     while ( x > 0){
        int digit = x % 10;
        reverse = reverse *  10 + digit;
        x= x / 10;
     }

     return orignal == reverse;
   }
    public static void main(String[] args) {
       boolean x = reverseInteger(121);
       System.out.println(x);
        boolean ans = reverseInteger(1221);
       System.out.println(ans);
    }

}
