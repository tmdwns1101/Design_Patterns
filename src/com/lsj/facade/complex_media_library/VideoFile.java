package com.lsj.facade.complex_media_library;

public class VideoFile {

    private String name;

    private CodecType codecType;

    public VideoFile(String name) {
        this.name = name;
        String type = name.substring(name.indexOf(".")+1).toUpperCase();
        this.codecType = CodecType.valueOf(type);
    }

    public String getCodecType() {
        return codecType.toString();
    }

    public String getName() {
        return name;
    }
}
