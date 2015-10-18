

import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class HashTable implements WordSet{
    
    private HashMap<String,Word> base;
	
	public HashTable()
	{
		base = new HashMap<String,Word>();
	}
	
	public Word getx(Word word)
	{
                return base.get(word.getWord());
	}
	
	public void add(Word wordObject)
	{       
		base.put(wordObject.getWord(),wordObject);
	}
    
}
