package ocpp.service;

import java.util.Date;

import ocpp.essential.Status;

public class ReserveNowService {
	 /*req()*/
    int connectorID; //Required. This contains the id of the connector to be reserved. A value of 0 means that the
                    //reservation is not for a specific connector.

    Date expiryDate; //Required. This contains the date and time when the reservation ends.

    String idTag; //Required. The identifier for which the Charge Point has to reserve a connector. Length<20

    String parentIdTag; //Optional. The parent idTag. Length<20

    int reservationId; //Required. Unique id for this reservation.

    /*conf()*/
    Status.Reservation status; //Required. This indicates the success or failure of the reservation.


}
