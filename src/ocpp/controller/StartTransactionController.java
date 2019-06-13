package ocpp.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import ocpp.essential.IdTagInfo;
@Controller

public class StartTransactionController {
	/*req()*/
	int connectorID; //Required. This identifies which connector of the charge point is used.

	String idTag; //Required. This contains identifier for which a transaction has to be started. Length<20

	int meterStart; //Required. This contains the meter value in Wh for the connector at start of the transaction.

	int reservationID; //Optional. This contains the id of the reservation that terminates as a result of
					  // this transaction

	Date timestamp; //Required. This contains the date and time on which the transaction is started.

	/*conf()*/
	IdTagInfo idTagInfo; //Required. This contains info about authorization status,expiry and parent ID

	int transactionId; //Required. This contains the transaction ID supplied by Central System.
	@Autowired
	//private StartTransactionService bootNotificationService;
	
	@RequestMapping(value="/startTransaction",method=RequestMethod.POST)
	@ResponseBody
	public String strtans(@RequestParam("id") String id) {
		//return bootNotificationService.bootDevice(id);
		return("HEllo");
	}
}
