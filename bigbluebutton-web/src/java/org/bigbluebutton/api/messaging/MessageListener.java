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

package org.bigbluebutton.api.messaging;

public interface MessageListener {
	void meetingStarted(String meetingId);
	void meetingEnded(String meetingId);
	void userJoined(String meetingId, String internalUserId, String externalUserId, String name, String role, String guest);
	void userLeft(String meetingId, String internalUserId);
	void updatedStatus(String meetingId, String internalUserId, String status, String value);
	void userJoinedVoice(String meetingId);
	void userLeftVoice(String meetingId);
}
