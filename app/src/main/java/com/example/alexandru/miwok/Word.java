package com.example.alexandru.miwok;

/**
 * Created by Alexandru on 1/21/2017.
 */

public class Word {

    private String mMiwakTranslation;
    private String mEnglishTranslation;

    public Word() {
    }

    public Word(String mMiwakTranslation, String mEnglishTranslation) {
        this.mMiwakTranslation = mMiwakTranslation;
        this.mEnglishTranslation = mEnglishTranslation;
    }

    public String getmMiwakTranslation() {
        return mMiwakTranslation;
    }

    public void setmMiwakTranslation(String mMiwakTranslation) {
        this.mMiwakTranslation = mMiwakTranslation;
    }

    public String getmEnglishTranslation() {
        return mEnglishTranslation;
    }

    public void setmEnglishTranslation(String mEnglishTranslation) {
        this.mEnglishTranslation = mEnglishTranslation;
    }
}
