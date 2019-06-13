package ocpp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import ocpp.essential.Status;

@Controller
public class RemoteStopTransactionController {
	//variables for conf function...
		Status.RemoteStartStop status;
		//variable for req function...
		int transactionId;


	@Autowired
	//private RemoteStopTransactionService bootNotificationService;
	
	@RequestMapping(value="/remoteStopTransaction",method=RequestMethod.POST)
	@ResponseBody
	public String remotestop(@RequestParam("id") String id) {
		//return bootNotificationService.bootDevice(id);
		return("Hello");
	}
}
