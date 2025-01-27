import java.math.BigInteger;

public class Divisible
{
    public static void main(String[] args)
    {
        BigInteger maxValue = BigInteger.valueOf(Long.MAX_VALUE);
        BigInteger number = maxValue.add(BigInteger.ONE);
        int count = 0;

        while (count < 10)
        {
            if (number.mod(BigInteger.valueOf(5)).equals(BigInteger.ZERO) ||
                    number.mod(BigInteger.valueOf(6)).equals(BigInteger.ZERO))
            {
                System.out.println(number);
                count++;
            }
            number = number.add(BigInteger.ONE);
        }
    }
}




















