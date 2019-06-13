package ocpp.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import ocpp.essential.Status;

@Controller
public class ReserveNowController {
	 /*req()*/
    int connectorID; //Required. This contains the id of the connector to be reserved. A value of 0 means that the
                    //reservation is not for a specific connector.

    Date expiryDate; //Required. This contains the date and time when the reservation ends.

    String idTag; //Required. The identifier for which the Charge Point has to reserve a connector. Length<20

    String parentIdTag; //Optional. The parent idTag. Length<20

    int reservationId; //Required. Unique id for this reservation.

    /*conf()*/
    Status.Reservation status; //Required. This indicates the success or failure of the reservation.

	@Autowired
	//private ReserveNowService bootNotificationService;
	
	@RequestMapping(value="/reserveNow",method=RequestMethod.POST)
	@ResponseBody
	public String reserve(@RequestParam("id") String id) {
		//return bootNotificationService.bootDevice(id);
		return ("Hello");
	}
}
