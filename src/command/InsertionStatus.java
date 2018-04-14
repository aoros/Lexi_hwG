package command;

import glyph.Bounds;
import window.WindowImpFactory;

public class InsertionStatus {

    private static InsertionStatus instance;
    private boolean insertionMode;
    private Bounds insertionCursor;

    private InsertionStatus() {
    }

    public static InsertionStatus getInstance() {
        if (instance == null) {
            instance = new InsertionStatus();
        }
        return instance;
    }

    public boolean isInsertionMode() {
        return insertionMode;
    }

    public void setInsertionMode(boolean insertionMode) {
        this.insertionMode = insertionMode;
    }

    public Bounds getInsertionCursor() {
        return insertionCursor;
    }

    public void setInsertionCursor(Bounds insertionCursor) {
        this.insertionCursor = insertionCursor;
        WindowImpFactory.getInstance().drawRectangle(insertionCursor.getX(), insertionCursor.getY(), 1, 5);
        WindowImpFactory.getInstance().setContents();
        WindowImpFactory.getInstance().repaint();
    }
}
