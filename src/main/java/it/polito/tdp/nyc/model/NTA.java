package it.polito.tdp.nyc.model;

import java.util.Set;

public class NTA {

	String NTAname;
	Set<String> SSIDs;
	
	public NTA(String nTAname, Set<String> ssids2) {
		super();
		NTAname = nTAname;
		SSIDs = ssids2;
	}
	public String getNTAname() {
		return NTAname;
	}
	public void setNTAname(String nTAname) {
		NTAname = nTAname;
	}
	public Set<String> getSSIDs() {
		return SSIDs;
	}
	public void setSSIDs(Set<String> sSIDs) {
		SSIDs = sSIDs;
	}
	
	
}
