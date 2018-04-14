package command;

import glyph.Glyph;
import window.Window;

public class MoveBackCommand implements Command {

    Glyph _glyph;
    Window _window;

    public MoveBackCommand(Glyph _glyph, Window _window) {
        this._glyph = _glyph;
        this._window = _window;
    }
    
    private MoveBackCommand(MoveBackCommand clone) {
        this(clone._glyph, clone._window);
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
        return new MoveBackCommand(this);
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
