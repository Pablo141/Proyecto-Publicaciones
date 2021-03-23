package publicacion;
import java.util.*;
public class Principal {
   public static void main(String[] args) {
      int ctrlpub = 0;
      Scanner leer = new Scanner(System.in);
      Object publicaciones [] = new Object[10]; //reservamos espacio
      int opc1, opc2;
      boolean control = true;
      while(control){
         //Menu principal
         System.out.println("--Menu--");
         System.out.println("--Elija una opcion--");
         System.out.println("[1] Dar de alta");
         System.out.println("[2] Mostrar contenido");
         System.out.println("[3] Salir");
         opc1 = leer.nextInt();
         switch(opc1){
            case 1:
               //Menu secundario
               opc2 = 0;
               System.out.println("--Menu alta--");
               System.out.println("--Elija una opcion--");
               System.out.println("[1] Dar de alta revista");
               System.out.println("[2] Dar de alta periodico");
               System.out.println("[3] Dar de alta libro");
               opc2 = leer.nextInt();
               switch(opc2){
                  case 1:
                     Revista revista = new Revista();
                     leer.nextLine();//limpiamos el buffer
	        		      System.out.println("Ingrese el ISSN");
	        		      revista.setISSN(leer.nextLine());
	        		      System.out.println("Ingrese el titulo");
	        		      revista.setTitulo(leer.nextLine());
	        		      System.out.println("Ingrese el precio");
	        		      revista.setPrecio(leer.nextDouble());
	        		      System.out.println("Ingrese el numero");
	        		      revista.setNumero(leer.nextInt());
	        		      System.out.println("Ingrese el anio");
	        		      revista.setAnio(leer.nextInt());
	        		      System.out.println("Ingrese el numero de paginas");
	        		      revista.setNumpag(leer.nextInt());
                     
	        		      publicaciones[ctrlpub] = revista;
                     
                     ctrlpub++;
                  break;
                  case 2:
                     leer.nextLine();//limpiamos el buffer
	        		      Periodico periodico = new Periodico();
	        		      System.out.println("Ingrese el titulo");
	        		      periodico.setTitulo(leer.nextLine());
	        		      System.out.println("Ingrese el precio");
	        		      periodico.setPrecio(leer.nextDouble());
	        		      System.out.println("Ingrese el numero de paginas");
	        		      periodico.setNumpag(leer.nextInt());
	        		      leer.nextLine();
	        		      System.out.println("Ingrese las secciones");
	        		      periodico.setSecciones(leer.nextLine());
	        		      System.out.println("Ingrese el editor");
	        		      periodico.setEditor(leer.nextLine());
                     
	        		      publicaciones[ctrlpub] = periodico;
	        		      
                     ctrlpub++;
                  break;
                  case 3:
                     Libro libro = new Libro();
	        		      leer.nextLine();//limpiamos el buffer
	        		      System.out.println("Ingrese el titulo");
	        		      libro.setTitulo(leer.nextLine());
	        		      System.out.println("Ingrese el precio");
	        		      libro.setPrecio(leer.nextDouble());
	        		      System.out.println("Ingrese el numero de paginas ");
	        		      libro.setNumpag(leer.nextInt());
	        		      System.out.println("Ingrese el ISBN");
	        		      leer.nextLine();
	        		      libro.setISBN(leer.nextLine());
	        		      System.out.println("Ingrese la edicion");
	        		      libro.setEdicion(leer.nextLine());
	        		      System.out.println("Ingrese el autor");
	        		      libro.setAutor(leer.nextLine());
	        		      
                     publicaciones[ctrlpub] = libro;
	        		      
                     ctrlpub++;
                  break;
               }
            break;
            case 2:
               for(int x = 0; x < ctrlpub; x++){
                  if(publicaciones[x] instanceof Revista){
                     Revista revista = new Revista();
                     revista = (Revista)publicaciones[x];
                     System.out.printf("\nRevista \n");
                     System.out.println("Titulo:" + revista.getTitulo());
                     System.out.println("ISSN: "+ revista.getISSN());
                  }
                  else
                     if(publicaciones[x] instanceof Libro){
                        Libro libro = new Libro();
                        libro = (Libro)publicaciones[x];
                        System.out.printf("\nLibro \n");
                        System.out.println("Titulo: " + libro.getTitulo());
                        System.out.println("ISBN: " + libro.getISBN());
                     }
                     else
                        if(publicaciones[x] instanceof Periodico){
                           Periodico periodico = new Periodico();
	                	      periodico = (Periodico)publicaciones[x];
	                	      System.out.printf("\nPeriodico \n");
	                	      System.out.println("Titulo: " + periodico.getTitulo());
		                     System.out.println("Secciones: " + periodico.getSecciones());
                        }
               }
               break;//Mostrar contenido
               case 3:
                  control = false;
               break;//Salir
         }
      }
   }
}