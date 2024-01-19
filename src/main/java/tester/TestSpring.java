package tester;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import dependent.ATMImpl;

public class TestSpring {

	public static void main(String[] args) {
		try(ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("bean-config.xml"))
		{
			System.out.println("SC up n running .....");
			//get ready made bean ref from SC
			ATMImpl atm1=ctx.getBean("my_atm", ATMImpl.class);
			//B.L
			atm1.deposit(12445);
			ATMImpl atm2=ctx.getBean("my_atm", ATMImpl.class);
			System.out.println(atm1==atm2);//true
					
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
