package com.example.profile.model;


public class BasicInformation {
    private final String name;
    private final String intro;
    private final String profileImageURL;
    
    public BasicInformation(String name, String intro, String profileImgString)
    {
        this.name = name;
        this.intro = intro;
        this.profileImageURL = profileImgString;
    }

    public String getName() { return name; }
    public String getIntro() { return intro; }
    public String getProfileImageUrl() { return profileImageURL; }
}
