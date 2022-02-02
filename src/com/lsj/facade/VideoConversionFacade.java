package com.lsj.facade;

import com.lsj.facade.complex_media_library.*;

import java.io.File;
/*
* 서브 시스템 (complex_media_library) 를 이용한 비디오 컨버선 구현체
*
* 클라이언트는 구체적인 구현 내용, 사용한 서브 시스템 을 알 필요 없이 convertVideo 메소드 이용으로 비디오 파일을 변환 할 수 있다.
* */
public class VideoConversionFacade implements VideoConversion {

    @Override
    public File convertVideo(String fileName, String format) {
        System.out.println("VideoConversionFacade : conversion started.");
        VideoFile file = new VideoFile(fileName);

        Codec sourceCodec = CodecFactory.extract(file);
        Codec destinationCodec;

        if(format.equalsIgnoreCase("mp4")) {
            destinationCodec = new OggCompressionCodec();
        } else {
            destinationCodec = new MPEG4CompressionCodec();
        }

        VideoFile buffer = BitrateReader.read(file, sourceCodec);
        VideoFile intermediateResult = BitrateReader.convert(buffer, destinationCodec);

        File result =  new AudioMixer().fix(intermediateResult);
        System.out.println("VideoConversionFacade : conversion Completed");
        return result;
    }
}
