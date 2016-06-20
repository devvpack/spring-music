package org.cloudfoundry.samples.music.cloud.service;

import org.springframework.cloud.service.ServiceInfo.ServiceLabel;
import org.springframework.cloud.service.common.RelationalServiceInfo;

@ServiceLabel("mssql")
public class MsSqlServiceInfo extends RelationalServiceInfo {

	public MsSqlServiceInfo(String id, String uriString, String jdbcUrlDatabaseType) {
		super(id, uriString, jdbcUrlDatabaseType);
	}
}
