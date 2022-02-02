package com.lsj.facade;

import java.io.File;

public class Client {
    public static void main(String[] args) {
        VideoConversion converter = new VideoConversionFacade();
        File mp4Video = converter.convertVideo("hello.ogg", "mp4");
        File oggVideo = converter.convertVideo("world.mp4", "ogg");
    }
}
