package mule.ci.tool.app.api;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import mule.ci.tool.app.api.model.APIAssetsResponse;
import mule.ci.tool.app.util.AppException;
import mule.ci.tool.app.util.Const;

public class CloudhubAPICallerTest {

	// private static final Logger log =
	// LoggerFactory.getLogger(CloudhubAPICallerTest.class);

	@Before
	public void setUp() {
		Const.init("config.yaml");
	}
	
	@Test
	public void findApplication() throws AppException {
		CloudhubAPICaller caller = new CloudhubAPICaller();
		caller.findApplication();
	}

	@Ignore @Test
	public void saveApplication() throws AppException {
		APIManagerAPICaller apicaller = new APIManagerAPICaller();
		APIAssetsResponse res = apicaller.findAPIInstance();
		CloudhubAPICaller caller = new CloudhubAPICaller();
		String domain = String.format(Const.DOMAIN, Const.ENV_NAME);
		caller.saveApplication(domain, res.getId());
	}

	@Ignore @Test
	public void updateApplication() throws AppException {
		APIManagerAPICaller apicaller = new APIManagerAPICaller();
		APIAssetsResponse res = apicaller.findAPIInstance();
		CloudhubAPICaller caller = new CloudhubAPICaller();
		caller.updateApplication(Const.ENV_NAME, res.getId());
	}

	@Ignore @Test
	public void findRuntimeAlert() throws AppException {
		CloudhubAPICaller caller = new CloudhubAPICaller();
		caller.findRuntimeAlert();
	}

	@Ignore @Test
	public void saveRuntimeAlert() throws AppException {
		CloudhubAPICaller caller = new CloudhubAPICaller();
		caller.saveRuntimeAlert("event-threshold-exceeded");
	}

	@Ignore @Test
	public void deleteRuntimeAlert() throws AppException {
		CloudhubAPICaller caller = new CloudhubAPICaller();
		caller.deleteRuntimeAlert("ff9bb42f-8688-43d6-91e6-47869af1062c");
	}

	@Ignore @Test
	public void saveAllRuntimeAlert() throws AppException {

		CloudhubAPICaller caller = new CloudhubAPICaller();
		caller.saveRuntimeAlerts();
	}

	@Ignore @Test
	public void deleteAllRuntimeAlert() throws AppException {
		CloudhubAPICaller caller = new CloudhubAPICaller();
		caller.deleteRuntimeAlerts();
	}
	
	@Ignore @Test
	public void checkAndSaveRuntimeAlerts() throws AppException {

		CloudhubAPICaller caller = new CloudhubAPICaller();
		caller.checkAndSaveRuntimeAlerts();
	}

	@Ignore @Test
	public void findAcount() throws AppException {
		CloudhubAPICaller caller = new CloudhubAPICaller();
		caller.findAccount();
	}
}
