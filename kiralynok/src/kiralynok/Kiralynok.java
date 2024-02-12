
package kiralynok;

import model.Tabla;

public class Kiralynok {

   
    public static void main(String[] args) {
       
       Tabla t = new Tabla('*');
        char[][] matrix =t.getT();
        System.out.println(t.Megjelenit(matrix)); 
        t.Elhelyez(8, matrix);
        System.out.println(t.Megjelenit(matrix)); 
       
    }
    
}
