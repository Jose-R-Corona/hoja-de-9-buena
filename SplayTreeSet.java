
public class SplayTreeSet implements WordSet
{
	private SplayBST<String, Word> Splay = new SplayBST<String,Word>();
	
	public void add(Word wordObject)
	{
		Splay.put(wordObject.getWord(),wordObject);
	}

	public Word getx(Word word) {
		return  (Word)Splay.get(word.getWord());
	}

}