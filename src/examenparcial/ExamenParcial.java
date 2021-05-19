
package examenparcial;

public class ExamenParcial {
   
    private static String nombre;
    private static String descripción;
    private static String habilidades;
    private static Integer experiencia;
    private static String nivel;
    
    public ExamenParcial (String nombre, String descripción, String habilidades, Integer experiencia, String nivel){
     ExamenParcial.nombre = nombre;
     ExamenParcial.descripción = descripción;
     ExamenParcial.habilidades = habilidades;
     ExamenParcial.experiencia = experiencia;
     ExamenParcial.nivel = nivel;
}
    
    public static int sueldoTrab(){
        int sueldo = 0;
        if (nivel.equalsIgnoreCase("jr")) {
            sueldo = 1000 * (1 + (experiencia / 10));
        } else if (nivel.equalsIgnoreCase("sr")) {
            sueldo = 1500 * (1 + (experiencia / 10));
        } else if (nivel.equalsIgnoreCase("Leader")){
            sueldo = 2000 * (1 + (experiencia / 10));
        } else if (nivel.equalsIgnoreCase("boss")) {
         sueldo = 2500 * (1 + (experiencia / 10));   
        }
        
        return sueldo;
    }

    public static void main(String[] args) {
              
        ExamenParcial Examen = new ExamenParcial("telecom" , "developer" , "designer" , 2, "Boss");
        System.out.println(sueldoTrab());
    }
    
}