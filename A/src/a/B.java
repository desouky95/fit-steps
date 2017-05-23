package a;

import java.util.List;

import com.fatsecret.platform.model.CompactFood;
import com.fatsecret.platform.services.FatsecretService;
import com.fatsecret.platform.services.Response;

public class B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FatsecretService s = new FatsecretService("28fb488db3b64223943f27debb117faa",
				"39472f40f2cb4d63adfeac949f48dd19");
		Response<CompactFood> f1 = s.searchFoods("tuna");
		List<CompactFood> l = f1.getResults();
		String n = l.get(0).getName();
		String c = l.get(0).getDescription();
		c = c.substring(0, c.indexOf("| Fat"));
		System.out.println(n + " " + c);
		/*
		 * for (CompactFood compactFood : l) {
		 * 
		 * }
		 */
		/*Response<CompactRecipe> r = s.searchRecipes("pizza");
		List<CompactRecipe> l1 = r.getResults();
		r.setMaxResults(1);
		r.setTotalResults(1);
		
		 * String a =l1.get(0).getUrl(); System.out.println(a); List<String> b =
		 * l1.get(0).getImages(); System.out.println(b.get(0));
		 
		for (CompactRecipe compatRecipe : l1) {
			System.out.println(compatRecipe.getName() + " " + compatRecipe.getUrl());
		}*/
	}

}
