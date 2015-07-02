package example.adam.domain;

import java.util.List;

public class RestResponse {

	private String date;
	private String environment;
	private String version;
	private List<String> repository1;
	private List<String> repository2;

	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getEnvironment() {
		return environment;
	}
	public void setEnvironment(String environment) {
		this.environment = environment;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public List<String> getRepository1() {
		return repository1;
	}
	public void setRepository1(List<String> repository1) {
		this.repository1 = repository1;
	}
	public List<String> getRepository2() {
		return repository2;
	}
	public void setRepository2(List<String> repository2) {
		this.repository2 = repository2;
	}

}
