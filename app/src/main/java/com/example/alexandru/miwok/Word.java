package com.example.alexandru.miwok;

/**
 * Created by Alexandru on 1/21/2017.
 */

public class Word {

    private static final int NO_IMAGE_PROVIDED = -1;
    private static final int NO_SOUND_PROVIDED = -1;
    private String mMiwakTranslation;
    private String mEnglishTranslation;
    private int mIdImage;
    private int mIdSound;

    public Word() {
    }


    public Word(String mEnglishTranslation, String mMiwakTranslation) {
        this.mMiwakTranslation = mMiwakTranslation;
        this.mEnglishTranslation = mEnglishTranslation;
        this.mIdImage = NO_IMAGE_PROVIDED;
        this.mIdSound = NO_SOUND_PROVIDED;
    }

    public Word(String mEnglishTranslation, String mMiwakTranslation, int mIdImage) {
        this.mMiwakTranslation = mMiwakTranslation;
        this.mEnglishTranslation = mEnglishTranslation;
        this.mIdImage = mIdImage;
        this.mIdSound = NO_SOUND_PROVIDED;
    }

    public Word(String mMiwakTranslation, String mEnglishTranslation, int mIdImage, int mIdSound) {
        this.mMiwakTranslation = mMiwakTranslation;
        this.mEnglishTranslation = mEnglishTranslation;
        this.mIdImage = mIdImage;
        this.mIdSound = mIdSound;
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

    public int getmIdSound() {
        return mIdSound;
    }

    public void setmIdSound(int mIdSound) {
        this.mIdSound = mIdSound;
    }

    @Override
    public String toString() {
        return "Word{" +
                "mMiwakTranslation='" + mMiwakTranslation + '\'' +
                ", mEnglishTranslation='" + mEnglishTranslation + '\'' +
                ", mIdImage=" + mIdImage +
                ", mIdSound=" + mIdSound +
                '}';
    }
}
