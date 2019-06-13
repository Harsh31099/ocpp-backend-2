package ocpp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import ocpp.essential.ChargingProfile;
import ocpp.essential.Status;
@Controller
public class SetChargingProfileController {
	/*req()*/
    int connectorId;
    ChargingProfile csChargingProfiles;

    /*conf()*/
    Status.ChargingProfile status;

    /*requests are made in 4 situations:
    1. At start of transaction to set the charging profile for the transaction
    2. In a RemoteStartTransaction.req sent to a charge point.
    3. During a transaction to change the active profile for the transaction
    4. Outside the context of a transaction as a separate message to set a charging profile to a local controller,
    Charge point or a default charging profile to a connector
     */
	@Autowired
	//private SetChargingProfileService bootNotificationService;
	
	@RequestMapping(value="/setChargingProfile",method=RequestMethod.POST)
	@ResponseBody
	public String setchargepro(@RequestParam("id") String id) {
		//return bootNotificationService.bootDevice(id);
		return("HEllo");
	}
}
