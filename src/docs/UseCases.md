# Functional Requirements and Business Rules - Flight Reservation Application

## Functional Requirements

1. **Passenger Registration**
- The application must allow passenger registration, storing information such as full name, CPF, date of birth, email, and passport (if necessary).

2. **Flight Registration**
- The application must allow flight registration, including information such as flight number, origin, destination, departure and arrival date and time, airline, and aircraft type.

3. **Flight Search**
- The application must allow users to search for flights based on criteria such as origin, destination, date, and time.

4. **Ticket Reservation**
- The application must allow airline ticket reservations, associating the passenger with the selected flight and allowing the selection of seats.

5. **Seat Management**
- The application must allow viewing and selection of available seats at the time of reservation.

6. **Payment Processing**
- The application must allow payment for tickets, offering options such as credit card, debit card and Pix.

7. **Ticket Issuance**
- The application must allow the issuance of tickets after payment confirmation.

8. **Reservation Changes and Cancellations**
- The application must allow the user to change or cancel a reservation, according to the rules of each airline.

9. **Online Check-in**
- The application must allow passengers to check in online from a certain period before the flight and select their seats, if allowed.

10. **Flight and Reservation Reports**
- The application must generate reports on flights taken, reservations made, and passengers boarded in a certain period.

## Business Rules

1. **Cancellation Policy**
- A reservation can only be canceled up to 24 hours before the flight. After this period, the airline may apply a cancellation fee or not allow cancellation.

2. **Change Fee**
- Flight changes (such as changing the date or time) may incur additional fees, depending on the type of ticket purchased by the passenger.

3. **Baggage Allowance**
- Each passenger is entitled to one carry-on bag of up to 10kg and one checked bag of up to 23kg. Excess baggage will result in additional fees.

4. **Preferred Seat Selection**
- Preferred seats (such as those located at emergency exits or at the front of the aircraft) may incur an additional fee, depending on the airline.

5. **Early Check-in**
- Online check-in can be done between 48 and 1 hour before flight departure. After this period, the passenger must check-in directly at the airline counter.

6. **Loyalty Points**
- Passengers registered in loyalty programs can accumulate points for each flight taken. Points can be exchanged for discounts or tickets on future flights.

7. **Group Reservations**
- For group reservations (more than 10 passengers), the application must allow special discounts and differentiated conditions.

8. **Ticket Refund**
- The refund of canceled tickets follows the airline's policies, and may be full or partial, depending on the type of ticket.

9. **Code Share Flight**
- If the flight is operated in a code share (performed by another airline), the application must notify the passenger at the time of booking.

## OOP Structure

In terms of OOP, the following classes can be used:

### Passenger
- **Attributes**: name, CPF, date of birth, email, passport, loyalty program.
- **Methods**: bookFlight(), cancelReservation(), performCheckin(), accumulatePoints().

### Flight
- **Attributes**: flightNumber, origin, destination, departureDate, arrivalDate, airline, aircraftType, seatList.
- **Methods**: checkAvailability(), addPassenger(), removePassenger(), changeSchedule().

### Reservation
- **Attributes**: id, passenger, flight, seat, status, value.
- **Methods**: confirmPayment(), issueTicket(), changeReservation(), cancelReservation().

### Seat
- **Attributes**: number, class, available, preferential.
- **Methods**: reserve(), release().

### Payment
- **Attributes**: id, value, paymentMethod, paymentStatus.
- **Methods**: processPayment(), checkStatus(), issueReceipt().