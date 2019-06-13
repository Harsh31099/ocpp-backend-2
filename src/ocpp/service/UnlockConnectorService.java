package ocpp.service;

import ocpp.essential.Status;

public class UnlockConnectorService {
	/*req()*/
    int connectorID; //Required. This contains the identifier of the connector to be unlocked.
    /*conf()*/
    Status.Unlock status; //Required. This indicates whether the Charge Point has unlocked the connector.


}
