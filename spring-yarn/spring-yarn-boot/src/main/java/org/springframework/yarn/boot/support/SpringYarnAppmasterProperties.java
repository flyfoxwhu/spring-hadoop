package org.springframework.yarn.boot.support;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Spring Boot {@link ConfigurationProperties} for <code>spring.yarn.appmaster</code>.
 *
 * @author Janne Valkealahti
 *
 */
@ConfigurationProperties(name = "spring.yarn.appmaster")
public class SpringYarnAppmasterProperties {

	private String rmSchedulerAddress;
	private String containerFile;
	private String appmasterClass;
	private String containerRunner;
	private boolean waitLatch = true;
	private int containerCount = 1;
	private List<String> classpath;
	private Map<String, String> arguments;

	@Autowired
	private SpringYarnEnvProperties syep;

	public String getRmSchedulerAddress() {
		return syep.getScheduler() != null ? syep.getScheduler() : rmSchedulerAddress;
	}
	public void setRmSchedulerAddress(String rmSchedulerAddress) {
		this.rmSchedulerAddress = rmSchedulerAddress;
	}

	public String getContainerFile() {
		return containerFile;
	}
	public void setContainerFile(String containerFile) {
		this.containerFile = containerFile;
	}

	public String getAppmasterClass() {
		return appmasterClass;
	}
	public void setAppmasterClass(String appmasterClass) {
		this.appmasterClass = appmasterClass;
	}

	public String getContainerRunner() {
		return containerRunner;
	}
	public void setContainerRunner(String containerRunner) {
		this.containerRunner = containerRunner;
	}

	public boolean isWaitLatch() {
		return waitLatch;
	}
	public void setWaitLatch(boolean waitLatch) {
		this.waitLatch = waitLatch;
	}

	public int getContainerCount() {
		return containerCount;
	}
	public void setContainerCount(int containerCount) {
		this.containerCount = containerCount;
	}

	public List<String> getClasspath() {
		return classpath;
	}
	public void setClasspath(List<String> classpath) {
		this.classpath = classpath;
	}

	public Map<String, String> getArguments() {
		return arguments;
	}

	public void setArguments(Map<String, String> arguments) {
		this.arguments = arguments;
	}

}
