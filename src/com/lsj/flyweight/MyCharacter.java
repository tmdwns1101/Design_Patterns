package com.lsj.flyweight;

public class MyCharacter {

    private char character;

    private String color;

    private Font font;

    public MyCharacter(char character, String color, Font font) {
        this.character = character;
        this.color = color;
        this.font = font;
    }

    public char getCharacter() {
        return character;
    }

    public void setCharacter(char character) {
        this.character = character;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Font getFont() {
        return font;
    }

    public void setFont(Font font) {
        this.font = font;
    }

    @Override
    public String toString() {
        return "{ character : " + character +
                " color : " + color +
                " font style : " + font.getStyle() +
                " font size : " + font.getSize()
                + " }";
    }
}
