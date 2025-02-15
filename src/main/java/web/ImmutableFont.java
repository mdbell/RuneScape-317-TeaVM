package web;

import org.teavm.common.Promise;

public final class ImmutableFont implements IFont {

    private final String name;
    private final int style;
    private final int size;

    public ImmutableFont(String name, int style, int size) {
        this.name = name;
        this.style = style;
        this.size = size;
    }

    public boolean isBold() {
        return (style & BOLD) != 0;
    }

    public boolean isPlain() {
        return style == PLAIN;
    }

    public boolean isItalics() {
        return (style & ITALIC) != 0;
    }

    public String getName() {
        return name;
    }

    public int getStyle() {
        return style;
    }

    public int getSize() {
        return size;
    }

    public String toHtml() {
        StringBuilder sb = new StringBuilder(size + "pt ");
        if (isBold()) {
            sb.append("bold ");
        }
        if (isItalics()) {
            sb.append("italics ");
        }

        sb.append(getName());
        return sb.toString();
    }

    @Override
    public String toString() {
        return "ImmutableFont{" +
                "name='" + name + '\'' +
                ", style=" + style +
                ", size=" + size +
                '}';
    }
}
