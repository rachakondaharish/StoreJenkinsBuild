package com.jenkins.auditInfo;

/**
 * The main Spring Boot Application
 *
 * Author hema madhuri
 * Date   11/5/18
 */


public class BuildInfo {
	

		String buildId;
		String startTime;
		public String getBuildId() {
			return buildId;
		}
		public void setBuildId(String buildId) {
			this.buildId = buildId;
		}
		public String getStartTime() {
			return startTime;
		}
		public void setStartTime(String startTime) {
			this.startTime = startTime;
		}
		@Override
		public String toString() {
			return "BuildInfo [buildId=" + buildId + ", startTime=" + startTime + "]";
		}
		
		
}
