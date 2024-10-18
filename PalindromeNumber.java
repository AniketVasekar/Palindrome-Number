public class PalindromeNumber {
    public static void main(String[] args) {
        int num = 121;
        int dup = num;
        int rev = 0;

        int rem = num % 10; // rem(4)=234%10
        rev = (rev * 10) + rem; // rev(4)=(0*10)+4
        num = num / 10; // num(23)=234/10

        rem = num % 10; // rem(4)=23%10
        rev = (rev * 10) + rem; // rev(43)=(4*10)+3
        num = num / 10; // num(2)=23/10

        rem = num % 10; // rem(2)=2%10
        rev = (rev * 10) + rem; // rev(432)=(43*10)+2

        if (rev == dup) {
            System.out.println("the Given Number is " + dup + " Palindrome number");

        } else {
            System.out.println("Reverse of number " + dup + " is :" + rev);

        }
    }

}
