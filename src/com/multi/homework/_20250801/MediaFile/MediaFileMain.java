package com.multi.homework._20250801.MediaFile;

public class MediaFileMain {
    public static void main(String[] args) {
        MediaFile[]mediaFile = {
          new ImageFile("이미지파일.jpg", 5.7),
          new VideoFile("비디오파일.mp4", 600),
          new AudioFile("오디오파일.mp3", 12.8)
        };

        for(MediaFile m:mediaFile){
            m.open();
            m.compress(0.3);
        }
    }
}

