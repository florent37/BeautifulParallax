package com.github.florent37.beautifulparallax.sample.model;

/**
 * Created by florentchampigny on 06/08/15.
 */
public class SampleObject {

    String name;
    String backgroundUrl;
    String avatarUrl;

    public SampleObject() {
    }

    public SampleObject(String name,String avatarUrl,  String backgroundUrl) {
        this.name = name;
        this.backgroundUrl = backgroundUrl;
        this.avatarUrl = avatarUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBackgroundUrl() {
        return backgroundUrl;
    }

    public void setBackgroundUrl(String backgroundUrl) {
        this.backgroundUrl = backgroundUrl;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }
}
