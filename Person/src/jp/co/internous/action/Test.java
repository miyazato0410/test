package jp.co.internous.action;

public class Test {
	public static void main(String[] args){
		Person taro=new Person();
			taro.name="山田太郎";
			taro.age=20;
		    taro.phoneNumber="090-1111-1111";
		    taro.address="○○@gmail.com";

		Person kimura=new Person();
			kimura.name="木村次郎";
			kimura.age=18;
			kimura.phoneNumber="090-2222-2222";
			kimura.address="○○@yahoo.co.jp";

		Person suzuki=new Person();
			suzuki.name="鈴木花子";
			suzuki.age=16;
            suzuki.phoneNumber="090-3333-3333";
            suzuki.address="○○@icloud.com";

        Robot aibo=new Robot();
        	aibo.name="aibo";

        Robot asimo=new Robot();
        	asimo.name="asimo";

        Robot pepper=new Robot();
        	pepper.name="pepper";

		System.out.println(taro.name);
		System.out.println(taro.age);
		System.out.println(taro.phoneNumber);
		System.out.println(taro.address);
		taro.talk();
		taro.walk();
		taro.run();

		System.out.println(kimura.name);
		System.out.println(kimura.age);
		System.out.println(kimura.phoneNumber);
		System.out.println(kimura.address);
		kimura.talk();
		kimura.walk();
		kimura.run();

		System.out.println(suzuki.name);
		System.out.println(suzuki.age);
		System.out.println(suzuki.phoneNumber);
		System.out.println(suzuki.address);
		suzuki.talk();
		suzuki.walk();
		suzuki.run();

		aibo.talk();
		aibo.walk();
		aibo.run();

		asimo.talk();
		asimo.walk();
		asimo.run();

		pepper.talk();
		pepper.walk();
		pepper.run();
	}
}
