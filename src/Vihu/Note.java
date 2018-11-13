package Vihu;

import java.time.LocalDateTime;

public class Note {
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

	@Override
	public String toString() {
		return "Note{" +
				"note='" + note + '\'' +
				", dateTime=" + dateTime +
				", feeling=" + feeling +
				'}';
	}
}
