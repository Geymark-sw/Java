
public class Main extends MyThread {

	public static void main(String[] args) {
		
		/*
		 * Supponiamo di avere un DB con una tabella (Unique) 
         * che contiene un solo record di un solo 
         * attributo (ID) numerico.
         * Quello che dovete fare è una procedura che
         * 1) accede alla tabella per leggere ID
         * 2) incrementare ID di 1
         * 3) aggiornare la tabella
         * 4) stampare l'ID
         * NB: dovete assicurarvi che anche in caso di 
         * accessi multipli al DB, i numeri stampati siano 
         * sempre unici, senza cioè duplicazioni.
         * 
         * Es.: begin transaction 
         * row = select id from Unique;
         * print(row);
         * row=row + 1;
         * update Unique set id = $row;
         * commit
         * Se qualcosa va male:
         * rollback
		 */
		
//		MyThread th1 = new MyThread(1000);
//        th1.start();
//
//        MyThread th2 = new MyThread(1000);
//        th2.start();
        
        // System.exit(0);
        
        GenID id1 = new GenID();
        id1.start();
        
        GenID id2 = new GenID();
        id2.start();
        
	}

}