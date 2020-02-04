package capgemini.firstproject.books;

public abstract class MediaItem extends Item {
	
	int CD_ID,VideoID;
	String CD_Type,VideoType;
	public abstract void BookQuality();
	public int getCD_ID() {
		return CD_ID;
	}
	public void setCD_ID(int cD_ID) {
		CD_ID = cD_ID;
	}
	public int getVideoID() {
		return VideoID;
	}
	public void setVideoID(int videoID) {
		VideoID = videoID;
	}
	public String getCD_Type() {
		return CD_Type;
	}
	public void setCD_Type(String cD_Type) {
		CD_Type = cD_Type;
	}
	public String getVideoType() {
		return VideoType;
	}
	public void setVideoType(String videoType) {
		VideoType = videoType;
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}
}
