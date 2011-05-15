package com.challengeandresponse.imoperator.experimental;

import java.lang.reflect.Field;

public class Test {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		try {
			Class c = Class.forName("org.jivesoftware.smack.packet.Packet");

			Field[] f = c.getDeclaredFields();

			for (int i = 0; i < f.length; i++)
				System.out.println(i+" "+f[i].getName());

		}
		catch (ClassNotFoundException cnfe) {
			System.out.println("Exception: "+cnfe.getMessage());
		}
	}



}
