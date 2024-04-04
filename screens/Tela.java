package screens;
import java.awt.event.KeyEvent;
import asciiPanel.AsciiPanel;

public interface Tela {
    public void displayOutput(AsciiPanel terminal);
    public Tela respondToUserInput(KeyEvent key);
}
