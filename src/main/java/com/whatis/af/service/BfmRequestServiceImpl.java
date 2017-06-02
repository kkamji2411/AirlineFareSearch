package com.whatis.af.service;

import com.whatis.af.model.BargainFinderMaxRequest;
import org.opentravel.ota._2003._05.*;
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
        rq.setTarget("Production");
        POSType posType = new POSType();
        SourceType sourceType = new SourceType();
        sourceType.setPseudoCityCode("F9CE");
        UniqueIDType uniqueIDType = new UniqueIDType();
        uniqueIDType.setType("1");
        sourceType.setRequestorID(uniqueIDType);

        posType.getSource().add(sourceType);
        rq.setPOS(posType);
        return rq;
    }

    @Override
    public BargainFinderMaxRequest generateRequest() {
        BargainFinderMaxRequest bargainFinderMaxRequest = new BargainFinderMaxRequest();
        //bargainFinderMaxRequest.setOTAAirLowFareSearchRQ();

        OTAAirLowFareSearchRQ otaAirLowFareSearchRQ = createLowFareSearchRQ();

        // 직항만 -> 다구간조회시 false
        //otaAirLowFareSearchRQ.setDirectFlightsOnly();
        // 가능좌석만 -> 다구간 조회시 true ( 안하면 스케줄이 열라많이 나올수 있음. )
        //otaAirLowFareSearchRQ.setAvailableFlightsOnly();

        List<OTAAirLowFareSearchRQ.OriginDestinationInformation> originDestinationInfos = new ArrayList<>();
        OTAAirLowFareSearchRQ.OriginDestinationInformation originDestinationInformation = new OTAAirLowFareSearchRQ.OriginDestinationInformation();

        // 출발지정보 셋팅
        OriginDestinationInformationType.OriginLocation originLocation = new OriginDestinationInformationType.OriginLocation();
        originLocation.setLocationCode("ICN");
        originLocation.setCodeContext(null);
        originDestinationInformation.setOriginLocation(originLocation);


        // 목적지정보 셋팅
        OriginDestinationInformationType.DestinationLocation destinationLocation = new OriginDestinationInformationType.DestinationLocation();
        destinationLocation.setLocationCode("NRT");
        destinationLocation.setCodeContext(null);
        originDestinationInformation.setDestinationLocation(destinationLocation);

        // 출발 귀국 시간
        originDestinationInformation.setDepartureDateTime("2017-07-15T00:00:00");
        originDestinationInformation.setArrivalDateTime("2017-07-20T00:00:00");




        // 여정 카운트
        originDestinationInformation.setRPH("1");


        //originDestinationInfos.add(originDestinationInformation);

        otaAirLowFareSearchRQ.getOriginDestinationInformation().add(originDestinationInformation);
        /*OriginDestinationInformation odInfo = new OriginDestinationInformation()
                .withDepartureDateTime("2015-10-05T00:00:00")
                .withOriginLocation(new OriginLocation()
                        .withLocationCode("LAX"))
                .withDestinationLocation(new DestinationLocation()
                        .withLocationCode("JFK"))
                .withRPH("1");*/
        /*List<Source> sourceList = new ArrayList<>();
        Source source = new Source()
                .withRequestorID(new RequestorID()
                        .withID("REQ.ID")
                        .withType("0.AAA.X")
                        .withCompanyName(new CompanyName()
                                .withCode("TN")));
        sourceList.add(source);*/
        //String tripType = "RT";


        // 여행자 정보
        TravelerInfoSummaryType travelerInfoSummaryType = new TravelerInfoSummaryType();
        TravelerInformationType travelerInformationType = new TravelerInformationType();
        AirTravelerType airTravelerType = new AirTravelerType();
        // 탑승객 숫자 셋팅
        PassengerTypeQuantityType passengerTypeQuantityType = new PassengerTypeQuantityType();
        passengerTypeQuantityType.setCode("ADT");
        passengerTypeQuantityType.setQuantity(1);

        airTravelerType.setPassengerTypeQuantity(passengerTypeQuantityType);
        travelerInformationType.setAirTraveler(airTravelerType);
        travelerInfoSummaryType.getAirTravelerAvail().add(travelerInformationType);
        otaAirLowFareSearchRQ.setTravelerInfoSummary(travelerInfoSummaryType);



        // 얘 뭐지
        /*TravelerInfoSummaryTPAExtensionsType travelerInfoSummaryTPAExtensionsType = new TravelerInfoSummaryTPAExtensionsType();
        TravelerInfoSummaryTPAExtensionsType.TravelerRating travelerRating = new TravelerInfoSummaryTPAExtensionsType.TravelerRating();
        travelerInfoSummaryTPAExtensionsType.getTravelerRating().add(travelerRating);*/

        //검색 옵션

        String tripTypeCode = "";
        AirSearchPrefsType airSearchPrefsType = new AirSearchPrefsType();
        AirSearchPrefsType.TPAExtensions tPAExtensions = new AirSearchPrefsType.TPAExtensions();
        AirSearchPrefsType.TPAExtensions.TripType tripType = new AirSearchPrefsType.TPAExtensions.TripType();
        AirTripType airTripType = AirTripType.fromValue("Return");

        tripType.setValue(airTripType);

        tPAExtensions.setTripType(tripType);

        airSearchPrefsType.setTPAExtensions(tPAExtensions);


        otaAirLowFareSearchRQ.setTravelPreferences(airSearchPrefsType);




        bargainFinderMaxRequest.setOTAAirLowFareSearchRQ(otaAirLowFareSearchRQ);
        return bargainFinderMaxRequest;
    }
}
