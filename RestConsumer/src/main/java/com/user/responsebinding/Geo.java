package com.user.responsebinding;

public class Geo {
	 public String lat;
	    public String lng;
	    public Geo() {
			
		}
		public String getLat() {
			return lat;
		}
		public void setLat(String lat) {
			this.lat = lat;
		}
		public String getLng() {
			return lng;
		}
		public void setLng(String lng) {
			this.lng = lng;
		}
		@Override
		public String toString() {
			return "Geo [lat=" + lat + ", lng=" + lng + "]";
		}
		
	    

}
