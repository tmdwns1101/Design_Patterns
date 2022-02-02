package com.lsj.facade.complex_media_library;

public class CodecFactory {

    public static Codec extract(VideoFile file) {
        String type = file.getCodecType();

        if(type.equalsIgnoreCase("mp4")) {
            System.out.println("CodecFactory : extracting mpeg audio.....");
            return new MPEG4CompressionCodec();
        } else {
            System.out.println("CodecFactory : extracting ogg audio.....");
            return new OggCompressionCodec();
        }
    }
}
