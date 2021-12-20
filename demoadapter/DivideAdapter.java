package demoadapter;

import java.math.BigDecimal;

public class DivideAdapter implements DivideInterface
{
    MultiplyInterface multiplyInterface;

    public DivideAdapter(String TypeOfOperations)
    {
        if(TypeOfOperations.equalsIgnoreCase("*"))
            multiplyInterface = new Multiplier();
    }
    @Override
    public BigDecimal Divide(BigDecimal number1, BigDecimal number2, String TypeOfOperations)
    {
        if(TypeOfOperations.equalsIgnoreCase("*"))
            return multiplyInterface.Multiply(number1, number2, TypeOfOperations);
        return null;
    }
    
    
}
