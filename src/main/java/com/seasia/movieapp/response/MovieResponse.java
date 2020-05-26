package com.seasia.movieapp.response;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.seasia.movieapp.model.MovieTO;

@XmlRootElement
public class MovieResponse {
	private List<MovieTO> movieList;

	public List<MovieTO> getMovies() {
		return movieList;
	}

	public void setAppDetails(List<MovieTO> movieList) {
		this.movieList = movieList;
	}
}
