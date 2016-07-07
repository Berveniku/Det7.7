/**
@author Enes Berveniku              */

public class Detyra_7_7
{
public String duplicate(String s)
{ String pergjigjja = "";
for ( int i = 0; i != s.length(); i = i + 1 )
{ if ( newDuplicate(pergjigjja, s.charAt(i)) )
{ pergjigjja = pergjigjja + s.charAt(i); }
}
return pergjigjja;
}
 public boolean newDuplicate(String a, char c)
{
 boolean nukgjendet = true;
for ( int j = 0; j != a.length(); j = j + 1 )
{ nukgjendet = nukgjendet && (c != a.charAt(j)); }
 return nukgjendet;
}

}