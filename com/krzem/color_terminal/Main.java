package com.krzem.color_terminal;



public class Main{
	public static void main(String[] args){
		new Main();
	}



	public Main(){
		Ansi.setup();
		// System.out.println(String.format(Ansi.TITLE,"HEY!"));
		System.out.println("\033[48;2;45;229;45m \033[0m   \033[48;2;45;229;45m \033[0m   \033[48;2;45;229;45m     \033[0m\n\033[48;2;45;229;45m \033[0m   \033[48;2;45;229;45m \033[0m     \033[48;2;45;229;45m \033[0m\n\033[48;2;45;229;45m    \033[48;2;45;229;45m \033[0m     \033[48;2;45;229;45m \033[0m\n\033[48;2;45;229;45m \033[0m   \033[48;2;45;229;45m \033[0m     \033[48;2;45;229;45m \033[0m\n\033[48;2;45;229;45m \033[0m   \033[48;2;45;229;45m \033[0m   \033[48;2;45;229;45m     \033[0m\n");
		System.out.print(Ansi.BACKGROUND.LIGHT_RED+Ansi.FOREGROUND.GREEN+"Hello, World!"+Ansi.RESET_ALL);
	}
}