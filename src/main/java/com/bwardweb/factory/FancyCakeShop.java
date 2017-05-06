package com.bwardweb.factory;

import com.bwardweb.factory.cake.Cake;
import com.bwardweb.factory.cake.fancy.FancyCake;
import com.bwardweb.factory.cake.fancy.FancyChocolateCake;
import com.bwardweb.factory.cake.fancy.FancyCoffeeCake;

public class FancyCakeShop extends CakeShop{

	@Override
	protected Cake createCake(String type) {
		Cake cake = null;
		if(type.equals("chocolate")){
			cake = new FancyChocolateCake();
		}else if(type.equals("coffee")){
			cake = new FancyCoffeeCake();
		}else{
			cake = new FancyCake();
		}
		return cake;
	}

}
