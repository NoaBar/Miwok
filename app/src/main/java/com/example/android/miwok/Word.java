package com.example.android.miwok;
/**
 * Created by Noa B on 02-Mar-18.
 */

import java.lang.reflect.Constructor;

/**
 * {@link Word} represents a vocabulary word that the user wants to learn.
 * It contains a default translation and a Miwok translation for that word.
 */

public class Word {
    /**
     * Default translation for the word
     */
    private String mDefaultTranslation;
    /**
     * Miwok translation for the word
     */
    private String mMiwokTranslation;

    /**
     * Image resource id
     */
    private int mImageResourceId = NO_IMAGE_Provided;
    private static final int NO_IMAGE_Provided = -1;

    /**
     * Sound resource id
     */
    private int mSoundResourceId;

    /**
     * Constructor 1
     * Create a new Word object.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param miwokTranslation   is the word in the Miwok language
     * @param soundResourceId is the resource ID for the audio file associated with this word
     */
    public Word(String defaultTranslation, String miwokTranslation, int soundResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mSoundResourceId = soundResourceId;
    }

    /**
     * Constructor 2
     * Create a new Word object.
     * with image in every word.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param miwokTranslation   is the word in the Miwok language
     * @param imageResourceId    is the drawable resource ID for the image associated with the word.
     * @param soundResourceId is the resource ID for the audio file associated with this word
     */
    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId, int soundResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
        mSoundResourceId = soundResourceId;
    }

    /**
     * Get the default translation of the word.
     */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     * Get the Miwok translation of the word.
     */
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }


    /**
     * Get word image.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * returns if there is an image to the word or not
     *
     * @return
     **/
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_Provided;
    }

    /**
     * Get word sound.
     */
    public int getSound() {
        return mSoundResourceId;
    }
}

