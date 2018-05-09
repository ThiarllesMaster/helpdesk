package com.thiarlles.helpdesk.api.enums;

public enum StatusEnum {

	NEW,
	ASSIGNED, 
	RESOLVED,
	APPROVED,
	DISAPROVED,
	CLOSED;
	
	public static StatusEnum getStatus(String status) {
		switch (status) {
		case "New": return NEW;
		case "Assigned": return ASSIGNED;
		case "Resolved": return RESOLVED;
		case "Approved":return APPROVED;
		case "Disaproved":return DISAPROVED;
		case "Closed":return CLOSED;
		default: return NEW; 
		}
		
	}
	
}
