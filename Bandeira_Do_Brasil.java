import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Bandeira_Do_Brasil extends JPanel {
    
    private int larguraBandeira = 300;
    private int alturaBandeira = 180;
    private int larguraLosango = 280;
    private int alturaLosango = 160;
    private int raioCirculo = 50;
    
    public Bandeira_Do_Brasil() {        
        super.setPreferredSize( new Dimension( 400, 400 ) ); 
        super.setBackground( Color.GRAY );
    }
    
    public void paint(Graphics g ) {
        super.paint(g); 
        int larguraTela = super.getWidth();
        int alturaTela = super.getHeight();
        
        int centroX = larguraTela / 2;
        int centroY = alturaTela  / 2;
        
        int bandeiraX = centroX - ( larguraBandeira / 2 );
        int bandeiraY = centroY - ( alturaBandeira  / 2 );
        
        g.setColor( Color.GREEN );
        g.fillRect( bandeiraX, bandeiraY, larguraBandeira, alturaBandeira );
        
        int[] losangoXs = new int[ 4 ];
        losangoXs[0] = centroX - ( larguraLosango / 2 );
        losangoXs[1] = centroX;
        losangoXs[2] = centroX + ( larguraLosango / 2 );
        losangoXs[3] = centroX;
        
        int[] losangoYs = new int[ 4 ];
        losangoYs[0] = centroY;
        losangoYs[1] = centroY - ( alturaLosango / 2 );
        losangoYs[2] = centroY;
        losangoYs[3] = centroY + ( alturaLosango / 2 );
        
        g.setColor( Color.YELLOW );
        g.fillPolygon( losangoXs, losangoYs, 4 );
        
        int circuloX = centroX - raioCirculo;
        int circuloY = centroY - raioCirculo;
        int larguraCirculo = 2 * raioCirculo;
        int alturaCirculo = 2 * raioCirculo;
        
        g.setColor( Color.BLUE ); 
        g.fillArc( circuloX, circuloY, larguraCirculo , alturaCirculo, 0, 360 ); 
    }
           
    public static void main(String[] args) {
        Bandeira_Do_Brasil painel = new Bandeira_Do_Brasil();
        
        JFrame f = new JFrame();
        f.setContentPane( painel ); 
        f.setTitle( "Bandeira do Brasil" ); 
        f.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        f.setSize( 500, 500 ); 
        f.setLocationRelativeTo( f );                
        f.setVisible( true );
    }
    
}
