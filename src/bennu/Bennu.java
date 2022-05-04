
package bennu;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


/**
 *
 * @author felip
 */
public class Bennu {

    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList();
        String [] arreglo = null;
        int op;
        int cantidad;
        Numero numR = new Numero();
        int resp=0, cantidadN=0, numeroO=0;
        boolean contiene = false;
        int salir = 0;
        do{
            System.out.println("---Menu Principal---");
            System.out.println("1. Generar nuevo archivo");
            System.out.println("2. leer archivos generados");
            System.out.println("3. Ordenar archivos ");
            System.out.println("4. Leer archivo ordenado");
            System.out.println("5 Buscar numero en archivo");
            System.out.println("6. Salir.");
                Scanner dato = new Scanner(System.in);
                op = dato.nextInt();
                switch(op) {
                    case 1:
                        String ruta= "C:\\Users\\felip\\archivo.txt";
                        
                         Random random = new Random();
                        do{
                            System.out.println("Cuantos numero quiere generar?");
                            cantidadN = dato.nextInt();
                             StringBuilder sb = new StringBuilder();                      
                            try {
                                File file=new File(ruta);
                                file.delete();
                                file.createNewFile();
                                FileWriter fw = new FileWriter(file, true);
                                BufferedWriter bw = new BufferedWriter(fw);                            
                                
                                PrintWriter pw = new PrintWriter(fw);
                                for(int i = 1; i <= cantidadN; i++){
                                    int value = random.nextInt((cantidadN - 1) + 1) + 1;
                                    pw.print(value);
                                }      
                                bw.write(sb.toString());
                                bw.close();
                            } catch (Exception e){
                                e.printStackTrace();
                            }
                             salir=1;
                        }while (salir==0);
                        break;
                    case 2:
                        salir = 0;
                        do{
                            ruta = "C:\\Users\\felip\\archivo.txt";
                            try {
                                
                                FileReader leer = new FileReader(ruta);
                                BufferedReader br = new BufferedReader(leer);
                                String linea = br.readLine();
                                arreglo = linea.split("(?<=.)");
                                for(int i = 0; i < arreglo.length; i++) {
                                     System.out.println(arreglo[i]);
                                }
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                            salir = 1;
                        }while(salir==0);
                    break;
                    case 3: 
                        salir=0;
                        do{
                            System.out.println("¿Como quiere ordenar los numeros?");
                            System.out.println("1. Java Sort");
                            System.out.println("2. Java ParallelSort");
                            int cont = dato.nextInt();
                            if (cont ==1)  {                               
                                for(int i = 0; i < arreglo.length; i++){
                                    Arrays.sort(arreglo);
                                    System.out.println(arreglo[i]);     
                                } 
                            }
                            if (cont ==2)  {
                                for(int i = 0; i < arreglo.length; i++){
                                    Arrays.parallelSort(arreglo);
                                    System.out.println(arreglo[i]);
                                }
                            }
                            
                            salir = 1;
                        }while(salir==0);
                    break;
                    case 4: 
                        salir = 0;
                        do{
                            ruta = "C:\\Users\\felip\\archivo.txt";
                            try {
                                
                                FileReader leer = new FileReader(ruta);
                                BufferedReader br = new BufferedReader(leer);
                                String linea = br.readLine();
                                arreglo = linea.split("(?<=.)");
                                for(int i = 0; i < arreglo.length; i++) {
                                     System.out.println(arreglo[i]);
                                }
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                            salir = 1;
                        }while(salir==0);
                    break;
                    case 5:
                        salir = 0;
                        do{
                            ruta = "C:\\Users\\felip\\archivo.txt";
                          
                            try {
                                
                                FileReader leer = new FileReader(ruta);
                                BufferedReader br = new BufferedReader(leer);
                                String linea="";
                                System.out.print("Introduce numero a buscar: ");
                                numeroO = dato.nextInt();
                                 while ((linea= br.readLine())!=null){   
                                  if (linea.equals(numeroO)) {   //si la línea contiene el texto buscado se muestra por pantalla         
                                    System.out.println(linea);
                                    for(int i=0;i<2;i++) {
                                    System.out.println(br.readLine());
                                    } 
                                     contiene = true;   
                                     break;
                                 }
                                }
                                 if(!contiene) System.out.println("El numero no existe");
                                 System.out.println("¿Quieres introducir otro numero?");
                                 numeroO=dato.nextInt();
                                }catch(IOException e){
                                System.out.println("Error");
                                } 
                              salir = 1;
                              break;
                        }while(salir==0); 
                    case 6:
                        System.out.println("fin del Menú Principal"); 
                        System.exit(0);
                        break;
                }while(salir==0); 
         
        }while (resp==0);
    }
        
} 
