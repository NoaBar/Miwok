package com.example.android.miwok;
/**
 * Created by Noa B on 02-Mar-18.
 */

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
         * Constructor!
         * Create a new Word object.
         * @param defaultTranslation is the word in a language that the user is already familiar with
         *                           (such as English)
         * @param miwokTranslation   is the word in the Miwok language
         */
        public Word(String defaultTranslation, String miwokTranslation) {
            mDefaultTranslation = defaultTranslation;
            mMiwokTranslation = miwokTranslation;
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

    }

