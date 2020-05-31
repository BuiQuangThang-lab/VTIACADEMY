package com.vti.entity;

public class Group {
	private int groupId;
	private String groupName;
	private Account creatorId;

	public Group() {
	}

	public Group(int groupId, String groupName, Account creatorId) {
		this.groupId = groupId;
		this.groupName = groupName;
		this.creatorId = creatorId;
	}

	public int getGroupId() {
		return groupId;
	}

	public String getGroupName() {
		return groupName;
	}

	public Account getCreatorId() {
		return creatorId;
	};

}
