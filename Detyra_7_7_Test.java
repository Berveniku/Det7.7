import javax.swing.*;
public class Detyra_7_7_Test
{
public static void main (String [] args)
{
String s = JOptionPane.showInputDialog("Shkruaj nje fjale");
Detyra_7_7 obj = new Detyra_7_7();
System.out.println(obj.duplicate(s));
System.out.println();
for ( int i = 0; i <= 3; i = i + 1 )
{for ( int j = 0; j <= i; j = j + 1 )
{ System.out.print(i +""+ j+" "); }
System.out.println();
}
System.out.println();
  for ( int k = 0; k <= 3; k = k + 1 )
{ for ( int l = 3; l >= k; l = l - 1 )
{ System.out.print(k + " " + l + "   "); }
System.out.println();
System.out.println();
    }
}

}