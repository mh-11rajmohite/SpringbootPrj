
public class Customer {

	private Integer id;
	private String name;
	private Integer phono;
	private String gender;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getPhono() {
		return phono;
	}
	public void setPhono(Integer phono) {
		this.phono = phono;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", phono=" + phono + ", gender=" + gender + "]";
	}
	
	
}
