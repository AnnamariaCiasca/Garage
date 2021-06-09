package protom.com;

public class Garage {
	 
	public Veicolo[] posti;    
   
 
    public Garage() {   //Costruttore
        posti = new Veicolo[15];
        
    }
    
    @Override
    public String toString(){
        String stampa = "\nGarage: ";
        for(int j = 0; j<15; j++){
        	
        	if(posti[j]!=null) {
            stampa += "\n Posto " + (j) + ": " + posti[j]; 
        }
        	else {
        		stampa += "\n Posto " + (j) + ": LIBERO ";
        	}
        	
        }
        return stampa;
    }
    
    public int aggiungiVeicolo(Veicolo v) {   //funzione per aggiungere veicoli nel garage, lo tratto come un riempimento di un vettore
    	
 
    	
    	Alimentazione carburante = v.getTipo_alimentazione();
    	
    	if(carburante.name() != "GPL") {
    		
    		  for(int p = 0; p<14; p++){
    	            if(posti[p]==null){
    	            
    	                posti[p] = v;
    	                
    	               return p;
    	                
    	                		
    	            }
    		  }
    		
    	} else {
    		  for(int p = 14; p<15; p++){
  	            if(posti[p]==null){
  	            
  	                posti[p] = v;
  	                
  	               return p;
  	                
  	                		
  	            }
  		  }
    		
    	}

        return -1;
    }
    
    public boolean controllo(Veicolo v) {    
       
    	for(int i = 0; i<15; i++){
            if(posti[i]!=null && v.getTarga().equals(posti[i].getTarga())){
                 System.out.println("Veicolo già presente");
                return true;
            }
    	}
        
        return false;

}
    
    public void aggiungiVeicolo(Veicolo v, int x) {  //x=posizione
            if(posti[x]==null){
                posti[x]=v;
                System.out.println("LIBERO");
            }
            else
            {
            	System.out.println("Occupato. Impossibile inserire.");
            	  
            }
        }
    
    public void rimuoviVeicolo(String targa) {
    	boolean check = false;
    	for(int i =0; i<15; i++) {
    		if(posti[i]!= null && posti[i].getTarga().equals(targa)) {
    			posti[i] = null;
    			
    			check = true;
    			
    		
    		}
    	}
    		
    		if(check) {
    			
    			System.out.println("Rimozione eseguita!");}
    		else {
    			System.out.println("ERRORE: La targa inserita non è presente nel garage!");
    		}
    	
    }
    
    
       
    }
    

