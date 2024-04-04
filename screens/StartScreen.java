package screens;
import java.awt.event.KeyEvent;
import asciiPanel.AsciiPanel;

public class StartScreen implements Tela {

    public void displayOutput(AsciiPanel terminal){
        terminal.write("TUTORIAL",1,1);
        terminal.writeCenter("--Press [ENTER] to start --", 22);
    }
    public Tela respondToUserInput(KeyEvent key){
        return key.getKeyCode() == KeyEvent.VK_ENTER ? new PlayScreen() : this;
    }
    
}
