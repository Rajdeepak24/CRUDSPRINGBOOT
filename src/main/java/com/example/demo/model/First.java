package com.example.demo.model;

public class First {
		private int aid;
		private String aname;
		
		public int getAid() {
			return aid;
		}
		public void setAid(int aid) {
			this.aid = aid;
		}
		public String getAname() {
			return aname;
		}
		public void setAname(String aname) {
			this.aname = aname;
		}
		@Override
		public String toString() {
			return "First [aid=" + aid + ", aname=" + aname + "]";
		}
}
