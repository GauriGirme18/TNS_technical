package Day3;
import java.util.*;

public class tax_calculate {
		
		public void calculateTax(Person p)
		{
			if(p.getAge()>65 || p.getGender().equalsIgnoreCase("female"))	//it ignore the case letters like it only matches leeter of word 
				//e.g. feMale,FemAle like that then it will ignore such cases
			{
				p.setTax(0);
				System.out.println("Tax not applicable...");
			}
			else
			{
				if(p.getIncome()<=160000)
				{
					p.setTax(0);
				}
				else if(p.getIncome() >160000 && p.getIncome()<=500000)
				{
					p.setTax((p.getIncome()-160000)* 10/100);
				}
				else if(p.getIncome() >500000 && p.getIncome()<=800000)
				{
					p.setTax((p.getIncome()-500000)* 20/100 + 34000);
				}
				else
				{
					p.setTax((p.getIncome()-800000)* 30/100 + 94000);
				}
			}
		}

}
