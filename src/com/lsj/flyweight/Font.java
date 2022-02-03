package com.lsj.flyweight;

/*
* Flyweight 객체로 불변성을 유지해야하므로, 상속 방지와 함께 필드 변수들은 모두 final로 정의한다.
* */
public final class Font {

    private final String style;

    private final int size;

    public Font(String style, int size) {
        this.style = style;
        this.size = size;
    }

    public String getStyle() {
        return style;
    }

    public int getSize() {
        return size;
    }
}
