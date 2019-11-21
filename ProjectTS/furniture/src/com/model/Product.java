package com.model;

public class Product {
	private int id;
	private String name;
	private int price;
	private String imageUrl;
	private String category;
	public Product() {
		super();
	}
	public Product(int id, String name, int price, String imageUrl, String category) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.imageUrl = imageUrl;
		this.category = category;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", imageUrl=" + imageUrl + ", category="
				+ category + "]";
	}
	
}
