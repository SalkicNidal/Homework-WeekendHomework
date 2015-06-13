package ba.bitcamp.homework.exercise;

public class Albums {
    String name;
    Artists artist;
    Song[] songs;
    String type;
    
    // Declaration of constructor
	public Albums(String name, Artists artist, Song[] songs, String type) {
		super();
		this.name = name;
		this.artist = artist;
		this.songs = songs;
		this.type = type;
	}


	// Declaration method to string
	public String toString() {
		String line = "";
		 line+=	"Albums [name="+ name + ", artist= " + artist.name + " ";
		for (int i= 0; i< songs.length; i ++) {
		
		line+= "Song is "+songs[i].nameOfSong +" ";
		}
		line+= " type=" + type + "]";
		
		return line;
	
    
	}
    
    
   
}