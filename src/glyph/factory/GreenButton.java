package glyph.factory;

import command.Command;
import glyph.Bounds;
import glyph.Button;
import glyph.Composition;
import window.Window;

// Abstract Factory(87).ConcreteProduct
// Factory(107).ConcreteProduct
public class GreenButton extends Button {

    protected GreenButton(Composition composition, Command command) {
        super(composition, command);
    }

    @Override
    public void draw(Window window) {
        drawButton(window);
        super.draw(window);
    }

    private void drawButton(Window window) {
        int x = super.getBounds().getX();
        int y = super.getBounds().getY();
        int w = super.getBounds().getWidth();
        int h = super.getBounds().getHeight();

        window.drawButton(x, y, w, h, "green");
    }

    @Override
    public void adjustCursorAfterComposingChild(Bounds cursor, Bounds bounds) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
