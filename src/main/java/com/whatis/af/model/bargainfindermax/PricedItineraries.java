package com.whatis.af.model.bargainfindermax;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.whatis.af.model.instaflight.PricedItinerary;

import java.util.List;

public class PricedItineraries {

    @JsonProperty("PricedItinerary")
    private List<PricedItinerary> pricedItinerary;
}
