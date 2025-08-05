package com.multi.homework._20250801.MediaFile;

public class VideoFile extends MediaFile {
    public VideoFile(String filename, double size){
        super(filename,size);
    }

    @Override
    public void open() {
        System.out.println("비디오 파일 오픈: "+ filename);
    }
}
