# Garage

PANORAMICA
Creare il progetto Garage che gestisca appunto un garage per tre tipi di veicoli: automobili, furgoni e
moto. Il programma dovrà essere interattivo con un menù e si presuppone che l’utente utilizzatore
dell’applicativo sia il gestore del garage.




SPECIFICHE
Di seguito tutti i requisiti che l’applicativo deve rispettare:
● il sistema deve avere un numero di posti fisso e configurabile tramite una costante in una
interfaccia
● il sistema deve poter stampare la situazione corrente visualizzando:
   ○ numero di posto
   ○ se il posto è libero la scritta “LIBERO”
   ○ altrimenti una stampa del dettaglio del veicolo
● il sistema deve poter inserire un nuovo veicolo inserendo targa, marca, modello e tipo di
alimentazione (benzina, diesel o GPL)
● il sistema deve controllare che non sia inserito un veicolo già esistente (confronta due veicoli per
targa)
● i posti del garage destinati ad auto a GPL sono il 10% del totale e sono posizionati alla fine del
garage
● il sistema deve permettere di inserire il veicolo
   ○ nel caso in cui il veicolo sia alimentato a benzina o diesel si potrà scegliere liberamente il
     posto
   ○ nel caso in cui il posto scelto dall’utente sia occupato il sistema dovrà mostrare un
     messaggio e permettere all’utente di riprovare
○ nel caso l’auto sia a GPL sarà il sistema a assegnargli il primo posto libero nell’ultima
parte del garage, se c’è un posto libero in quella sezione, altrimenti lancia un messaggio
di errore
● il sistema deve permettere di inserire un veicolo nel primo posto libero disponibile
○ tra il primo 90% dei posti se l’alimentazione è a benzina o diesel
○ tra l’ultimo 10% dei posti se l’alimentazione è GPL
● il sistema deve mostrare il seguente menù:
○ stampa della situazione attuale dettagliata del garage
○ creazione nuovo veicolo inserendo targa, marca, modello e alimentazione
■ se il veicolo già esiste lanciare messaggio di errore e tornare al menu principale
■ se il parcheggio è pieno lanciare messaggio di avvertimento e tornare al menu
principale
■ se il veicolo è stato inserito correttamente chiedere all’utente se si vuole scegliere
il posto in cui parcheggiare o lasciarlo decidere al sistema
● nel caso in cui l’utente lasci decidere al sistema stampare il numero del
posto e tornare al menu principale
● nel caso in cui l’utente voglia decidere il numero del posto:
○ chiedere di inserire il numero del posto desiderato e controllare
se il posto scelto è libero e rientra nell’area destinata
all’alimentazione del veicolo
○ ripetere l’operazione se non si soddisfano le condizioni
○ rimozione di un veicolo dal parcheggio inserendo la targa
■ se la targa esiste messaggio di successo
■ altrimenti messaggio di errore e ritorno al menu principale
RICHIESTE IMPLEMENTATIVE
● Utilizzare correttamente incapsulamento, ereditarietà, classi astratte e interfacce pensando al riuso
del codice
● Utilizzare le enumerazioni per i tipi di alimentazione
