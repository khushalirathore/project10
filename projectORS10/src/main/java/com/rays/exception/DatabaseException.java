package com.rays.exception;

/**
 * DatabaseException is propogated by DAO classes when an unhandled Database
 * exception occurred
 * @author Khushali Rathore
 */
public class DatabaseException extends RuntimeException {

	/**
	 * @param msg
	 *            : Error message
	 *            
	 *          costum  uncheked exception
	 */
	public DatabaseException(String msg) {
		super(msg);
	}

}