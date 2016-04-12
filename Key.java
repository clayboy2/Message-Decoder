import java.util.Scanner;

public class Key
{
  private String key="";
  
  public Key(String key)
  {
    this.key=key;
  }
  
  public String messageEncode(String phrase)
  {
    int curr = 0;
    String toReturn="";
    for (int c=0;c<phrase.length();c++)
    {
      if (curr==0||curr%2==0)
      {
        char tmp = phrase.charAt(c);
        tmp =(char)((int)tmp+(int)key.charAt(curr));
        toReturn+=tmp;
      }
      else
      {
        char tmp = phrase.charAt(c);
        tmp =(char)((int)tmp-(int)key.charAt(curr));
        toReturn+=tmp;
      }
      if (curr==key.length())
        curr=0;
    }
    return toReturn;
  }
  
  public String messageDecode(String phrase)
  {
    int curr = 0;
    String toReturn="";
    for (int c=0;c<phrase.length();c++)
    {
      if (curr==0||curr%2==0)
      {
        char tmp = phrase.charAt(c);
        tmp =(char)((int)tmp-(int)key.charAt(curr));
        toReturn+=tmp;
      }
      else
      {
        char tmp = phrase.charAt(c);
        tmp=(char)((int)tmp+(int)key.charAt(curr));
        toReturn+=tmp;
      }
      if (curr==key.length())
        curr=0;
    }
    return toReturn;
  }
}
  
  
  
  
  
  
  