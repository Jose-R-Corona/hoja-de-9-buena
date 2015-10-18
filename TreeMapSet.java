/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
import java.util.TreeMap;
public class TreeMapSet implements WordSet{
    
    private TreeMap<String,Word> base;
	
	public TreeMapSet()
	{
		base = new TreeMap<String,Word>();
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
