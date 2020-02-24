package com.example.patterns.structural.deputy;

public class ThirdPartyYoutubeClass implements ThirdPartyYoutubeLib{
    @Override
    public ThirdPartyYoutubeClass listVideo() {
        // Получить список видеороликов с помощью API Youtube.
        return null;
    }

    @Override
    public ThirdPartyYoutubeClass getVideoInfo(int id) {
        // Получить детальную информацию о каком-то видеоролике.
        return null;
    }

    @Override
    public void downloadVideo(int id) {
        // Скачать видео с Youtube.

    }
}
