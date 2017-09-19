package COM.CHASE.java.Example.model;

public class Topic {
	private long	Id;
	private String	name;
	private String	description;

	public Topic() {

	}
	public Topic(long id, String name, String description) {
		super();
		Id = id;
		this.name = name;
		this.description = description;
	}
	/**
	 * @return the id
	 */
	public long getId() {
		return Id;
	}
	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(long id) {
		Id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description
	 *            the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

}
