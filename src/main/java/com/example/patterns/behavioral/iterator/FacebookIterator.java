//package com.example.patterns.behavioral.iterator;
//
//import java.util.ArrayList;
//
//public class FacebookIterator implements ProfileIterator{
//    private Facebook facebook;
//    private String profileID,type;
//
//    private int current=0;
//    private ArrayList<Profile> cache = ArrayList<>();
//
//    public FacebookIterator(Facebook facebook, String profileID, String type) {
//        this.facebook = facebook;
//        this.profileID = profileID;
//        this.type = type;
//    }
//    private void lazyInit()
//    {
//        if (cache == null)
//        {
////            cache = facebook.socialGraphRequest(profileID,type);
//        }
//    }
//    private Profile getNext()
//    {
//        if (hasMore())
//        {
//            current++;
//        }
//        return cache.get(current);
//    }
//
//    @Override
//    public boolean hasMore() {
//        return false;
//    }
//
////    @Override
////    public boolean hasMore() {
////        lazyInit();
////        return cache.length < currentPosition;
//    }
//
//}
