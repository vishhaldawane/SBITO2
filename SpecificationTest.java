
public class SpecificationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String album="Pushpa : The Rise";
		
		Lyrics lyrics1 = new Lyrics();
		Lyrics lyrics2 = new Lyrics();
		
		lyrics1.setLyricsTitle("Saami Saami (Telugu)");
		lyrics1.setLine("Nuv ammee ammee antaante\r\n"
				+ "Nee anayipoyinattundiraa\r\n"
				+ "Saami na saami\r\n"
				+ "\r\n"
				+ "Ninnu saami saami antaante\r\n"
				+ "Naa penimiti lekka sakkangundira\r\n"
				+ "Saami na saami\r\n");
		
		lyrics2.setLyricsTitle("Saami Saami (Hindi)");
		lyrics2.setLine("Tu Janu Banu Jo Kehta Hai\r\n"
				+ "Bivi Teri Hoon Lagta Hai\r\n"
				+ "Saami Mor Saami\r\n"
				+ "\r\n"
				+ "Main Sami Sami Jo Kehti Hoon\r\n"
				+ "Marad Mera Tu Lagta Hai\r\n"
				+ "Saami Mor Saami\r\n"
				+ "\r\n");

		Singer theSinger1 = new Singer("Mounika Yadav",25,'F',300, lyrics1);
		Singer theSinger2 = new Singer("Sunidhi Chauhan",32,'F',350, lyrics2);
		

		
		Music music1 = new Music();
		Music music2 = new Music();
		
		music1.setMusicTitle(album);
		music1.setNotes("Notes by Devi Sri Prasad");
		
		music2.setMusicTitle(album);
		music2.setNotes("Notes by Devi Sri Prasad");
		
		try {
			Song theSong1 = theSinger1.sing(album, lyrics1, music1, 2022);
			Song theSong2 = theSinger2.sing(album, lyrics2, music2, 2022);
			
			System.out.println(theSong1);
			System.out.println(theSong2);
			
		} catch (ThroatException e) {
			System.out.println("Throat problemmm..."+e);
		}
		
		Thread t1 = new Thread(theSinger1);
		Thread t2 = new Thread(theSinger2);
		
		t1.start();
		t2.start();

	}

}

class ThroatException extends Exception
{
	ThroatException (String str) {
		super(str);
	}
}
interface Singing
{
	Song sing(String album, Lyrics l, Music m,int year) throws ThroatException;
}
class Music
{
	String musicTitle;
	String notes;

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public String getMusicTitle() {
		return musicTitle;
	}

	public void setMusicTitle(String musicTitle) {
		this.musicTitle = musicTitle;
	}

}
class Lyrics
{
	String lyricsTitle;
	
	String line;

	public String getLine() {
		return line;
	}

	public void setLine(String line) {
		this.line = line;
	}

	public String getLyricsTitle() {
		return lyricsTitle;
	}

	public void setLyricsTitle(String lyricsTitle) {
		this.lyricsTitle = lyricsTitle;
	}
	
	
	
}
class Song
{
	String title;
	String artist;
	String album;
	int year;
	public Song(String title, String artist, String album, int year) {
		super();
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.year = year;
	}
	@Override
	public String toString() {
		return "Song [title=" + title + ", artist=" + artist + ", album=" + album + ", year=" + year + "]";
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	
	
}
abstract class Person 
{
	String name;
	int age;
	char gender;
	
	public Person(String name, int age, char gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	void showPerson() {
		System.out.println("name   : "+name);
		System.out.println("age    : "+age);
		System.out.println("gender : "+gender);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	
}
class Singer extends Person implements Singing, Runnable //isA 
{
	int numberOfSongsPlayed;
	Lyrics l;
	
	public Singer(String name, int age, char gender, int numberOfSongsPlayed) {
		super(name, age, gender);
		this.numberOfSongsPlayed = numberOfSongsPlayed;
	}
	public Singer(String name, int age, char gender, int numberOfSongsPlayed, Lyrics l) {
		super(name, age, gender);
		this.numberOfSongsPlayed = numberOfSongsPlayed;
		this.l = l;
	}

	void showSinger() {
		super.showPerson();
		System.out.println("songs  : "+ numberOfSongsPlayed);
	}
	public Song sing(String album, Lyrics l, Music m, int year) throws ThroatException
	{
		System.out.println(getName()+" Singer is singing the song.....");
		Song theSong = new Song(l.getLyricsTitle(),getName(),m.getNotes(),year);
		return theSong;
	}
	public void run() {
		for(int i=1;i<=30;i++) {
			System.out.println(getName()+" is singing..."+l.getLyricsTitle());
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}








class A
{
	int i;
	
	int a;
	String b;
	float c;
	
	A(int a, String b, float c) {
		this.a = a;
		this.b= b;
		this.c = c;
	}
	void fun(int j) {
		
	}
	void foo(String s) {
		
	}
	void far(float k) {
		
	}
	
	void run() {
		fun(a);
		foo(b);
		far(c);
		
	}
}


/*
 * 
 * 				entertainment
 * 						|
 * 			----------------------------------
 * 			|
 * 		   movie
 * 			|
 * 	--------------------------------
 * 	|			|			|			|
 * songartist	composer	director		
 * 	|			|
 * Singer		Music
 * Song			Lyrics
 * ThroatException
 * 
 * 
 * 
 * 
 */


















