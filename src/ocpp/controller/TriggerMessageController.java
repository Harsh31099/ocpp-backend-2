package ocpp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import ocpp.essential.Status;

@Controller
public class TriggerMessageController {
	/*req()*/
    Status.MessageTrigger requestedMessage; //Required.
    int connectorID; //Optional. Only filled in when reqeuest applies to a specific connector

    /*conf()*/
    Status.TriggerMessage status; //Required. Indicates whether the charge point will send the requested
                                        //notification or not.
	@Autowired
	//private TriggerMessageService bootNotificationService;
	
	@RequestMapping(value="/triggerMessage",method=RequestMethod.POST)
	@ResponseBody
	public String trigmsg(@RequestParam("id") String id) {
	//	return bootNotificationService.bootDevice(id);
	return ("Hello");
	}
}
