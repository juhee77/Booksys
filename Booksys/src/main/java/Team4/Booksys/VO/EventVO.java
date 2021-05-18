package Team4.Booksys.VO;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="EVENT")
public class EventVO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int oid;
	private int rid;
	private String event_type;
	private String event_song;
	private String event_memo;
	
	public void setVal_oid(int val) {
	    this.oid = val;
	}
	public void setVal_rid(int val) {
        this.rid = val;
	}
	public void setVal_event_type(String val) {
        this.event_type = val;
	}
	public void setVal_event_song(String val) {
        this.event_song = val;
	}
	public void setVal_event_memo(String val) {
        this.event_memo = val;
	}
	
	public int getVal_oid() {
	    return this.oid;
	}
	public int getVal_rid() {
	    return this.rid;
	}
	public String getVal_event_type() {
	    return this.event_type;
	}
	public String getVal_event_song() {
	    return this.event_song;
	}
	public String getVal_event_memo() {
	    return this.event_memo;
	}
}
