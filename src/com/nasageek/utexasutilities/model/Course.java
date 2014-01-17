package com.nasageek.utexasutilities.model;

import java.io.Serializable;

import android.os.Parcelable;

public abstract class Course implements Parcelable, Serializable {

    private static final long serialVersionUID = 1L;
    protected String id;
	protected String name;
	protected String course_code;
	protected String start_at;
	protected String type;
	protected String term_name;
	
	public String getCourseCode() {
		return course_code;
	}
	
	public String getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public String getType() {
		return type;
	}
	
	public String getTermName() {
		return term_name;
	}
}