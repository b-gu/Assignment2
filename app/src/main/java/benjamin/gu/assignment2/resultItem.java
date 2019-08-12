package benjamin.gu.assignment2;

import android.os.Parcel;
import android.os.Parcelable;

public class resultItem implements Parcelable {

    SongPojo songPojo;

    protected resultItem(Parcel in) {
    }

    public static final Creator<resultItem> CREATOR = new Creator<resultItem>() {
        @Override
        public resultItem createFromParcel(Parcel in) {
            return new resultItem(in);
        }

        @Override
        public resultItem[] newArray(int size) {
            return new resultItem[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
    }
}
