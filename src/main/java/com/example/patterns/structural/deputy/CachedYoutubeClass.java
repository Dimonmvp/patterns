package com.example.patterns.structural.deputy;

public class CachedYoutubeClass implements ThirdPartyYoutubeLib{
    private ThirdPartyYoutubeClass service,listCache,videoCache;
    public ThirdPartyYoutubeClass needReset;


    public CachedYoutubeClass(ThirdPartyYoutubeLib service) {
        this.service = (ThirdPartyYoutubeClass) service;
    }

    public CachedYoutubeClass(ThirdPartyYoutubeClass service,
                              ThirdPartyYoutubeClass listCache,
                              ThirdPartyYoutubeClass videoCache,
                              ThirdPartyYoutubeClass needReset) {
        this.service = service;
        this.listCache = listCache;
        this.videoCache = videoCache;
        this.needReset = needReset;
    }

    @Override
    public ThirdPartyYoutubeClass listVideo() {
        if ((listCache==null))
        {
            listCache=service.listVideo();
        }
        return listCache;
    }

    @Override
    public ThirdPartyYoutubeClass getVideoInfo(int id) {
        if (videoCache == null)
        {
            videoCache = service.getVideoInfo(id);
        }
        return null;
    }

    @Override
    public void downloadVideo(int id) {
        service.downloadVideo(id);
    }
}
