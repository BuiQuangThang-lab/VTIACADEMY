package com.vti.entity.innerclass;

public class CPU {
	private int price;

	public CPU(int price) {
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	public class Processor {

		private int coreAmount;
		private String manufacturer;

		public Processor(int coreAmount, String manufacturer) {
			this.coreAmount = coreAmount;
			this.manufacturer = manufacturer;
		}

		public float getCache() {
			return 4.3f;
		}

		public int getCoreAmount() {
			return coreAmount;
		}

		public String getManufacturer() {
			return manufacturer;
		}

	}

	public class Ram {

		private int memory;
		private String manufacturer;

		public Ram(int memory, String manufacturer) {
			this.memory = memory;
			this.manufacturer = manufacturer;
		}

		public float getClockSpeed() {
			return 5.5f;
		}

		public int getMemory() {
			return memory;
		}

		public String getManufacturer() {
			return manufacturer;
		}
	}
}
