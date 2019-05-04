package com.habuma.spittr.service;

import com.habuma.spittr.domain.Spitter;
import com.habuma.spittr.domain.Spittle;

import java.util.List;

public interface SpitterService {

    List<Spittle> getRecentSpittles(int count);
    void savespittle(Spittle spittle);
    void savespitter(Spitter spitter);
    Spitter getSpitter(long id);
    void startFollowing(Spitter follower, Spitter followee);
    List<Spittle> getspittlesForSpitter(Spitter spitter);
    List<Spittle> getspittlesForSpitter(String username);
    Spitter getSpitter(String username);
    Spittle getspittleById(long id);
    void deletespittle(long id);
    List<Spitter> getAllspitters();
}
