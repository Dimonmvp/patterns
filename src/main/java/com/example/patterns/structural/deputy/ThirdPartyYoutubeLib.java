package com.example.patterns.structural.deputy;

public interface ThirdPartyYoutubeLib {
    public ThirdPartyYoutubeClass listVideo();
    public ThirdPartyYoutubeClass getVideoInfo(int id);
    public void downloadVideo(int id);
}
