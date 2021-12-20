package demoadapter;

import java.math.BigDecimal;

public class Divider implements DivideInterface
{
    DivideAdapter divide_Adapter;
    Multiplier multiplier;
    BigDecimal number1 = new BigDecimal("8")
              ,number2 = new BigDecimal("2")
              ,number3 = number1.divide(number2);

    @Override
    public BigDecimal Divide(BigDecimal number1, BigDecimal number2, String TypeOfOperations) 
    {
        if(TypeOfOperations.equalsIgnoreCase("*"))
        {
            System.out.print("Multiply Operation : ");
            return divide_Adapter.Divide(number1 , number2 , TypeOfOperations);
        }
        else if(TypeOfOperations.equalsIgnoreCase("/"))
        {
            System.out.print("Divide Operation : ");
            return number3;
        }
        return null;
    }
    
}
