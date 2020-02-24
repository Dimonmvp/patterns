package com.example.patterns.structural.deputy;

import java.security.Provider;

public class Application {
    public void init()
    {
        ThirdPartyYoutubeClass youtubeService = new ThirdPartyYoutubeClass();
        CachedYoutubeClass youtubeProxy = new CachedYoutubeClass(new ThirdPartyYoutubeClass());
        YoutubeManager manager = new YoutubeManager(youtubeProxy);
        manager.reactOnUserInput();
    }
}
