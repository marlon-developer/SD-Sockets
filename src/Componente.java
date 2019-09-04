
import java.io.Serializable;
import javax.swing.JOptionPane;

/**
 *
 * @author alexandrezamberlan
 */
public class Componente implements Serializable {

    public static final int FRUTA = 1, JOGADOR = 2;
    public int x;
    public int y;
    public int largura;
    public int altura;
    public int tipo;
    public int placar_jogador_1;
    public int placar_jogador_2;

    public Componente(int x, int y, int largura, int altura, int placar_jogador_1, int placar_jogador_2) {
        this.x = x;
        this.y = y;
        this.largura = largura;
        this.altura = altura;
        this.placar_jogador_1 = placar_jogador_1;
        this.placar_jogador_2 = placar_jogador_2;

//        Print do Placar Chegando Neste Método
//        JOptionPane.showMessageDialog(null, "Placar: " + placar_jogador_1);
//        JOptionPane.showMessageDialog(null, "Placar: " + placar_jogador_2);
    }
}
