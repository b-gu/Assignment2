package benjamin.gu.assignment2;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

public class CustomViewHolder extends RecyclerView.ViewHolder {

    ImageView songArt;
    TextView tvArtistName, tvAlbumName, tvSongPrice;

    public CustomViewHolder(@NonNull View itemView) {
        super(itemView);
        songArt = itemView.findViewById(R.id.coverArt);
        tvArtistName = itemView.findViewById(R.id.artistName);
        tvAlbumName = itemView.findViewById(R.id.collectionName);
        tvSongPrice = itemView.findViewById(R.id.trackPrice);
    }

    public void bindViewHolder(final resultItem item, final CustomListener listener){
        tvAlbumName.setText(item.songPojo.collectionName);
        tvAlbumName.setText(item.songPojo.artistName);
        Picasso.get().load(item.songPojo.artworkUrl60).into(songArt);
        tvSongPrice.setText(item.songPojo.trackPrice + "USD");
        itemView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                listener.itemClicked(item);
            }
        });
    }

    public void setArtist(String artist){
        tvArtistName.setText(artist);
    }

    public void setAlbum(String album){
        tvAlbumName.setText(album);
    }

    public void setPrice(String price){
        tvSongPrice.setText(price);
    }

    public void setPic(String url){
        Picasso.get().load(url).placeholder(R.drawable.ic_launcher_background)
                .error(R.drawable.ic_launcher_background).into(songArt);
    }
}
