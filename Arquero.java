import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Image;


public class Arquero {
	
	public static final int VELY = 5;
	int y;
	Image imagen;
   
	public Arquero(Image img) {
    	y=200;
    	imagen = img;
    }

    public void dibujar(Graphics gg, Applet a){
    	gg.drawImage(imagen, 15, y, a);	
    }
    
    public void actualizar(int direccion){
    	if(direccion == Jugando.ABAJO)
    		y += VELY;
    	else
    		y -= VELY;

    	if(y<=0) y=0;
    	if(y>=240) y=240;
    }
}
