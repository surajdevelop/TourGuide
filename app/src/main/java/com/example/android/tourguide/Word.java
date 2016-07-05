package com.example.android.tourguide;

/**
 * Created by Neeraj on 6/28/2016.
 */
public class Word {

    private int mNameId;

    private int mAddressId;

    private int mFamousId;
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    public Word(int NameId, int AddressId, int FamousId, int ImageResourceId) {
        this.mNameId = NameId;
        this.mAddressId = AddressId;
        this.mFamousId = FamousId;
        this.mImageResourceId = ImageResourceId;
    }

    public Word(int mNameId, int mAddressId, int mFamousId) {
        this.mNameId = mNameId;
        this.mAddressId = mAddressId;
        this.mFamousId = mFamousId;
    }

    public int getNameId() {
        return mNameId;
    }

    public int getAddressId() {
        return mAddressId;
    }

    public int getFamousId() {
        return mFamousId;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}
