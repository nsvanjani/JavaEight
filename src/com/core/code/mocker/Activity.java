package com.core.code.mocker;

import java.time.LocalDate;

public class Activity {

	private String name;
	private Integer durationInMinutes;
	private Boolean isSport;
	private LocalDate lastPerformedDate;

	public Activity(String name, Integer durationInMinutes, Boolean isSport, LocalDate lastPerformedDate) {
		super();
		this.name = name;
		this.durationInMinutes = durationInMinutes;
		this.isSport = isSport;
		this.lastPerformedDate = lastPerformedDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getDurationInMinutes() {
		return durationInMinutes;
	}

	public void setDurationInMinutes(Integer durationInMinutes) {
		this.durationInMinutes = durationInMinutes;
	}

	public Boolean getIsSport() {
		return isSport;
	}

	public void setIsSport(Boolean isSport) {
		this.isSport = isSport;
	}

	public LocalDate getLastPerformedDate() {
		return lastPerformedDate;
	}

	public void setLastPerformedDate(LocalDate lastPerformedDate) {
		this.lastPerformedDate = lastPerformedDate;
	}

	@Override
	public String toString() {
		return "Activity [name=" + name + ", durationInMinutes=" + durationInMinutes + ", isSport=" + isSport
				+ ", lastPerformedDate=" + lastPerformedDate + "]";
	}

}
