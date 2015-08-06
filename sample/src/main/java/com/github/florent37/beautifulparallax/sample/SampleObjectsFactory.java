package com.github.florent37.beautifulparallax.sample;

import com.github.florent37.beautifulparallax.sample.model.SampleObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by florentchampigny on 06/08/15.
 */
public class SampleObjectsFactory {

    public static List<SampleObject> generateList() {
        List<SampleObject> objects = new ArrayList<>();
        for (int i = 0; i < 20; ++i) {
            objects.add(new SampleObject("Cell n°" + i, generateRandomUrl(), generateRandomUrl()));
        }
        return objects;
    }

    public static String generateRandomUrl(){
        return "http://lorempixel.com/" + generateRandom() + "/" + generateRandom() + "/";
    }

    public static int generateRandom() {
        return (int) (400 + (Math.random() * 100));
    }

}
