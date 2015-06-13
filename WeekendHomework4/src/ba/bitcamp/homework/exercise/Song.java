package ba.bitcamp.homework.exercise;

import java.util.Arrays;

public class Song {

	public Artists  artist;
	public String nameOfSong;
	public Integer yearOfSong;
	public String typeOfSong;
	
	// Constructor for Song
	public Song(Artists artist, String nameOfSong, Integer yearOfSong,
			String typeOfSong) {
		super();
		this.artist = artist;
		this.nameOfSong = nameOfSong;
		this.yearOfSong = yearOfSong;
		this.typeOfSong = typeOfSong;
	}
	
	// to String
	public String toString() {
		return " \n Song name is " + nameOfSong+" \n Song artis is " + artist.name  
				+ " \n Year of song is " + yearOfSong + " genre of song is " + typeOfSong
				+ ".";
	}

	
}