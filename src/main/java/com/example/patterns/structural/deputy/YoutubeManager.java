package com.example.patterns.structural.deputy;

public class YoutubeManager {
    ThirdPartyYoutubeLib service;

    public YoutubeManager(ThirdPartyYoutubeLib service) {
        this.service = service;
    }

    public void renderVideoPage(int id)
    {
        ThirdPartyYoutubeClass info = service.getVideoInfo(id);
        // Отобразить страницу видеоролика.

    }
    public void renderVideo(int id)
    {
        ThirdPartyYoutubeClass list = service.listVideo();
        // Отобразить список превьюшек видеороликов.
    }
    public void reactOnUserInput()
    {
        //renderVideoPage();
        //renderListPanel();
    }
}
