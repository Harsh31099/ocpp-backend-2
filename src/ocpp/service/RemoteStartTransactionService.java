package ocpp.service;

import ocpp.essential.Status;

public class RemoteStartTransactionService {
	//variables of req function...
		int connectorId;
		String idTag; //string of length 20...
		Status.ChargingProfile chargingProfile;
		boolean AuthorizationRemoteTxRequest;

		//variables of conf function...
		Status.RemoteStartStop status;

}
