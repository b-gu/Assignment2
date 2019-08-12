package benjamin.gu.assignment2;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "Song_Table")
public class SongItem {
    @ColumnInfo(name = "ArtWork")
    public String artworkUrl60;
    @ColumnInfo(name = "Track")
    public String trackName;
    @ColumnInfo(name = "ArtistName")
    public String artistName;
    public String previewUrl;
    @ColumnInfo(name = "TrackPrice")
    public String trackPrice;

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id") //Master Key
    public int id;

    @NonNull
    public String getTrackName() {
        return trackName;
    }
    public String getArtistName() {

        return artistName;
    }

    public String getPreviewUrl() {
        return previewUrl;
    }
    public String getArtworkUrl100() {
        return artworkUrl60;
    }
    public String getTrackPrice() {
        return trackPrice;
    }
}