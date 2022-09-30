package com.abcsolition.timesheet;

public class DuplicateTimeSheetException extends RuntimeException {
	static final long serialVersionUID=1L;

	public DuplicateTimeSheetException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "DuplicateTimeSheetException";
	}
	
}
