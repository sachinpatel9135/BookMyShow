class BookMyShow{
public:
    vector<CinemaHall> cinemas;
    vector<Movie> getMovies(Date date, string City);
    vector<CinemaHall> getCinemaHall(string City);
};

class CinemaHall{
public:
    int cinemaHallId;
    string cinemaHallName;
    Adress adress;
    vector<Audi> audiList;
    vector<Movie> getMovies(Date date, string City);
    vector<CinemaHall> getCinemaHall(string City);
};

class Adress{
public:
    int pinCode;
    string street;
    string city;
    string state;
    string country;
};

class Audi{
public:
    int audiId;
    string audiName;
    int totalSeats;
    vector<Show> shows;
};

class Show{
public:
    int showId;
    Movie movieId;
    Date startTime;
    Date endTime;

    CinemaHall cinemaPlayedAt;
    vector<Seat> seats;
};

class Seat{
public:
    int seatId;
    SeatType seatType;
    SeatStatus seatStatus;
    double price;
};

enum SeatType{
    DELUX, VIP, ECONOMY, OTHER;
};

enum SeatStatus{
    BOOKED, AVAILABLE, RESERVED, NOT_AVAILABLE;
};

class Movie{
public:
    int movieId;
    string MovieName;
    int duration;
    string language;
    Genre genre;
    map<string, vector<Show>> cityShowMap;
};

enum Genre{
    SCI_FI, DRAMA, ROM_COM, FANTASY;
};

class User{
public:
    int userId;
    Search searchObj;
};

class SystemMember: public User{
public:
    Account account;
    string name;
    string email;
    Adress adress;
};

class Member: public SystemMember{
public:
    Booking makeBooking(Booking booking);
    vector<Booking> getBooking();
};

class Admin: public SystemMember{
public:
    bool addMovie(Movie movie);
    bool addShow(Show show);
};

class account{
public:
    string userName;
    string password;
};

class Search{
public:
    vector<Movie> searchMovieByNames(string name);
    vector<Movie> searchMovieByGenre(Genre genre);
    vector<Movie> searchMovieByLanguage(string language);
    vector<Movie> searchMovieByDate(Date releaseDate);
};

class Booking{
public:
    int bookingId;
    Date bookingDate;
    Member member;
    Show show;
    Audi audi;
    BookingStatus bookingStatus;
    double amount;
    vector<Seat> seats;
    Payment paymentObj;

    bool makePayment(Payment payment);
};

enum BookinStatus{
    REQUESTED, PENDING, CONFIRMED, CANCELLED;
};

class Payment{
    double amount;
    Date paymentDate;
    int transactionId;
    PaymentStatus paymentStatus;
};

enum PaymentStatus{
    UNPAID, PENDING, COMPLETED, DECLINED, CANCELLED, REFUNDED;
};
