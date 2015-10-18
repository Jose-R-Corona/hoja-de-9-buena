import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.TestCase;

public class TreeMapSetTest extends TestCase {

	TreeMapSet base = new TreeMapSet();					 //objeto deprueba
	@Test
	public void testAdd(){
        System.out.println("add");
        String palabra = "A";							  //parametros
        String tipo = "";
        Word word = new Word(palabra,tipo);				  //se crea al objeto que se va a insertar
        base.add(word);									  //se agrega el objeto en la tabla
        assertEquals(palabra,base.getx(word).getWord());  //se compara que lo que se metio es igual a lo que se saco 
    }
	@Test
	public void testgetx(){
        System.out.println("getx");
        String palabra = "B";
        String tipo = " ";
        Word word = new Word(palabra,tipo);
        base.add(word);
        assertEquals(base.getx(word).getWord(),palabra);
    }

}
