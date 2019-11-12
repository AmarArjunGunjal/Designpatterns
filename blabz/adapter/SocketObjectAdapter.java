package com.blabz.adapter;

public class SocketObjectAdapter implements SocketAdapter {
	private Socket sock = new Socket();

	@Override
	public Volt get120Volt() {
		// TODO Auto-generated method stub

		return sock.getVolt();
	}

	@Override
	public Volt get12Volt() {
		Volt v = sock.getVolt();
		return convertVolt(v, 10);
	}

	private Volt convertVolt(Volt v, int i) {
		// TODO Auto-generated method stub
		return new Volt(v.getVolts() / i);
	}

	@Override
	public Volt get3Volt() {
		Volt v = sock.getVolt();
		return convertVolt(v, 40);
	}

}
