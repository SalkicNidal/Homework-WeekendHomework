package ba.bitcamp.homework.exercise;

import java.util.Arrays;

public class main {
	/**
	 * Calculated max number of songs in concert
	 * 
	 * @param c
	 *            - concert
	 * @return - number of song
	 */
	public static int getMaxNumberOfSongs(Concert c) {
		int counter = 0;
		for (int i = 0; i < c.artist.length; i++) {
			for (int j = 0; j < c.songs.length; j++) {
				if (c.artist[i].equals(c.songs[j].artist)) {
					counter++;
				}
			}
		}
		return counter;
	}

	/**
	 * Get number of song per album
	 * 
	 * @param c
	 *            - Concert
	 * @param a
	 *            - album
	 * @return Array of song per concert
	 */
	public static int[] getNumberOfSongsPerAlbum(Concert c, Albums[] a) {
		int arr[] = new int[a.length];
		for (int i = 0; i < c.songs.length; i++) {
			for (int j = 0; j < a.length; j++) {
				for (int k = 0; k < a[j].songs.length; k++) {
					if (c.songs[i].equals(a[j].songs[k])) {
						arr[i] = +1;
					}
				}

			}
		}
		return arr;
	}

	/**
	 * Print album information
	 * 
	 * @param a
	 *            - entered album
	 * @param s
	 *            - checkin song
	 */
	public static void printAlbumInformation(Albums[] a, Song s) {

		String line = " ";
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].songs.length; j++) {
				if (a[i].songs[j].equals(s)) {
					line += a[i].name;
					System.out.println("Name of album is " + line);
				}
			}
		}

	}

	/**
	 * Get number of song which same at entered genre
	 * 
	 * @param a
	 *            - album
	 * @param genre
	 *            - looking genre
	 * @return number of song at same genre
	 */
	public static int countGenreNumber(Albums a, String genre) {

		int counter = 0;
		if (a.type.equals(genre)) {
			counter++;
		}
		return counter;
	}

	/**
	 * Method which checking older song
	 * 
	 * @param s
	 *            - Song one
	 * @param s2
	 *            - Song two
	 * @return - Older song
	 */
	public static Song getOlderSong(Song s, Song s2) {

		if (s.yearOfSong > s2.yearOfSong) {
			return s2;
		}
		return s;

	}

	/**
	 * Method checking is artist of song single or group
	 * 
	 * @param s2
	 *            - Song
	 * @return - True - artist of song is group False - artist of song is solo
	 */
	public static boolean isFromSoloAuthor(Song s2) {

		if (s2.artist.isGroup.equals(true)) {
			return true;
		}
		return false;
	}

	/**
	 * Method which check is same author
	 * 
	 * @param s1
	 *            [] - song 1
	 * @param s2
	 *            - song 2
	 * @return True - author is same False - author is not same
	 */
	public static boolean isSameAuthor(Song s1, Song s2) {

		if (s1.artist.name.equals(s2.artist.name)) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {

		// Declaration of new Artists with constructor
		Artists Art1 = new Artists("Magla band", true, 2001, "rock");
		Artists Art2 = new Artists("Regina", true, 1995, "pop-rock");
		Artists Art3 = new Artists("Massimo", false, 1895, "pop - rock");
		Artists Art4 = new Artists("KunikoKato", false, 2000, "classic");
		// Declaration array of artists
		Artists[] ar1 = new Artists[4];
		ar1[0] = Art1;
		ar1[1] = Art2;
		ar1[2] = Art3;
		ar1[3] = Art4;
		// Declaration the new songs with constructor
		Song s1 = new Song(Art1, "Rein", 2002, "rock");
		Song s2 = new Song(Art1, "Ball", 2005, "balads");
		Song s3 = new Song(Art1, "Unstoppable Day", 2010, "rock");
		Song s4 = new Song(Art1, "Loose Parade", 2011, "balads");
		// Declaration array of songs
		Song[] S = new Song[4];
		S[0] = s1;
		S[1] = s2;
		S[2] = s3;
		S[3] = s4;
		// Declaration the new songs with constructor
		Song s5 = new Song(Art2, "Sama", 2011, "rock");
		Song s6 = new Song(Art2, "Last time", 2007, "Rock");
		Song s7 = new Song(Art2, "Nothing But Perfectionism", 2010, "rock");
		Song s8 = new Song(Art2, "See you again", 2014, "balads");
		// Declaration array of songs
		Song[] S1 = new Song[4];
		S1[0] = s5;
		S1[1] = s6;
		S1[2] = s7;
		S1[3] = s8;
		// Declaration the new songs with constructor
		Song s11 = new Song(Art3, "Sky", 1999, "balads");
		Song s12 = new Song(Art3, "Try", 2007, "instrumental");
		Song s13 = new Song(Art4, "Nothing But Perfectionism", 2010, "rock");
		// Declaration array of songs
		Song[] S11 = new Song[3];
		S11[0] = s11;
		S11[1] = s12;
		S11[2] = s13;
		// Declaration the new songs with constructor
		Song s14 = new Song(Art4, "Ieanis Xenakis", 2010, "classic");
		Song s15 = new Song(Art4, "Hux Nax", 2003, "classic");
		Song s16 = new Song(Art4, "Jong Jang ", 2010, "rock");
		// Declaration array of songs
		Song[] S3 = new Song[3];
		S3[0] = s14;
		S3[1] = s15;
		S3[2] = s16;
		// Declaration of albums
		Albums a1 = new Albums("Rein", Art1, S, "rock");
		Albums a2 = new Albums("Sama", Art2, S1, "pop rock");
		Albums a3 = new Albums("Try catch the Sky", Art3, S11, "balads");
		Albums a4 = new Albums("Chao Min", Art4, S3, "classic");
		// Declaration array of albums
		Albums[] all = new Albums[4];
		all[0] = a1;
		all[1] = a2;
		all[2] = a3;
		all[3] = a4;
		// Declaration of concert
		Concert c1 = new Concert(ar1, S1);
		Concert c2 = new Concert(ar1, S3);
		// Print method 1
		System.out.print("Entered song from same author is: ");
		System.out.println(isSameAuthor(s5, s7));
		// Print method 2
		System.out.print("Solo author for enterd song is: ");
		System.out.println(isFromSoloAuthor(s2));
		// Print older song
		System.out.print("Older song is: ");
		System.out.println(getOlderSong(s3, s11));
		// Print the number of same genre in the album with method
		System.out.print("Number of song at entered genre is: ");
		System.out.println(countGenreNumber(a3, "balads"));
		// Finding the song in the album and print the album name
		printAlbumInformation(all, s5);
		System.out.println("Number of song  per  album is: ");
		System.out.println(Arrays.toString(getNumberOfSongsPerAlbum(c1, all)));
		// Print the max number of songs
		System.out.print("Max number of songs in concert is: ");
		System.out.println(getMaxNumberOfSongs(c1));

	}

}