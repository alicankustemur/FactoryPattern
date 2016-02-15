package com.alicankustemur.factorypattern;

public class Test
{
	public static void main(String[] args)
	{

		Phone phone = PhoneFactory.createPhone("iPhone");
		System.out.println(phone.getPhoneBrand());

		Phone phone2 = PhoneFactory.createPhone("Samsung");
		System.out.println(phone2.getPhoneBrand());

		Phone phone3 = PhoneFactory.createPhone("");
		System.out.println(phone3.getPhoneBrand());
	}
}
