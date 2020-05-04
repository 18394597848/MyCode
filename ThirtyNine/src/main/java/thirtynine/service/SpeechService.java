package thirtynine.service;

import thirtynine.pojo.Speech;

import java.util.List;

public interface SpeechService {

    void insertSpeech(Speech speech);

    void deleteSpeech(int id);

    List<Speech> findAll();

    List<Speech> findByKeyword(String keyword);

}
