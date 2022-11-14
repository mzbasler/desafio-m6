import java.io.*;

/** Classe que permite fazer leitura de dados do teclado, com metodos estaticos.
 *  Iso significa que nao ha necessidade de instanciar um objeto para invocar os metodos.
 *  Sintaxe p/ chamada: <nome_da_classe>.<nome_do_metodo>(<mensagem de solicitacao>)
 *  Exemplo de chamada: Teclado.leInt("Digite um numero inteiro: ")
 */

public class Teclado
{
    private static String s;
    private static InputStreamReader i = new InputStreamReader (System.in);
    private static BufferedReader d = new BufferedReader(i);


    /**
     Le um inteiro, exibindo na tela uma mensagem de solicitacao.
     @return int
     */
    public static int leInt (String msg)
    {   int a = 0;
        System.out.print(msg);
        try
        {
            s = d.readLine();
            a = Integer.parseInt(s);
        }
        catch (IOException e)
        {
            System.out.println ("Erro de I/O: "+e );
        }
        catch (NumberFormatException e)
        {
            System.out.println ("o valor digitado deve ser inteiro: "+e );
        }
        return (a);
    }

    /**
     Le um double, exibindo na tela uma mensagem de solicitacao.
     @return double
     */
    public static double leDouble(String msg)
    {   double a = 0;
        System.out.print(msg);
        try
        {
            s = d.readLine();
            a = Double.parseDouble(s);
        }
        catch (IOException e)
        {
            System.out.println ("Erro de I/O: " + e);
        }
        catch (NumberFormatException e)
        {
            System.out.println ("o valor digitado deve ser numero: "+e );
        }
        return (a);
    }

    /**
     Le um string, exibindo na tela uma mensagem de solicitacao.
     @return String
     */
    public static String leString(String msg)
    {   s = "";
        System.out.print(msg);
        try
        {
            s = d.readLine();
        }
        catch (IOException e)
        {
            System.out.println ("Erro de I/O: " + e);
        }
        return (s);
    }

    /**
     Le um caractere exibindo na tela uma mensagem de solicitacao.
     @return Char
     */
    public static Character leChar(String msg)
    {   s = "";
        System.out.print(msg);
        try
        {
            s = d.readLine();
        }
        catch (IOException e)
        {
            System.out.println ("Erro de I/O: " + e);
        }
        return (s.charAt(0));
    }


    /**
     Le um caractere exibindo na tela uma mensagem de solicitacao.
     @return Char
     */
    public static Boolean leBoolean(String msg)
    {   s = "";
        System.out.print(msg);
        try
        {
            s = d.readLine();
        }
        catch (IOException e)
        {
            System.out.println ("Erro de I/O: " + e);
        }
        return (new Boolean(s));
    }


}//fim da classe