import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.TestCase;

public class HashTableTest extends TestCase {

	HashTable base = new HashTable();					 //objetos de prueba
	@Test
	
	public void testAdd(){
        System.out.println("add");
        String palabra = "A";							  //parametros
        String tipo = "";
        Word word = new Word(palabra,tipo);				  //se crea al objeto
        base.add(word);									  //se agrega el objeto en la tabla
        assertEquals(palabra,base.getx(word).getWord());  //se compara que lo que se metio es igual a lo que se saco 
    }
	
	public void testgetx(){
        System.out.println("getx");
        String palabra = "B";
        String tipo = " ";
        Word word = new Word(palabra,tipo);
        base.add(word);
        assertEquals(base.getx(word).getWord(),palabra);
    }

}
