/**
* BigBlueButton open source conferencing system - http://www.bigbluebutton.org/
* 
* Copyright (c) 2012 BigBlueButton Inc. and by respective authors (see below).
*
* This program is free software; you can redistribute it and/or modify it under the
* terms of the GNU Lesser General Public License as published by the Free Software
* Foundation; either version 3.0 of the License, or (at your option) any later
* version.
* 
* BigBlueButton is distributed in the hope that it will be useful, but WITHOUT ANY
* WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A
* PARTICULAR PURPOSE. See the GNU Lesser General Public License for more details.
*
* You should have received a copy of the GNU Lesser General Public License along
* with BigBlueButton; if not, see <http://www.gnu.org/licenses/>.
*
*/
package org.bigbluebutton.conference.service.layout;

public class LayoutRoom {

	private final String meetingID;
	private final Boolean recorded;
	
	private boolean locked = false;
	private String setByUserID = "-1";
	private String currentLayout = "";
	
	public LayoutRoom(String meetingID, Boolean recorded) {
		this.meetingID = meetingID;
		this.recorded = recorded;
	}
	
	public String getMeetingID() {
		return meetingID;
	}
	
	public Boolean isRecorded() {
		return recorded;
	}
				
	public void lockLayout(String setByUserID, String layout) {
		locked = true;
		this.setByUserID = setByUserID;
		currentLayout = layout;
	}

	public void unlockLayout() {
		locked = false;
		setByUserID = "-1";
		currentLayout = "";
	}
	
	public boolean isLocked() {
		return locked;
	}

	public String getSetByUserID() {
		return setByUserID;
	}

	public String getCurrentLayout() {
		return currentLayout;
	}
}