package com.blabz.singletone;

public class Utility {
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		EagerInitialization eager1 = EagerInitialization.getInstance();
		EagerInitialization eager2 = EagerInitialization.getInstance();
		System.out.println();

		System.out.println("value of eager 1" + eager1.hashCode());
		System.out.println("value of eager 2" + eager2.hashCode());
		System.out.println();

		StaticBlockSingletone staticBlockSingletone = StaticBlockSingletone.getInstance();
		StaticBlockSingletone staticBlockSingletone2 = StaticBlockSingletone.getInstance();
		System.out.println();

		System.out.println("Value of staticblocksingletone    " + staticBlockSingletone.getInstance());
		System.out.println("value of staticblocksingletone2   " + staticBlockSingletone2.getInstance());
		System.out.println(staticBlockSingletone.hashCode());
		System.out.println(staticBlockSingletone2.hashCode());
		System.out.println();

		LazyInitializedSingletone lazyInitializedSingletone = LazyInitializedSingletone.getInstance();
		LazyInitializedSingletone lazyInitializedSingletone2 = LazyInitializedSingletone.getInstance();
		System.out.println(lazyInitializedSingletone.hashCode());
		System.out.println(lazyInitializedSingletone2.hashCode());

		System.out.println();

		ThreadSafeSingletone threadSafeSingletone = ThreadSafeSingletone.getInstance();
		ThreadSafeSingletone threadSafeSingletone2 = ThreadSafeSingletone.getInstance();
		System.out.println();

		System.out.println("threadSafeSingletone    " + threadSafeSingletone.hashCode());
		System.out.println("threadSafeSingletone    " + threadSafeSingletone2.hashCode());
		System.out.println();
		BillPughSingleton billPughSingleton = BillPughSingleton.getInstance();
		BillPughSingleton billPughSingleton2 = BillPughSingleton.getInstance();
		System.out.println();
		System.out.println("billPughSingleton" + billPughSingleton.hashCode());
		System.out.println("billPughSingleton2" + billPughSingleton2.hashCode());

		EnumSingletone enumSingletone = EnumSingletone.INSTANCE;
		EnumSingletone enumSingletone2 = EnumSingletone.INSTANCE;

		System.out.println("enumsingletone" + enumSingletone.hashCode());
		System.out.println("enumsingletone" + enumSingletone2.hashCode());

		SerializedSingletone serializedSingletone = SerializedSingletone.getInstance();
		SerializedSingletone serializedSingletone2 = SerializedSingletone.getInstance();

		System.out.println(serializedSingletone.hashCode());
		System.out.println(serializedSingletone2.hashCode());
	}

}
