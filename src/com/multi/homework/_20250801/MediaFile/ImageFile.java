package com.multi.homework._20250801.MediaFile;

public class ImageFile extends MediaFile {
    public ImageFile(String filename, double size) {
        super(filename, size);
    }

    @Override
    public void open() {
        System.out.println("이미지 파일 오픈: "+ filename);
    }
}
