package Vihu;

import java.io.Serializable;
import java.time.LocalDateTime;

public class Note implements Serializable {
	private final String note;
	private final LocalDateTime dateTime;
	private final Feeling feeling;

	public Note(String note, LocalDateTime dateTime, Feeling feeling) {
		this.note = note;
		this.dateTime = dateTime;
		this.feeling = feeling;
	}

	public LocalDateTime getDate(){
		return dateTime;
	}

	public Feeling getFeeling(){
		return feeling;
	}

	@Override
	public String toString() {
		return "Note{" +
				"note='" + note + '\'' +
				", dateTime=" + dateTime +
				", feeling=" + feeling +
				'}';
	}
}
