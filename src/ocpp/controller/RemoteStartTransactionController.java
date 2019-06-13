package ocpp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import ocpp.essential.Status;
@Controller
public class RemoteStartTransactionController {
	int connectorId;
	String idTag; //string of length 20...
	Status.ChargingProfile chargingProfile;
	boolean AuthorizationRemoteTxRequest;

	//variables of conf function...
	Status.RemoteStartStop status;
	@Autowired
	//private RemoteStartTransactionService bootNotificationService;
	
	@RequestMapping(value="/remoteStartTransaction",method=RequestMethod.POST)
	@ResponseBody
	public String remotestart(@RequestParam("id") String id) {
		//return bootNotificationService.bootDevice(id);
		return("Hello");
	}

}
