public class Phrase 
{
  private String phrase="";
  
  public Phrase(String phrase)
  {
    this.phrase = phrase;
  }
  
  public void encode(String key)
  {
    Key myKey = new Key(key);
    phrase=myKey.messageEncode(phrase);
  }
  
  public void decode(String key)
  {
    Key myKey = new Key(key);
    phrase = myKey.messageDecode(phrase);
  }
  
  public void displayPhrase()
  {
    System.out.println(phrase);
  }
  
  public String getPhrase()
  {
    return phrase;
  }
}