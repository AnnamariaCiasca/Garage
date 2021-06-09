package protom.com;

public class Veicolo {
	    
	    protected String targa;
	    protected String marca;
	    protected String modello;
	    protected Alimentazione tipo_alimentazione;


	 
	    public Veicolo(String targa, String marca, String modello, Alimentazione tipo_alimentazione) {  //Costruttore
	    	this.targa = targa;
	    	this.marca = marca;
	        this.modello = modello;
	        this.tipo_alimentazione = tipo_alimentazione;
	      
	    }
	    
	    
	    @Override
	    public String toString() {
	    	 return getClass().getSimpleName() + " -> Targa = " + targa+  " | Marca = " + marca + " | Modello = " + modello + " | Carburante = " + tipo_alimentazione;
	    }
	    
	  
	    
	    public String getTarga() {
	    	return targa;
	       }
	    	
	    public String getMarca() { 
	    	return marca; 
	    	}
	    public String getModello() {
	    	return modello; 
	    	}
	    public Alimentazione getTipo_alimentazione() 
	    { return tipo_alimentazione; 
	    }
	    
	
	    
	}


