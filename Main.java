package com.cosmo.everton.cronometro;



public class Main {
	public static void main(String[] args) throws InterruptedException {
		
		
		int hora=0;
		int minuto=0;
		int segundo=0;
		
		
		while(true) {
			System.out.printf("%d H %d M %d S\n", hora,minuto,segundo);
			
			++segundo;
		
			if(segundo == 60) {
				minuto++;
				segundo = 0;
			}
			if(minuto == 60) {
				hora++;
				minuto = 0;
				segundo =0;
			}
			Thread.sleep(1000);
			
			
		}
		
}
	
}
