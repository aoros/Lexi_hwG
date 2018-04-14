package window;

import command.Command;
import command.InsertionStatus;
import command.KeyMap;
import glyph.Glyph;

// Bridge(151).RefinedAbstraction
// Command(233).Invoker
// Chain of Responsibility(223).Client
public class LexiWindow extends Window {

    private Glyph _glyph;
    private KeyMap keyMap;

    public LexiWindow(String title) {
        super(title);
    }

    @Override
    public void setContents(Glyph glyph) {
        _glyph = glyph;
        _windowImp.setContents();
    }

    @Override
    public void draw() {
        if (_glyph != null) {
            _glyph.draw(this);
        }
    }

    @Override
    public void key(char keyChar) {
        System.out.println(keyChar);
        Command c = keyMap.get(keyChar);
        if (c != null) {
            _glyph = c.getGlyph();
            Glyph root = c.getGlyph().getRoot();
            c.execute();
            root.compose();
            setContents(root);
        }
        System.out.println("insertion status: " + InsertionStatus.getInstance().isInsertionMode());
    }

    @Override
    public void click(int x, int y) {
        Glyph root = _glyph.getRoot();
        if (root != null) {
            Glyph selectedGlyph = root.find(x, y);
            if (selectedGlyph != null) {
                Command c = selectedGlyph.click();
                if (c != null)
                    c.execute();

                root.compose();
                setContents(root);
            }
        }
        System.out.println("insertion status: " + InsertionStatus.getInstance().isInsertionMode());
    }

    @Override
    public void setKeyMap(KeyMap keyMap) {
        this.keyMap = keyMap;
    }
}
