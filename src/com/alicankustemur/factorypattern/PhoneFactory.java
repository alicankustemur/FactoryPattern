package com.alicankustemur.factorypattern;

public class PhoneFactory
{
	public static Phone createPhone(String model)
	{
		if (model.equals("iPhone"))
		{
			return new iPhone();
		}
		else if (model.equals("Samsung"))
		{
			return new Samsung();
		}
		else
		{
			throw new RuntimeException("Cep Telefonu Tipi Belirsiz.");
		}
	}
}
