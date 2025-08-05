package com.multi.homework._20250801.MediaFile;

public class MediaFile {
    String filename;
    double size;

    public MediaFile(String filename, double size) {
        this.filename = filename;
        this.size = size;
    }

    public void open(){
        System.out.println("파일 열기: "+filename);
    }

    public void compress(double rate){
        size*=rate;
        System.out.println("압축 완료. 새 크기: "+size);
    }

    public void compress(double rate, String destination){
        size*=rate;
        System.out.println(destination+"으로 압축 완료. 새 크기: "+size);
    }
}
