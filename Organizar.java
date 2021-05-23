
public class Organizar
{ 
    private Double [] notas;
    private int pv;
    private int cantidad;
    public Organizar (int cantidadAlumnos)
    {
      cantidad = cantidadAlumnos;
      notas = new Double [cantidadAlumnos];
      pv = 0;
   }
   // Añadir Notas
    public void anadirNota (double nota)
   {
       notas[pv] = nota ;
       pv ++;      
   }
   // sacar el promedio de todas las notas
     public void promedio ()
   {
      double prom = 0;
      for (double d : notas)
      {
          prom = prom + d;
      }
      System.out.println ( "El promedio de las notas es: "+ (prom/notas.length));
   }
   // sacar el promedio de las notas aprobadas (>51)
   public void promApro ()
   {  double promApro = 0;
       double j = 0;
       for (int i = 0; i < notas.length ;i++){
       if (notas[i]>= 51)
       {
          promApro = notas [i]+ promApro;
          j++;
       }
     }
     System.out.println ("El promedio de las notas aprobadas: " + (promApro/j));
    }
   //indicar la cantidad de reprobados.
    public void cantidadReprobados ()
   {
      int contadorRepro = 0;
      for (int i = 0; i < notas.length;i++){
        if (notas [i] < 51){
           contadorRepro++;
         }  
        }
      System.out.println ("La cantidad de Reprobados son: "+ contadorRepro);
    }
   //indicar la cantidad de aprobados
    public void cantidadAprobados()
   {
      int contadorApro = 0;
      for (int i = 0; i < notas.length;i++){
        if (notas [i] >= 51){
           contadorApro++;
         }  
        }
      System.out.println ("La cantidad de Aprobados son: "+ contadorApro);
    }
    //indicar la nota mas alta
   public void notaAlta (){
      double notaAlta = 0;
      for (int i = 0; i < notas.length; i++){
        if (notas[i]>notaAlta)
        {
            notaAlta= notas[i];
        }
      }
       System.out.println ("La nota mas alta es: "+ notaAlta);
    }
}


