package fitSteps.fit;

import java.util.List;

import com.fatsecret.platform.model.CompactFood;
import com.fatsecret.platform.services.FatsecretService;
import com.fatsecret.platform.services.Response;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	FatsecretService s = new FatsecretService("28fb488db3b64223943f27debb117faa",
				"39472f40f2cb4d63adfeac949f48dd19");
		Response<CompactFood> f1 = s.searchFoods("tuna");
		List<CompactFood> l = f1.getResults();
		String n = l.get(0).getName();
		String c = l.get(0).getDescription();
		c = c.substring(0, c.indexOf("| Fat"));
		System.out.println(n + " " + c);
    }
}
