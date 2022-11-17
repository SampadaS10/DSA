package example.generic;

public class Association 
{

}

class Music
{
	
}
class ClassicalMusic extends Music
{
	
}
class Gazal
{
	private ClassicalMusic cm;
	
	public Music Sing(Singer s)
	{
		Music m=new Music();
				return m;
	}
}
class Singer
{
	
}

//ClassicalMusic is a music
//lightmusic is a music
//Gazal uses a Singer to sing
//Gazal produces a music
//Gazal has a classicalmusic


