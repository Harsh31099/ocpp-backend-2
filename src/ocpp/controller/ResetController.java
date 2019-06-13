package ocpp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import ocpp.essential.Status;
import ocpp.essential.Type;
@Controller
public class ResetController {
	/*req()*/
    Type.Reset type; //Required. This contains the type of reset that the Charge Point should perform.

    /*conf()*/
    Status.Reset status; //Required. This indicates whether the Charge Point is able to perform the reset.

    /*default constructor*/
	@Autowired
	//private ResetService bootNotificationService;
	
	@RequestMapping(value="/reset",method=RequestMethod.POST)
	@ResponseBody
	public String rst(@RequestParam("id") String id) {
		//return bootNotificationService.bootDevice(id);
		return("Hello");
	}

}
