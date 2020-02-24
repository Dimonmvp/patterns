package com.example.patterns.structural.facade;

import java.io.File;

public class VideoConverter {
    public File convert(String filename,String format)
    {
        VideoFile file = new VideoFile(filename);
        CodecFactory sourceCodec = new CodecFactory();
        if (format == "mp4")
        {
            MPEG4CompressionCodec destination = new MPEG4CompressionCodec();
        }
        else
        {
            OggCompressionCodec destination = new OggCompressionCodec();
        }
        return new File("/");


    }
}
