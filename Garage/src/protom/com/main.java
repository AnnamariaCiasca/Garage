package protom.com;
import java.util.Scanner;

public class main {
	
	private static Scanner scan = new Scanner(System.in);
    private static Garage garage = new Garage();
    private static int posto = 0;

	public static void main(String[] args) {
		

		Automobile auto1 = new Automobile("EXT565CE","Audi","A4", Alimentazione.DIESEL);	
		System.out.println("Automobile aggiunta al posto: " + garage.aggiungiVeicolo(auto1));
		
		//Automobile auto2 = new Automobile("EXT565CE","Alfa","Giulietta", Alimentazione.Benzina);	
		//System.out.println("Automobile aggiunta al posto: " + garage.aggiungiVeicolo(auto2));
		
		String targa = "";
		String marca = "";
		String modello = "";
		Alimentazione tipo_alimentazione;
		int s;
	
		Scanner input = new Scanner(System.in);
		
		int i,j=0; 
		
		
	
		do{ 
		
			   System.out.println("\n1) Situazione Garage");
			   
			   System.out.println("\n2) Inserisci veicolo");
			   
			   System.out.println("\n3) Rimuovi veicolo");
			   
			    
			   
			   System.out.println("\nInserire risposta");
			   
			   int risposta = input.nextInt();
			 
			  
			  switch(risposta) {

			      case 1: 
			      {
			    	  System.out.println(garage);
			   
			      break; }
			      
			      case 2:{
			      
			    	  System.out.println("Inserisci targa");
			    	  targa = scan.nextLine().toUpperCase();
			          System.out.println("Inserisci modello");
			          modello = scan.nextLine();
			    	  System.out.println("Inserisci marca");
			    	  marca = scan.nextLine();
			    	  System.out.println("Inserisci tipo di carburante");
			    	  tipo_alimentazione = Alimentazione.valueOf(scan.next().toUpperCase());
			    	  
			    	  
			    	  
			          System.out.println("Tipo di veicolo 1)Moto, 2)Auto, 3)Furgone: ");
			          int tipo = input.nextInt();
			      
			 
			    if(tipo == 1) {
			    	  
			    	  
			    	  Moto motocicletta = new Moto(targa, marca, modello, tipo_alimentazione);
			    	  
			       if(garage.controllo(motocicletta)) {
			      
			       } 
			       
			       else {
			    	   
			    	   if(tipo_alimentazione.name() != "GPL") {
			       
		              System.out.println("Scegliere posto? Inserisci 1 se sì, 2 se No ");   //ho provato a creare s come una stringa, ma non so perché non voleva funzionare
		              s = input.nextInt();
		              
		              if(s == 1 ) {
		              
		            scegliPosto(motocicletta);
			    }
		              else {
			              garage.aggiungiVeicolo(motocicletta);
				    	  System.out.println(garage);
			              }
			    	   }
		            	  
		              
		              else {
		              garage.aggiungiVeicolo(motocicletta);
			    	  System.out.println(garage);
		              }
			    }
			       
			    }
			    else if(tipo == 2) {
			    	  
			    	  
			    	  Automobile auto = new Automobile(targa, marca, modello, tipo_alimentazione);
			    	 
			    	    if(garage.controllo(auto)) {
						      
					       }
					       
					       else {
					    	   if(tipo_alimentazione.name() != "GPL") {

					    	   
					    	   System.out.println("Scegliere posto? Inserisci 1 se sì, 2 se No ");  
					              s = input.nextInt();
					              
					              if(s == 1 ) {
					       
				          scegliPosto(auto);
					    }
					              else {
						              garage.aggiungiVeicolo(auto);
							    	  System.out.println(garage);
						              }
					    	   }  else {
						              garage.aggiungiVeicolo(auto);
							    	  System.out.println(garage);
						              }
					       
					    }
			    }
			    
			    else if(tipo == 3) {
			    	  
			    	  Furgone furgone = new Furgone(targa, marca, modello, tipo_alimentazione);
			    
			    	   if(garage.controllo(furgone)) {
						      
				       }
				       
				       else {
				    	   if(tipo_alimentazione.name() != "GPL") {

				    	   
				    	   System.out.println("Scegliere posto? Inserisci 1 se Sì, 2 se No ");  
				              s = input.nextInt();
				              
				              if(s == 1 ) {
				       
			          scegliPosto(furgone);
				              }
				              else {
					              garage.aggiungiVeicolo(furgone);
						    	  System.out.println(garage);
					              }
			          
				    	   }else {
			              garage.aggiungiVeicolo(furgone);
				    	  System.out.println(garage);
			              }
				    }
				       
				    }
			    
			      
			      		
            break; }
			      
			      case 3: {
			    	  System.out.println("Inserire targa del veicolo da rimuovere");
			    	  targa = scan.nextLine().toUpperCase();
			    	  garage.rimuoviVeicolo(targa);
			    	  System.out.println(garage);
		
			      break;
			      }
			    	  
			      
			      
			 } 
			  j=0;
			  
			  for(i=0; i<15; i++) {
				  
				  if(garage.posti[i] != null ) {
					  j++;
				  }
				  
				  
			  }
			
			}while(j <15);
	
		
			  }
	
	public static void scegliPosto(Veicolo v){
        System.out.println("Inserire il numero di posto: ");
        posto = scan.nextInt();
        garage.aggiungiVeicolo(v, posto);
        System.out.println(garage);
    }
	
	}


