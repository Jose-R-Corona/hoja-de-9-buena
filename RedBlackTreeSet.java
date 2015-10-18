public class RedBlackTreeSet implements WordSet
{
	private RedBlackBST<String, Word> RBT = new RedBlackBST<String,Word>();
	public void add(Word wordObject)
	{
		RBT.put(wordObject.getWord(),wordObject);
	}

	public Word getx(Word word) {
		return  (Word)RBT.get(word.getWord());
	}

}