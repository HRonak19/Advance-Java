
package form;

class TH extends Thread {

    @Override
    synchronized public void run() {
     
        for (int i = 1; i <= 20; i++) {
            
           
            try {
                System.out.print(""+i);
                
                sleep(1000);
            } catch (InterruptedException ex) {
                System.getLogger(TH.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
            }
            
        }
        
    }
    
    
}

public class Thrd {

    public static void main(String[] args) {
     
           TH T1,T2,T3;
           
            T1 = new TH();
            T1.setPriority(Thread.MAX_PRIORITY);
            T1.setName("MAIN Thrade");
                T1.start();
              System.out.println("Live : "+T1.isAlive()+" name : "+T1.getName()+" Priority : "+T1.getPriority());
                
            T2 = new TH();
                T2.start();
              
            T3 = new TH();
                T3.start();
                
             
    }
}
