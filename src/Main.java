import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;
import java.io.PrintWriter;

public class Main {
        public static void main(String[] args) throws FileNotFoundException {
            HashMap<Character, String> alphabet = new HashMap<>();
            alphabet.put('а', "a");
            alphabet.put('б', "b");
            alphabet.put('в', "v");
            alphabet.put('г', "g");
            alphabet.put('д', "d");
            alphabet.put('е', "e");
            alphabet.put('ё', "yo");
            alphabet.put('ж', "j");
            alphabet.put('з', "z");
            alphabet.put('и', "i");
            alphabet.put('к', "k");
            alphabet.put('л', "l");
            alphabet.put('м', "m");
            alphabet.put('н', "n");
            alphabet.put('о', "o");
            alphabet.put('п', "p");
            alphabet.put('р', "r");
            alphabet.put('с', "s");
            alphabet.put('т', "t");
            alphabet.put('у', "u");
            alphabet.put('ф', "f");
            alphabet.put('х', "h");
            alphabet.put('ц', "ts");
            alphabet.put('ч', "ch");
            alphabet.put('ш', "sh");
            alphabet.put('щ', "shch");
            alphabet.put('ь', "");
            alphabet.put('ы', "y");
            alphabet.put('ъ', "'");
            alphabet.put('э', "e");
            alphabet.put('ю', "yu");
            alphabet.put('я', "ya");
            alphabet.put(' ', " ");
            alphabet.put('.', ".");
            alphabet.put(',', ",");

            Scanner sc = new Scanner(System.in);
            File output = new File("C:\\Users\\user\\IdeaProjects\\untitled\\src\\Output.txt");
            PrintWriter writer = new PrintWriter(output);


            String in = sc.nextLine();
            char[] inArr = in.toCharArray();

            for(int i = 0; i < inArr.length; i++) {
                System.out.print(alphabet.get(inArr[i]));
                writer.print(alphabet.get(inArr[i]));
            }
    }
}