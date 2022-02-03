package com.lsj.flyweight;

import java.util.HashMap;
import java.util.Map;

public class FontFactory {

    private Map<String, Font> cache = new HashMap<>();

    public Font getFont(String font) {
        Font value = cache.computeIfAbsent(font, key -> {
            String[] styleAndSize = key.split(":");
            return new Font(styleAndSize[0], Integer.parseInt(styleAndSize[1]));
        });
        cache.put(font, value);
        return value;
    }
}
