package glyph;

public enum GlyphType {
    NEW_RECTANGLE("Rectangle"),
    NEW_ROW("Row"),
    NEW_COLUMN("Column"),
    NEW_SCROLLER("Scroller"),;

    private final String glyphType;

    GlyphType(String glyphType) {
        this.glyphType = glyphType;
    }

    public String getGlyphType() {
        return glyphType;
    }
}
