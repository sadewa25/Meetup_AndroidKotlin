package com.flashcom.meetup3.retrofit

import com.flashcom.meetup3.model.Response
import retrofit2.Call
import retrofit2.http.GET

interface RetrofitClient {
    @GET("search_all_teams.php?l=English%20Premier%20League")
    fun getLeague(): Call<Response>
}