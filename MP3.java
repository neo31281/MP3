//import java.util.*;

public class MP3
{
	private String artist;
	private String title;
	private int length;
	
	public MP3(String a, String t, int l)
	{

		artist = a;
		title = t;
		setLength(l);
	}

	void setArtist(String a)
	{ 
		artist = a; 
	}
		
	void setTitle(String t)
	{
		title = t;
	}
	
	void setLength(int l)
	{ 
		if(l>0) 
			length = l; 
		else length = 1;
	}
		
	String getArtist()
	{ 
		return artist;
	}
	
	String getTitle()
	{ 
		return title;
	}
	
	int getLength()
	{ 
		return length;
	}

	public String toString()
	{

		int mins = length/60;
		int secs = length%60;
		String str = "";
		
		if(mins!=0)
			str = String.format("%d:%02d",mins,secs);
		else
			str = String.format("%d",secs);
		
		return "Artist name is " + artist + " Title is " + title + " With length of " + str;
	}
}

