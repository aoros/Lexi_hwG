package command;

import glyph.Glyph;
import window.Window;

public class InsertCharacterCommand implements Command {

    Glyph _glyph;
    Window _window;

    public InsertCharacterCommand(Glyph glyph, Window window) {
        this._glyph = glyph;
        this._window = window;
    }

    private InsertCharacterCommand(InsertCharacterCommand command) {
        this(command._glyph, command._window);
    }

    @Override
    public void execute() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void unexecute() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Command clone() {
        return new InsertCharacterCommand(this);
    }

    @Override
    public void setGlyph(Glyph _glyph) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Glyph getGlyph() {
        return _glyph;
    }

}
