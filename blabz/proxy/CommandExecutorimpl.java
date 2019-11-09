package com.blabz.proxy;

import java.io.IOException;

public class CommandExecutorimpl implements CommandExecutor
{

	@Override
	public void runCommand(String cmd) throws IOException {
		// TODO Auto-generated method stub
		Runtime.getRuntime().exec(cmd);
		System.out.println(" "+cmd+" command Executed ");
	}
	
}
