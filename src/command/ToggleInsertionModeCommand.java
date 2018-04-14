package command;

import glyph.Bounds;
import glyph.Glyph;

public class ToggleInsertionModeCommand implements Command {

    private Glyph _glyph;
    private boolean _insertionMode;

    public ToggleInsertionModeCommand(Glyph _glyph, boolean insertionMode) {
        this._glyph = _glyph;
        this._insertionMode = insertionMode;
    }

    @Override
    public void execute() {
        InsertionStatus.getInstance().setInsertionMode(_insertionMode);
        int x = _glyph.getBounds().getX() + _glyph.getBounds().getWidth();
        int y = _glyph.getBounds().getY() + _glyph.getBounds().getHeight();
        InsertionStatus.getInstance().setInsertionCursor(new Bounds(x, y, 0, 0));
    }

    @Override
    public void unexecute() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Command clone() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
