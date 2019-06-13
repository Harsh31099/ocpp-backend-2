package ocpp.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import ocpp.essential.IdTagInfo;
import ocpp.essential.Type;
@Controller
public class StopTransactionController {

	/*req()*/
	String idTag; /*Optional. This contains	the identifier which requested to stop the charging. It is optional
				 because a Charge Point may terminate charging without the presence of an idTag, e.g. in case of a
				 reset. A Charge Point	SHALL send the idTag if	known. Length<20.*/

	int meterStop; //Required. This contains the meter value in Wh for the connector at end	of the transaction.

	Date timestamp; //Required. This contains the date and time on which the transaction is stopped.

	int transactionId; //Required. This contains the transaction-id as received by the StartTransaction.conf.

	Type.Reason reason; /*Optional. This contains the reason why the transcation was stopped. MAY only be omitted
	                      when Reason is "Local"*/

	//MeterValue transactionData; //Optional. This contains transaction usage details relevvant for billing purposes.

	/*conf()*/
	IdTagInfo idTagInfo; /*Optional. This contains information about authorization status,expiry and parent id. It
						is optional because a transaction may have been stopped without an identifier.*/
	@Autowired
	//private StopService stopService;
	
	@RequestMapping(value="/stopTransaction",method=RequestMethod.POST)
	@ResponseBody
	public String stoptrans(@RequestParam("id") String id) {
		//return bootNotificationService.bootDevice(id);
		return ("Hello");
	}
}
