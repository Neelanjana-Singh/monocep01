package com.techlabs.model;

public class SecurityCamera implements SmartDevice,Monitorable {
  
	public String deviceId;
	public String name;
	public boolean recording;
	public SecurityCamera(String deviceId, String name, boolean recording) {
		super();
		this.deviceId = deviceId;
		this.name = name;
		this.recording = recording;
	}
	
	
	public String getStatus() {
		
		return null;
	}
	
	public String getName() {
		return name;
	}
	
	public String getDeviceId() {
		return deviceId;
	}


	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}


	public boolean isRecording() {
		return recording;
	}


	public void setRecording(boolean recording) {
		this.recording = recording;
	}


	public void setName(String name) {
		this.name = name;
	}


	public SecurityCamera() {
		super();
	}


	public String getdeviceId() {
		
		return deviceId;
	}
	
	public boolean displayStatus() {
		// TODO Auto-generated method stub
		return false;
	}
}