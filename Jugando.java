import java.applet.Applet;
import java.awt.Color;
import java.awt.Event;
import java.awt.Graphics;
import java.awt.Image;

public class Jugando extends Applet implements Runnable {
	
	Arquero arquero;
	Image imagen;
	Thread animacion;
	Graphics noseve;
	public static final int ABAJO = 0;
	public static final int ARRIBA = 1;
	
	public void init(){
    	imagen = createImage(500, 500);
    	noseve = imagen.getGraphics();
    	arquero = new Arquero((getImage(getDocumentBase(),"../resources/arquero.gif")));
	}
	
    public void start(){
    	animacion = new Thread(this);
    	animacion.start(); //llama al método run
    }
    
    public void paint(Graphics g){
    	noseve.setColor(Color.black);
    	noseve.fillRect(0, 0, 500, 500);
	   	arquero.dibujar(noseve,this);

    	g.drawImage(imagen, 0, 0, this);
    }
    
    public void update(Graphics g){
    	paint(g);
    }

	public void run() {

		
	}
	
    public boolean keyDown(Event ev, int tecla){
    	if(tecla == 87)
    		arquero.actualizar(ARRIBA);
    	if(tecla == 83)
    		arquero.actualizar(ABAJO);
    	return true;
    }
}
