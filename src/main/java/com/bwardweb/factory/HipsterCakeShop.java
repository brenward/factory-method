package com.bwardweb.factory;

import com.bwardweb.factory.cake.Cake;
import com.bwardweb.factory.cake.hipster.HipsterCake;
import com.bwardweb.factory.cake.hipster.HipsterChocolateCake;
import com.bwardweb.factory.cake.hipster.HipsterCoffeeCake;

public class HipsterCakeShop extends CakeShop{

	@Override
	protected Cake createCake(String type) {
		Cake cake = null;
		if(type.equals("chocolate")){
			cake = new HipsterChocolateCake();
		}else if(type.equals("coffee")){
			cake = new HipsterCoffeeCake();
		}else{
			cake = new HipsterCake();
		}
		return cake;
	}

}
