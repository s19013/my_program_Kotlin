package com.example.movie

import org.springframework.jdbc.core.JdbcTemplate
import org.springframework.jdbc.core.RowMapper
import org.springframework.stereotype.Repository

@Repository
class GetMovieList (private val jdbcTemplate:JdbcTemplate){
    private val movieListMapper = RowMapper {
        rs,_->
        DataMovieList(rs.getString("name"),rs.getString("day"),rs.getString("time"),rs.getInt("kuuseki"))
    }

    val table :List<DataMovieList> = jdbcTemplate.query("select name,day,time,kuuseki from movie_list",movieListMapper)


    fun showAll():List<DataMovieList> = table
}

