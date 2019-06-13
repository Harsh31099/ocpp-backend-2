package ocpp.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import ocpp.essential.ErrorCode;
import ocpp.essential.Status;
@Controller
public class StatusNotificationController {
	/*req()*/
	int connectorID; /*Required. The id of the connector for which the status is reported. Id '0'(zero)
					   is used if the status is for the charge point main controller*/

	ErrorCode.ChargePoint errorCode;//Required.This contains the error code reported by the ChargePoint

	String info; //Optional. Additional free format info related to the error. Length <50

	Status.ChargePoint status; //Required. This contains	the current status of the Charge Point.

	Date timestamp; //Optional. The time for which the status is reported. If absent time of receipt of the message
	//will be assumed.

	String vendorId; //Optional. This identifies the vendor-specific implementation.

	String vendorErrorCode; //Optional. This contains the vendor-specific error code.

	//no conf() variables
	@Autowired
	@RequestMapping(value="/statusNotification",method=RequestMethod.POST)
	@ResponseBody
	public String statusnoti(@RequestParam("id") String id) {
		//return bootNotificationService.bootDevice(id);
		return("Hello");
	}
}
