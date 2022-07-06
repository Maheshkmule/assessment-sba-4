package com.springbootapicricket.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name ="Player_Table")
public class Player {
	
	    @Id
	    @GeneratedValue
	    private int id;
	    @Column(name = "PlayerName")
	    private String name;
	    @Column(name = "RunScore")
	    private int run;
	    @Column(name = "PlayerType")
	    private String type;
		public Player(int id, String name, int run, String type) {
			super();
			this.id = id;
			this.name = name;
			this.run = run;
			this.type = type;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getRun() {
			return run;
		}
		public void setRun(int run) {
			this.run = run;
		}
		public String getType() {
			return type;
		}
		public void setType(String type) {
			this.type = type;
		}
		@Override
		public String toString() {
			return "Player [id=" + id + ", name=" + name + ", run=" + run + ", type=" + type + "]";
		}
	    
	    
}
