package command;

import glyph.Glyph;
import glyph.GlyphType;
import window.Window;

public class InsertGlyphCommand implements Command {

    Glyph _glyph;
    Window _window;
    GlyphType _glyphType;

    public InsertGlyphCommand(Glyph glyph, Window window, GlyphType glyphType) {
        this._glyph = glyph;
        this._window = window;
        this._glyphType = glyphType;
    }

    private InsertGlyphCommand(InsertGlyphCommand command) {
        this(command._glyph, command._window, command._glyphType);
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
        return new InsertGlyphCommand(this);
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
