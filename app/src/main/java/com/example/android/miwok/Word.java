package com.example.android.miwok;

/**
 * Created by user on 4/28/2018.
 */

public class Word
{
    private String mDefaultTranslation;

    private String mMiworkTranslation;

    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    public Word (String defaultTranslation, String miworkTranslation)
    {
        mDefaultTranslation = defaultTranslation;

        mMiworkTranslation = miworkTranslation;



    }//end word

    public Word (String defaultTranslation, String miworkTranslation, int imageResourceId)
    {
        mDefaultTranslation = defaultTranslation;

        mMiworkTranslation = miworkTranslation;

        mImageResourceId = imageResourceId;

    }//end word
    public String getmDefaultTranslation()
    {
        return mDefaultTranslation;
    }

    public String getmMiworkTranslation()
    {
        return mMiworkTranslation;
    }

    public int getImageResourceId()
    {
        return mImageResourceId;
    }

    public boolean hasImage()
    {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }



}//end class word
