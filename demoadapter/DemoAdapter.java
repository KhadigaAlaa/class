package demoadapter;
import java.math.BigDecimal;
public class DemoAdapter
{
    public static void main(String[] args)
    {
       Divider divider = new Divider();
       System.out.println(divider.Divide(BigDecimal.ZERO, BigDecimal.ZERO, "*"));
       System.out.println(divider.Divide(BigDecimal.ZERO, BigDecimal.ZERO, "/"));
       System.out.println(divider.Divide(BigDecimal.ZERO, BigDecimal.ZERO, "-"));
    }
}
