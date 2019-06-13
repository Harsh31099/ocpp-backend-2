package ocpp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import ocpp.essential.Status;
@Controller
public class UnlockConnectorController {
	/*req()*/
    int connectorID; //Required. This contains the identifier of the connector to be unlocked.
    /*conf()*/
    Status.Unlock status; //Required. This indicates whether the Charge Point has unlocked the connector.

	@Autowired
	//private UnlockConnectorService unlockConnectorController;
	
	@RequestMapping(value="/unlockConnector",method=RequestMethod.POST)
	@ResponseBody
	public String unlockcnctr(@RequestParam("id") String id) {
		return ("Hello");
		//return unlockConnectorController.bootDevice(id);
	}
}
