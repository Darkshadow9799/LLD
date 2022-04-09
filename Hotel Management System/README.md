# Hotel Management System Requirements:
>
* The system should support booking of different room types like standard, deluxe, etc.

* Guest should be able to search the room inventory and book any available room.

* The system should be able to retrive information such as who booked a particular room or what rooms are booked by a specifi user.

* The sustem should allow customers to cancel there booking and provide full refund if cancellation is happened within 24 hours of booking.

* The system should be able to send the notifications whenever booking is nearing the checkin or checkout.

* The system should maintain a room housekeeping logs to keep track of all housekeeping tasks.

* Any customer should be able to add room services and food items.

* The customer should be able to pay their bills throgh credit card, check or cash.

* Admin should be able to add, delete or edit a room.

* Receptionist should be able to checkin/checkout a guest.

# Design:

> class HMS:
- Int id;
- String hotelName;
- Location hotelLocation;
- List<Room> rooms;

> class Location:
- String street;
- String area;
- String city;
- String state;
- Int pin;

> class Room:
- Int roomNumber;
- RoomStyle roomStyle;
- RoomStatus roomStatus;
- Double roomPrice;
- List<RoomKey> roomKeys;
- List<HouseKeepingLog> HouseKeepingLogs;

> enum RoomStyle:
- DELUXE, STANDARD, FAMILY_SUITE;

> enum RoomStatus:
- RESERVED, AVAILABLE, NOT_AVAILABLE, OCCUPIED, SERVICE_IN_PROGRESS;

> class RoomKey:
- Int id;
- String barCode;
- Boolean active;
- Boolean masterKey;
- Date issuedAt;
+ void assignRoomKey(Room room);

> class HouseKeepingLog:
- Int id;
- Date updateDate;
- Int duration;
- Housekeeper housekeeper;
+ void addRoomHousekeepingLogs(Room room);

> interface Person:
- String name;
- Account accountDetail;
- String phone;
- String email;

> class Admin extends Person:
+ Boolean addRoom(Room room);
+ Boolean editRoom(Room room);
+ Boolean deleteRoom(Room room);