package compilador;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

/**
 *
 * @author Tito Gardel
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList texto = obterLinhas(args[0]);
        if(texto != null) {
            // TODO : análise léxica de cada linha
        }
    }

    /*
     *  Abre o arquivo e retorna todas as linhas em um
     * ArrayList.
     */
    public static ArrayList<String> obterLinhas(String file) {
        File f = new File(file);
        if(!f.exists()) {
            println("O arquvivo "+file+" não existe.");
            return null;
        } else {
            try {
                BufferedReader in = new BufferedReader(new FileReader(f));
                String linha;
                ArrayList<String> texto = new ArrayList<String>();
                for(int i=0; ((linha = in.readLine())!=null); i++) {
                    texto.add(linha);
                }
                return texto;
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }
    }

    public static void println(String s) {
        System.out.println(s);
    }
}
