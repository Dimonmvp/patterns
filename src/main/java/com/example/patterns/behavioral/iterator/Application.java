//package com.example.patterns.behavioral.iterator;
//
//public class Application {
//    public SocialNetwork network;
//    public SocialSpammer spammer;
//
//    public void config(String stNetwork)
//    {
//        if (stNetwork=="Facebook")
//        {
//            this.network=new Facebook();
//        }
//        if (stNetwork=="LinkedIn")
//        {
//            this.network=new LinkedIn();
//        }
//        this.spammer=new SocialSpammer();
//    }
//    public void sendSpamToFriends(Profile profile)
//    {
//        iterator = network.createFriendsIterator(profile.getId);
//        spammer.send(iterator,"Very important message");
//    }
//    public void sendSpamToCoworkers()
//    {
//        iterator= network.createCoworkersIterator(profile.getID());
//        spammer.send(iterator,"Very important message");
//    }
//}
