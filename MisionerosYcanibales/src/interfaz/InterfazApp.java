

package interfaz;

import gfutria.SearchStateSpaces;
import java.util.ArrayList;
import mundo.MisionerosYcanibales;

public class InterfazApp
{
    public static void main(String[] args)
    {
      MisionerosYcanibales misionerosycanibales;
      ArrayList <String> lista;
      SearchStateSpaces busqueda;
     
      //System.out.println("H2OS3...");        
             
      misionerosycanibales = new MisionerosYcanibales(3, 3, 1, 0, 0); /*Estado inicial*/
      //System.out.println("A0 : : 33100"); /*Estado inicial*/
     
      busqueda = new SearchStateSpaces("00033", misionerosycanibales, 5); /*Resultado*/
      lista = busqueda.solve();
     
      System.out.println("Movimientos: " + lista.size()); /*contador de pasos y tamaño del arreglo */
      if (lista.size() > 0)
      { for (int i=0; i<lista.size(); i++)
             System.out.println("estado " + lista.get(i));
      }
    }
}


