package com.yrc.pojo;

public class EmojyItem extends Item{
	String itemId;
	String name;
	String image;

	public EmojyItem(String itemId, String name, String image) {
		this.itemId = itemId;
		this.name = name;
		this.image = image;
	}

	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String getImage() {
		return image;
	}

	@Override
	public void setImage(String image) {
		this.image = image;
	}

	@Override
	public String toString() {
		return "EmojyItem{" +
				"itemId='" + itemId + '\'' +
				", name='" + name + '\'' +
				", image='" + image + '\'' +
				'}';
	}
}
