
public class CountN
{

    static int countSetBits(int n)
    {
        int count = 0;
        while (n > 0)
        {
            count += n & 1;
            n >>= 1;
        }
        return count;
    }

    
    public static void main(String args[]) {
        int T1 = 4;   /*    4 = 0000 0100 */
        int T2 = 1;   /*    1 = 0000 0001 */
        int T3 = 500086;    /* 1024 = 1000 0000 0000 */
        int T4 = 1000000;    
        
        System.out.println("Decimal = " +T1 );
        System.out.println("Binario = ");
        System.out.println(Integer.toBinaryString(T1));
        System.out.println("Set Bits = ");
        System.out.println(countSetBits(T1));
        
        System.out.println("Decimal = " +T2 );
        System.out.println("Binario = ");
        System.out.println(Integer.toBinaryString(T2));
        System.out.println("Set Bits = ");
        System.out.println(countSetBits(T2));

        System.out.println("Decimal = " +T3 );
        System.out.println("Binario = ");
        System.out.println(Integer.toBinaryString(T3));
        System.out.println("Set Bits = ");
        System.out.println(countSetBits(T3));

        System.out.println("Decimal = " +T4 );
        System.out.println("Binario = ");
        System.out.println(Integer.toBinaryString(T4));
        System.out.println("Set Bits = ");
        System.out.println(countSetBits(T4));
    }
}


 
 
// This code is contributed by Anshika Goyal.