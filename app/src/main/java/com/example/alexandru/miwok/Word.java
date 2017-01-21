package com.example.alexandru.miwok;

/**
 * Created by Alexandru on 1/21/2017.
 */

public class Word {

    private static final int NO_IMAGE_PROVIDED = -1;
    private String mMiwakTranslation;
    private String mEnglishTranslation;
    private int mIdImage;

    public Word() {
    }


    public Word(String mEnglishTranslation, String mMiwakTranslation) {
        this.mMiwakTranslation = mMiwakTranslation;
        this.mEnglishTranslation = mEnglishTranslation;
        this.mIdImage = NO_IMAGE_PROVIDED;
    }

    public Word(String mEnglishTranslation, String mMiwakTranslation, int mIdImage) {
        this.mMiwakTranslation = mMiwakTranslation;
        this.mEnglishTranslation = mEnglishTranslation;
        this.mIdImage = mIdImage;
    }

    public boolean hasImage() {
        if (this.mIdImage == NO_IMAGE_PROVIDED) return false;
        else return true;
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

    public int getmIdImage() {
        return mIdImage;
    }

    public void setmIdImage(int mIdImage) {
        this.mIdImage = mIdImage;
    }
}
