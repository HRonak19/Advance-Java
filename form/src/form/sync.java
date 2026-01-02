
package form;

public class sync {
   
   synchronized void table(int n) {
       
       for (int i = 1; i <= 10; i++) {
           System.out.println(n+" * "+i+" = "+n*i);
       }
       
       try {
           Thread.sleep(1000);
       } catch (InterruptedException ex) {
           System.getLogger(sync.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
       }
   }
   public static void main(String args[]){
   
       sync s = new sync();
       
        Thread T = new Thread(){
            s.table(10);
        };
        T.start();
   }
}
