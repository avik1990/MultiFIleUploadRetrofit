package com.app.multifileuploadretrofit.Api;

import com.app.multifileuploadretrofit.model.ResponseApiModel;

import java.util.List;

import okhttp3.MultipartBody;
import retrofit2.Call;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

/**
 * Created by hakiki95 on 4/26/2017.
 */

public interface ApiServices {

    @Multipart
    @POST("uploadFileInServer")
    Call<ResponseApiModel> uploadImage(@Part List<MultipartBody.Part> image);
}
