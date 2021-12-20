package demoadapter;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Multiplier implements MultiplyInterface
{
    BigDecimal number1 = new BigDecimal("6")
              ,number2 = new BigDecimal("3")
              ,number3 = number1.multiply(number2);

    @Override
    public BigDecimal Multiply(BigDecimal number1, BigDecimal number2, String TypeOfOperation)
    { 
        return number3;
    }
    
}
