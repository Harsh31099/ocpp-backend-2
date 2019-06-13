package ocpp.service;

import ocpp.essential.Status;

public class TriggerMessageService {
	/*req()*/
    Status.MessageTrigger requestedMessage; //Required.
    int connectorID; //Optional. Only filled in when reqeuest applies to a specific connector

    /*conf()*/
    Status.TriggerMessage status; //Required. Indicates whether the charge point will send the requested
                                        //notification or not.

}
