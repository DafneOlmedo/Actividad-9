import java.util.*; //Hacer visibles todos los miembros de la colección 
public class Main
{

  public static void main (String[]args)
  {
    Card card = new Card ();
    int palos = card.palo.length;
    int valores = card.valor.length;
    int colors = card.color.length;
    int N = palos * valores * colors;

      ArrayList < String > deck = new ArrayList < String > ();
    for (int i = 0; i < valores; i++)
      {
	for (int j = 0; j < palos; j++)
	  {
	    deck.add (card.palo[j] + ", Rojo , " + card.valor[i]);
	    deck.add (card.palo[j] + ", Negro , " + card.valor[i]);
	  }
      }

    Iterator < String > nombreIterator = deck.iterator ();
    while (nombreIterator.hasNext ())
      {
	String elemento = nombreIterator.next ();
	System.out.print (elemento + " / ");
      }
    suflle (deck);
    head (deck);
    pick (deck);
    hand (deck);
  }

  public static void suflle (ArrayList deck)  //Mezcla el Deck
  {
    ArrayList < String > values = deck;
    Collections.shuffle (values);
    System.out.println ("\n Se mezclC3 el Deck.");
    Iterator < String > nombreIterator2 = deck.iterator ();
    while (nombreIterator2.hasNext ())
      {
	String elemento = nombreIterator2.next ();
	System.out.print (elemento + " / ");
      }
  }

  public static void head (ArrayList deck) //Muestra la primera carta del deck, la carta deberá removerse del deck
  {
    System.out.println (deck.get (0));
    deck.remove (0);
    System.out.println ("Quedan " + deck.size () + " cartas \n");
  }

  public static void pick (ArrayList deck) //Selecciona una carta al azar, la carta deberá removerse del deck
  {
    Random aleatorio = new Random ();
    System.out.println (deck.get (aleatorio.nextInt (deck.size ())));
    deck.remove (aleatorio.nextInt (deck.size ()));
    System.out.println ("Quedan " + deck.size () + " cartas \n");
  }

  public static void hand (ArrayList deck) //regresará un arreglo de cinco cartas del deck, las cartas deberán removerse del deck. 
  {
    for (int i = 0; i <= 4; i++)
      {
	System.out.println (deck.get (i));
      }
    for (int i = 0; i <= 4; i++)
      {
	deck.remove (i);
      }
    System.out.println ("Quedan " + deck.size () + " cartas");
  }

}
