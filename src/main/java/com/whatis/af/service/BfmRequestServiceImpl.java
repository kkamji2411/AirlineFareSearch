package com.whatis.af.service;


import com.whatis.af.model.bargainfindermax.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sungji on 2017-06-01.
 */
@Service
public class BfmRequestServiceImpl implements BfmRequestService{
    @Autowired
    private TokenProvider tokenProvider;


    private OTAAirLowFareSearchRQ createLowFareSearchRQ(){
        OTAAirLowFareSearchRQ rq = new OTAAirLowFareSearchRQ();
   /*     rq.set
        rq.setTarget("Production");
        POSType posType = new POSType();
        SourceType sourceType = new SourceType();
        sourceType.setPseudoCityCode("F9CE");
        UniqueIDType uniqueIDType = new UniqueIDType();
        uniqueIDType.setType("1");
        sourceType.setRequestorID(uniqueIDType);

        posType.getSource().add(sourceType);
        rq.setPOS(posType);*/
        return rq;
    }

    @Override
    public BargainFinderMaxRequest generateRequest() {
        List<OriginDestinationInformation> originDestinationInfos = new ArrayList<>();
        OriginDestinationInformation odInfo = new OriginDestinationInformation()
                .withDepartureDateTime("2017-07-05T00:00:00")
                .withOriginLocation(new OriginLocation()
                        .withLocationCode("ICN"))
                .withDestinationLocation(new DestinationLocation()
                        .withLocationCode("NRT"))
                .withRPH("1");
        List<Source> sourceList = new ArrayList<>();
        Source source = new Source().withPseudoCityCode("F9CE")
                .withRequestorID(new RequestorID()
                        .withID("1")
                        .withType("1")
                        /*.withCompanyName(new CompanyName()
                                .withCode("TN"))*/);
        sourceList.add(source);
        POS pos = new POS()
                .withSource(sourceList);
        originDestinationInfos.add(odInfo);

        List<PassengerTypeQuantity> passengerTypeQuantities = new ArrayList<>();
        PassengerTypeQuantity ptQuantity = new PassengerTypeQuantity()
                .withCode("ADT")
                .withQuantity(1);
        passengerTypeQuantities.add(ptQuantity);
        List<AirTravelerAvail> airTravelerAvails = new ArrayList<>();
        AirTravelerAvail atAvail = new AirTravelerAvail()
                .withPassengerTypeQuantity(passengerTypeQuantities);
        airTravelerAvails.add(atAvail);
        BargainFinderMaxRequest request = new BargainFinderMaxRequest()
                .withOTAAirLowFareSearchRQ(new OTAAirLowFareSearchRQ()
                        .withOriginDestinationInformation(originDestinationInfos)
                        .withPOS(pos)
                        .withTPAExtensions(new TPAExtensions()
                                .withIntelliSellTransaction(new IntelliSellTransaction()
                                        .withRequestType(new RequestType()
                                                .withName("50ITINS"))))
                        .withTravelerInfoSummary(new TravelerInfoSummary()
                                .withAirTravelerAvail(airTravelerAvails)));

        return request;
    }
}
