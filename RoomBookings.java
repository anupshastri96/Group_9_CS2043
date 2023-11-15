public class RoomBookings{
    private int bookingID;
    private int memberID;
    private boolean available;
    private boolean hasPC;
    private int rmNum;
    private int duration;
    public RoomBookings(int bookingID, int memberID, boolean available, boolean hasPC,int rmNum, int duration){
        this.bookingID=bookingID;
        this.memberID=memberID;
        this.available=available;
        this.hasPC=hasPC;
        this.rmNum=rmNum;
        this.duration=duration;
    }
    public int getBookingID() {
        return bookingID;
    }
    public void setBookingID(int bookingID) {
        this.bookingID = bookingID;
    }
    public int getMemberID() {
        return memberID;
    }
    public void setMemberID(int memberID) {
        this.memberID = memberID;
    }
    public boolean isAvailable() {
        return available;
    }
    public void setAvailable(boolean available) {
        this.available = available;
    }
    public boolean isHasPC() {
        return hasPC;
    }
    public void setHasPC(boolean hasPC) {
        this.hasPC = hasPC;
    }
    public int getRmNum() {
        return rmNum;
    }
    public void setRmNum(int rmNum) {
        this.rmNum = rmNum;
    }
    public int getDuration() {
        return duration;
    }
    public void setDuration(int duration) {
        this.duration = duration;
    }
    
}


