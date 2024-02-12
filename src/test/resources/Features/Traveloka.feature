Feature: Traveloka Test - Wisnu
  Scenario: Traveloka Cars
    Given Select cars product
    And Select tab Without Driver
    And Select Pick-up Location "Jakarta"
    And Select Pick-up Date "14 Februari 2024" & Time "09:00"
    And Select Drop-off Date "15 Februari 2024" & Time "09:00"
    When Click button Search Car
    And Select Car
    And Select Car Provider
    And Select Pick-up Location in “Rental Office”
    And Select Drop-off Location in “Other Location”
    And Input Pick-up or Drop-off notes is optional "this is note"
    And Click button Book Now
    And Fill Pemesan details nama pemesan "wisnu qa" phone number "1234567890" and email "www@mail.com"
    And Fill Driver Details title "MR" nama lengkap "wisnu qa" and phone number "1234567890"
    And Click Continue
    And Add a special request "ganjil ya"
    And Check all rental requirements
    And Click Continue
    Then Select payment method and proceed payment