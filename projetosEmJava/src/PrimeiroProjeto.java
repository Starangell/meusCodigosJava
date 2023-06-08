import java.util.Date;
import java.util.Locale;
import java.awt.Dimension;
import java.awt.Toolkit;

public class PrimeiroProjeto {
    public static void main(String[] args) throws Exception {
        Date data = new Date();
        Toolkit resolucao = Toolkit.getDefaultToolkit();
        Dimension d = resolucao.getScreenSize();
        Locale idioma = Locale.getDefault();

        System.out.println("A Hora é: " + data.toString());
        System.out.println("O Idioma do sistema é: " + idioma.getDisplayLanguage());
        System.out.println("A Resolução do sistema é: " + d.width + "x" + d.height);

    }
}
