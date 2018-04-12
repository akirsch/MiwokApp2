package com.example.android.miwokapp2;

/**
 * Created by Owner on 2/27/2018.
 */

public class Word {

    private String mDefaultTranslation;
    private String mMiwokTranslation;
    // Drawable resource ID of Image Icon for this word
    /** Image resource ID for the word */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /** Audio resource ID for the word */
    private int mAudioResourceId;

    /** Constant value that represents no image was provided for this word */
    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * Create a new com.example.android.miwok.Word object.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param miwokTranslation is the word in the Miwok language
     * @param audioResourceId is the resource Id for the audio track for the given word object
     */
    public Word (String defaultTranslation, String miwokTranslation, int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceId = audioResourceId;
    }

    /**
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param miwokTranslation is the word in the Miwok language
     * @param imageResourceId is the drawable resource for the image associated with the word
     * @param audioResourceId is the resource Id for the audio track for the given word object
     */
    public Word (String defaultTranslation, String miwokTranslation, int imageResourceId, int audioResourceId){
            mDefaultTranslation  = defaultTranslation;
            mMiwokTranslation = miwokTranslation;
            mImageResourceId = imageResourceId;
            mAudioResourceId = audioResourceId;

    }
    /**
     * Get the default translation of the word.
     */
    public String getmDefaultTranslation() {
        return mDefaultTranslation;
    }
    /**
     * Get the Miwok translation of the word.
     */
    public String getmMiwokTranslation() {
        return mMiwokTranslation;
    }
    /**
     * Get the image resource Id of the word.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Get the audio resource Id of the word.
     */
    public int getAudioResourceId() {
        return mAudioResourceId;
    }

    /**
     * Returns whether or not there is an image for this word.
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

}
