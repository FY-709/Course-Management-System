package cn.tust.model;

public class TimetableKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column timetable.sNumber
     *
     * @mbg.generated Sun May 19 21:25:25 CST 2019
     */
    private Integer snumber;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column timetable.cNumber
     *
     * @mbg.generated Sun May 19 21:25:25 CST 2019
     */
    private Integer cnumber;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table timetable
     *
     * @mbg.generated Sun May 19 21:25:25 CST 2019
     */
    public TimetableKey(Integer snumber, Integer cnumber) {
        this.snumber = snumber;
        this.cnumber = cnumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table timetable
     *
     * @mbg.generated Sun May 19 21:25:25 CST 2019
     */
    public TimetableKey() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column timetable.sNumber
     *
     * @return the value of timetable.sNumber
     * @mbg.generated Sun May 19 21:25:25 CST 2019
     */
    public Integer getSnumber() {
        return snumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column timetable.sNumber
     *
     * @param snumber the value for timetable.sNumber
     * @mbg.generated Sun May 19 21:25:25 CST 2019
     */
    public void setSnumber(Integer snumber) {
        this.snumber = snumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column timetable.cNumber
     *
     * @return the value of timetable.cNumber
     * @mbg.generated Sun May 19 21:25:25 CST 2019
     */
    public Integer getCnumber() {
        return cnumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column timetable.cNumber
     *
     * @param cnumber the value for timetable.cNumber
     * @mbg.generated Sun May 19 21:25:25 CST 2019
     */
    public void setCnumber(Integer cnumber) {
        this.cnumber = cnumber;
    }
}