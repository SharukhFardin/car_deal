package car_dealership;

public class Vehicle {
	String Vname;
	String Vcolor;
	int Vprice;
	
	public Vehicle(String name, String color, int price) {
		super();
		this.Vname = name;
		this.Vcolor = color;
		this.Vprice = price;
	}

	public String getVname() {
		return Vname;
	}

	public void setVname(String vname) {
		Vname = vname;
	}

	public String getVcolor() {
		return Vcolor;
	}

	public void setVcolor(String vcolor) {
		Vcolor = vcolor;
	}

	public int getVprice() {
		return Vprice;
	}

	public void setVprice(int vprice) {
		Vprice = vprice;
	}

	@Override
	public String toString() {
		return "Vehicle [Vname=" + Vname + ", Vcolor=" + Vcolor + ", Vprice=" + Vprice + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Vcolor == null) ? 0 : Vcolor.hashCode());
		result = prime * result + ((Vname == null) ? 0 : Vname.hashCode());
		result = prime * result + Vprice;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vehicle other = (Vehicle) obj;
		if (Vcolor == null) {
			if (other.Vcolor != null)
				return false;
		} else if (!Vcolor.equals(other.Vcolor))
			return false;
		if (Vname == null) {
			if (other.Vname != null)
				return false;
		} else if (!Vname.equals(other.Vname))
			return false;
		if (Vprice != other.Vprice)
			return false;
		return true;
	}

}
