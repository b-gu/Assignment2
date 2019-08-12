package benjamin.gu.assignment2;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface Retrofit {

    //https://itunes.apple.com/search?term=rock&amp;amp;media=music&amp;amp;entity=song&amp;amp;limit=50
    @GET("search/1?")
    Call<ResultsPojo> getCategory(
            @Query("term") String term,
            @Query("media") String media,
            @Query("entity") String entity,
            @Query("limit") String limit
    );
}
