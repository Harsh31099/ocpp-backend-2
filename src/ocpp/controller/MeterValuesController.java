package ocpp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import ocpp.baseclasses.Reset;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import ocpp.essential.MeterValue;

@Controller
public class MeterValuesController {
	/*req()*/
	Reset onj;
	int connectorId;
	int transactionId;
	MeterValue meterValue;

	/*conf()*/
	//no variables
	
	@Autowired
	//private MeterValuesService bootNotificationService;
	
	@RequestMapping(value="/meterValues",method=RequestMethod.POST)
	@ResponseBody
	public String meterval(@RequestParam("id") String id) {
		//return bootNotificationService.bootDevice(id);
		return ("Hello");
	}
}
