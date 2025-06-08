package week10;

public class Game {
	private String title;
	private String version;
	
	public Game (String title, String version) {
		this.title = title;
		this.version = version;
		
	}
	
	public void start() {
		System.out.println("제목 : " + title);
		System.out.println("버전 : " + version);
	}
}
